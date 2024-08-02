package it.laFox.firstPl.listeners;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class XPBottleBreakListener implements Listener {

    @EventHandler
    public void onBottleBreak(PlayerInteractEvent event) {

        Block block = event.getClickedBlock();
        block.breakNaturally();

    }

}
