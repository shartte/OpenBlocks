package openblocks.client.renderer.entity;

import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.entity.RenderPlayer;
import openblocks.common.entity.EntityHangGlider;

import org.lwjgl.opengl.GL11;

public class EntityPlayerRenderer extends RenderPlayer {

  // TODO: Unsure if rotateCorpse == rotatePlayer
	@Override
	protected void rotateCorpse(AbstractClientPlayer player, float par2, float par3, float par4) {
		super.rotateCorpse(player, par2, par3, par4);
		if (!EntityHangGlider.isPlayerOnGround(player)) {
			player.limbSwing = 0f;
			player.prevLimbSwingAmount = 0f;
			player.limbSwingAmount = 0f;
			GL11.glRotatef(75, -1, 0, 0);
		}
	}
}
