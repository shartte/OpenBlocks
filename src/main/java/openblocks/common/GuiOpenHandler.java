package openblocks.common;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerOpenContainerEvent;
import openblocks.OpenBlocks.Items;

public class GuiOpenHandler {

	@SubscribeEvent
	public void onGuiOpen(PlayerOpenContainerEvent event) {
		// TODO: this shouldn't allow EVERYTHING. need to find a way
		// to only allow ones that are actually valid.
		// could be tricky, as Container doesn't know about
		// Block/tile/location/anything
		if (event.entityPlayer != null) {
			ItemStack held = event.entityPlayer.getHeldItem();
			if (held != null && held.getItem() != null && held.getItem().equals(Items.cursor)) {
				event.setResult(Result.ALLOW);
			}
		}
		// System.out.println("Opened GUI " + event.entityPlayer.openContainer);
	}
}
