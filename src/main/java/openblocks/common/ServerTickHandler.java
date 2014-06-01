package openblocks.common;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import openblocks.enchantments.FlimFlamEnchantmentsHandler;
import cpw.mods.fml.common.FMLCommonHandler;

public class ServerTickHandler {

	private static final int MAP_UPDATE_DELAY = 10;
	private int mapUpdateCount;

  @SubscribeEvent
  public void onTickEvent(TickEvent tickEvent) {

    switch (tickEvent.type) {
      case PLAYER:
        EntityPlayer player = ((TickEvent.PlayerTickEvent) tickEvent).player;
        if (player instanceof EntityPlayerMP)
          FlimFlamEnchantmentsHandler.deliverKarma((EntityPlayerMP)player);
        break;
      case SERVER:
        if (mapUpdateCount++ > MAP_UPDATE_DELAY) {
          mapUpdateCount = 0;
          MinecraftServer server = FMLCommonHandler.instance().getMinecraftServerInstance();
          if (server != null && server.isServerRunning()) {
            MapDataManager.instance.sendUpdates(server);
          }
        }
        break;
    }

  }

}
