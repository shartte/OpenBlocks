package openblocks.common.block;

import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import openblocks.OpenBlocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockLadder extends BlockTrapDoor {

	public BlockLadder() {
		super(Material.wood);
		setHardness(3.0F);
		setStepSound(Blocks.log.stepSound);
		setCreativeTab(OpenBlocks.tabOpenBlocks);
		setBlockBounds(0f, 0f, 0f, 1.5f, 1f, 1.5f);
	}

	@Override
	public void registerBlockIcons(IIconRegister registry) {
		blockIcon = registry.registerIcon("openblocks:ladder");
	}

	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
		setBlockBoundsBasedOnState(par1World, par2, par3, par4);
		return super.getCollisionBoundingBoxFromPool(par1World, par2, par3, par4);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public AxisAlignedBB getSelectedBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
		setBlockBoundsBasedOnState(par1World, par2, par3, par4);
		return super.getSelectedBoundingBoxFromPool(par1World, par2, par3, par4);
	}

	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4) {
    // TODO: Obfuscated method: was setBlockBoundsForBlockRender
    func_150117_b(par1IBlockAccess.getBlockMetadata(par2, par3, par4));
	}

  // TODO: Obfuscated method: was setBlockBoundsForBlockRender
	@Override
	public void func_150117_b(int par1) {

		float f = 0.125F;

		if ((par1 & 8) != 0) {
			setBlockBounds(0.0F, 1.0F - f, 0.0F, 1.0F, 1.0F, 1.0F);
		} else {
			setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, f, 1.0F);
		}

    // TODO: Obfuscated method, was: isTrapdoorOpen
		if (func_150118_d(par1)) {
			if ((par1 & 3) == 0) {
				setBlockBounds(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
			}

			if ((par1 & 3) == 1) {
				setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
			}

			if ((par1 & 3) == 2) {
				setBlockBounds(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
			}

			if ((par1 & 3) == 3) {
				setBlockBounds(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
			}
		}
	}

	@Override
	public boolean isLadder(IBlockAccess world, int x, int y, int z, EntityLivingBase entity) {
		return true;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public int getRenderType() {
		return 0;
	}
}
