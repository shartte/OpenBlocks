package openblocks.client;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.world.World;
import openblocks.common.entity.EntityHangGlider;

public class ClientTickHandler {

	private static int ticks = 0;

  @SubscribeEvent
  public void onTickEvent(TickEvent tickEvent) {

    if (tickEvent.phase != TickEvent.Phase.START)
      return;

    switch (tickEvent.type) {
      case CLIENT:
        clientTick();
        break;
      case RENDER:
        if (Minecraft.getMinecraft().theWorld != null) {
          TickEvent.RenderTickEvent renderTickEvent = (TickEvent.RenderTickEvent) tickEvent;
          preRenderTick(Minecraft.getMinecraft(), Minecraft.getMinecraft().theWorld, renderTickEvent.renderTickTime);
        }
        break;
    }

  }

	public void preRenderTick(Minecraft mc, World world, float renderTick) {
		EntityHangGlider.updateGliders(world);
	}

	public void clientTick() {
		if (SoundEventsManager.isPlayerWearingGlasses()) {
			SoundEventsManager.instance.tickUpdate();
		}
		ticks++;
	}

	public static int getTicks() {
		return ticks;
	}
}
