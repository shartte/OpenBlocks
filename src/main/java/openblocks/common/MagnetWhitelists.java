package openblocks.common;

import cpw.mods.fml.common.eventhandler.Event;
import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.tileentity.*;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import openmods.utils.*;
import openmods.utils.ObjectTester.ClassNameTester;
import openmods.utils.ObjectTester.ClassTester;

public class MagnetWhitelists {
	public final static MagnetWhitelists instance = new MagnetWhitelists();

	private MagnetWhitelists() {}

	public final ObjectTester<Entity> entityWhitelist = ObjectTester.create();
	public final ObjectTester<Block> blockWhitelist = ObjectTester.create();
	public final ObjectTester<TileEntity> tileEntityWhitelist = ObjectTester.create();

	public static class WhitelistRegisterEvent<T> extends Event {
		protected final ObjectTester<T> tester;

		protected WhitelistRegisterEvent(ObjectTester<T> tester) {
			this.tester = tester;
		}

		public void addClass(Class<? extends T> cls) {
			tester.addTester(new ClassTester<T>(cls));
		}

		public void addClassNames(Class<? extends T>... cls) {
			tester.addTester(new ClassNameTester<T>().addClasses(cls));
		}

		public void addClassNames(String... names) {
			tester.addTester(new ClassNameTester<T>().addClasses(names));
		}
	}

	public static class EntityRegisterEvent extends
			WhitelistRegisterEvent<Entity> {
		protected EntityRegisterEvent(ObjectTester<Entity> tester) {
			super(tester);
		}
	}

	public static class BlockRegisterEvent extends
			WhitelistRegisterEvent<Block> {
		protected BlockRegisterEvent(ObjectTester<Block> tester) {
			super(tester);
		}
	}

	public static class TileEntityRegisterEvent extends
			WhitelistRegisterEvent<TileEntity> {
		protected TileEntityRegisterEvent(ObjectTester<TileEntity> tester) {
			super(tester);
		}
	}

	public void initTesters() {
		entityWhitelist.addTester(new ClassTester<Entity>(EntityItem.class));
		entityWhitelist.addTester(new ClassTester<Entity>(EntityBoat.class));
		entityWhitelist.addTester(new ClassTester<Entity>(EntityMinecart.class));
		MinecraftForge.EVENT_BUS.post(new EntityRegisterEvent(entityWhitelist));

		blockWhitelist.addTester(new ITester<Block>() {
			@Override
			public Result test(World world, int x, int y, int z, Block o) {
				return (o.getBlockHardness(world, x, y, z) < 0)? Result.REJECT : Result.CONTINUE;
			}
		});

		blockWhitelist.addTester(new ITester<Block>() {
			@Override
			public openmods.utils.ITester.Result test(World world, int x, int y, int z, Block o) {
				return o.getRenderType() == 0? Result.ACCEPT : Result.CONTINUE;
			}
		});

		blockWhitelist.addTester(new ClassTester<Block>(BlockSand.class));
		blockWhitelist.addTester(new ClassTester<Block>(BlockStairs.class));
		blockWhitelist.addTester(new ClassTester<Block>(BlockFence.class));
		blockWhitelist.addTester(new ClassTester<Block>(BlockFenceGate.class));
		blockWhitelist.addTester(new ClassTester<Block>(BlockCactus.class));
		MinecraftForge.EVENT_BUS.post(new BlockRegisterEvent(blockWhitelist));

		tileEntityWhitelist.addTester(new ClassTester<TileEntity>(TileEntityBeacon.class)).addTester(new ClassTester<TileEntity>(TileEntityBrewingStand.class)).addTester(new ClassTester<TileEntity>(TileEntityChest.class)).addTester(new ClassTester<TileEntity>(TileEntityCommandBlock.class)).addTester(new ClassTester<TileEntity>(TileEntityDispenser.class)).addTester(new ClassTester<TileEntity>(TileEntityEnchantmentTable.class)).addTester(new ClassTester<TileEntity>(TileEntityEnderChest.class)).addTester(new ClassTester<TileEntity>(TileEntityFurnace.class)).addTester(new ClassTester<TileEntity>(TileEntityHopper.class)).addTester(new ClassTester<TileEntity>(TileEntityNote.class)).addTester(new ClassTester<TileEntity>(BlockJukebox.TileEntityJukebox.class));
	}

	public boolean testBlock(World world, int x, int y, int z) {
		Block block = world.getBlock(x, y, z);

		if (block == null) return false;

		if (block instanceof BlockContainer) {
			TileEntity te = world.getTileEntity(x, y, z);
			return (te != null) && tileEntityWhitelist.check(world, x, y, z, te);
		}

		return blockWhitelist.check(world, x, y, z, block);
	}
}
