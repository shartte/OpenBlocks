package openblocks.common.block;

import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import openblocks.Config;

public class BlockHeal extends OpenBlock {

	public BlockHeal() {
		super(Material.rock);
	}

	@Override
	public boolean shouldRenderBlock() {
		return true;
	}

  @Override
  public boolean canBeReplacedByLeaves(IBlockAccess world, int x, int y, int z) {
    return false;
  }

  @Override
  public boolean isFlammable(IBlockAccess world, int x, int y, int z, ForgeDirection face) {
    return false;
  }

}
