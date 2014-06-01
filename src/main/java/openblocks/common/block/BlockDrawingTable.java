package openblocks.common.block;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraftforge.common.util.ForgeDirection;
import openblocks.Config;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDrawingTable extends OpenBlock {

	IIcon topIcon, frontIcon;

	public BlockDrawingTable() {
		super(Material.wood);
		setRotationMode(BlockRotationMode.FOUR_DIRECTIONS);
	}

	@Override
	public boolean shouldRenderBlock() {
		return true;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister registry) {
		super.registerBlockIcons(registry);
		this.topIcon = registry.registerIcon("openblocks:drawingtable_top");
		this.frontIcon = registry.registerIcon("openblocks:drawingtable_front");
		setTexture(ForgeDirection.UP, topIcon);
		setTexture(ForgeDirection.DOWN, blockIcon);
		setTexture(ForgeDirection.EAST, blockIcon);
		setTexture(ForgeDirection.WEST, blockIcon);
		setTexture(ForgeDirection.NORTH, blockIcon);
		setTexture(ForgeDirection.SOUTH, frontIcon);
		setDefaultTexture(blockIcon);
	}
}
