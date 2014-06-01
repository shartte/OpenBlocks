package openblocks.common.entity;

import java.lang.reflect.Field;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import openmods.Log;

public class EntityTorchArrow extends EntityArrow {

	private Field ticksInGroundField = null;

	public EntityTorchArrow(World worldObj, EntityPlayer player, float f) {
		super(worldObj, player, f);
	}

	public int getTicksInGround() {
		if (ticksInGroundField == null) {
			try {
				ticksInGroundField = this.getClass().getField("ticksInGround");
				ticksInGroundField.setAccessible(true);
			} catch (Exception e) {
				Log.warn(e, "Field missing?");
			}
		}
		if (ticksInGroundField != null) {
			try {
				return (Integer)ticksInGroundField.get(this);
			} catch (Exception e) {
				Log.warn(e, "Field missing?");
			}
		}
		return 1;
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		if (getTicksInGround() == 1) {
			int closestX = (int)Math.round(posX);
			int closestY = (int)Math.round(posY);
			int closestZ = (int)Math.round(posZ);
			if (worldObj.isAirBlock(closestX, closestY, closestZ)) {
				if (shootingEntity != null
						&& shootingEntity instanceof EntityPlayer) {
					EntityPlayer player = (EntityPlayer)shootingEntity;
					if (player.inventory.hasItem(Item.getItemFromBlock(Blocks.torch))) {
						player.inventory.consumeInventoryItem(Item.getItemFromBlock(Blocks.torch));
						worldObj.setBlock(closestX, closestY, closestZ, Blocks.torch);
						setDead();
					}
				}
			}
		}
	}

}
