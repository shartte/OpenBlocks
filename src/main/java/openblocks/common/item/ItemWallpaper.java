package openblocks.common.item;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import openblocks.Config;
import openblocks.OpenBlocks;
import openblocks.common.block.BlockCanvas;
import openblocks.common.tileentity.TileEntityCanvas;
import openmods.utils.BlockUtils;
import openmods.utils.ItemUtils;
import openmods.utils.render.PaintUtils;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemWallpaper extends Item {

	public static class BlockSideTexture {

		public static final String TAG_BLOCK_ID = "blockId";
		public static final String TAG_BLOCK_META = "blockMeta";
		public static final String TAG_BLOCK_SIDE = "blockSide";

		private Block block;
		private int blockMeta;
		private int blockSide;

		public BlockSideTexture(Block block, int meta, int side) {
			block = block;
			blockMeta = meta;
			blockSide = side;
		}

		public IIcon getIcon() {
			Block block = getBlock();
			if (block != null) { return block.getIcon(blockSide, blockMeta); }
			return null;
		}

		public Block getBlock() {
			return block;
		}

		public static BlockSideTexture fromItemStack(ItemStack stack) {

			if (stack.hasTagCompound()) {

				NBTTagCompound tag = ItemUtils.getItemTag(stack);

				if (tag.hasKey(TAG_BLOCK_ID) &&
						tag.hasKey(TAG_BLOCK_META) &&
						tag.hasKey(TAG_BLOCK_SIDE)) {

				return new BlockSideTexture(
            (Block) Block.blockRegistry.getObject(tag.getString(TAG_BLOCK_ID)),
						tag.getInteger(TAG_BLOCK_META),
						tag.getInteger(TAG_BLOCK_SIDE)); }
			}
			return null;
		}

		public void writeToStack(ItemStack stack) {
			NBTTagCompound tag = ItemUtils.getItemTag(stack);
			tag.setString(TAG_BLOCK_ID, Block.blockRegistry.getNameForObject(block));
			tag.setInteger(TAG_BLOCK_META, blockMeta);
			tag.setInteger(TAG_BLOCK_SIDE, blockSide);
		}

		public int getBlockMeta() {
			return blockMeta;
		}

		public int getBlockSide() {
			return blockSide;
		}

		public String getTranslatedSide() {
			return StatCollector.translateToLocal("openblocks.misc.side." + ForgeDirection.getOrientation(blockSide).name().toLowerCase());
		}

		public String getBlockName() {
			Block block = getBlock();
			if (block != null) { return block.getLocalizedName(); }
			return "Unknown block";
		}
	}

	public ItemWallpaper() {

		setHasSubtypes(true);
		setCreativeTab(OpenBlocks.tabOpenBlocks);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getSpriteNumber() {
		return 0;
	}

	@Override
	public IIcon getIcon(ItemStack stack, int pass) {
		return getIconIndex(stack);
	}

	@Override
	public IIcon getIconIndex(ItemStack stack) {
		BlockSideTexture texture = BlockSideTexture.fromItemStack(stack);
		if (texture != null) { return texture.getIcon(); }
		return OpenBlocks.Blocks.canvas.wallpaper;
	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
		BlockSideTexture texture = BlockSideTexture.fromItemStack(stack);
		if (texture != null) {
			list.add(texture.getTranslatedSide());
			list.add(texture.getBlockName());
		}
	}

	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {

		int hitSide = side;

		TileEntity te = world.getTileEntity(x, y, z);

		boolean canReplaceBlock = PaintUtils.instance.isAllowedToReplace(world, x, y, z);

		if (canReplaceBlock || te instanceof TileEntityCanvas) {

			BlockSideTexture texture = BlockSideTexture.fromItemStack(stack);

			if (texture != null) {

				if (canReplaceBlock) {
					BlockCanvas.replaceBlock(world, x, y, z);
				}

				te = world.getTileEntity(x, y, z);

				if (te instanceof TileEntityCanvas) {

					stack.stackSize--;
				}

			} else if (!world.isRemote) {

				Block block = world.getBlock(x, y, z);
				int meta = world.getBlockMetadata(x, y, z);

				if (te instanceof TileEntityCanvas) {

					TileEntityCanvas canvas = (TileEntityCanvas)te;

					canvas.getLayersForSide(side);

					// blockId = layer.getBaseTextureBlockId();
					// meta = layer.getBaseTextureMetadata();
					// side = layer.getBaseTextureSide();

					if (block == Blocks.air) {
						block = (Block) Block.blockRegistry.getObject(canvas.paintedBlockId.getValue());
						meta = canvas.paintedBlockMeta.getValue();
						side = hitSide;
					}
				}

				texture = new BlockSideTexture(block, meta, side);

				ItemStack cloneStack = stack.copy();
				cloneStack.stackSize = 1;
				texture.writeToStack(cloneStack);

				if (player == null || !player.inventory.addItemStackToInventory(cloneStack)) {
					BlockUtils.dropItemStackInWorld(world, hitX + x, y, z, cloneStack);
				} else {
					if (player instanceof EntityPlayerMP) {
						MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
						server.getConfigurationManager().syncPlayerInventory((EntityPlayerMP)player);
					}
				}

				stack.stackSize--;
			}
		}
		return true;
	}

}
