package it.laFox.firstPl;

import it.laFox.firstPl.listeners.XPBottleBreakListener;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.ChatPaginator;

import java.awt.*;

public final class FirstPl extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("[FirstPl] Plugin enabled");

        getServer().getPluginManager().registerEvents(this, this);
        getServer().getPluginManager().registerEvents( new XPBottleBreakListener(), this);
    }

    /**
     * Player Welcome Message
     * @param e PlayerJoin event
     */
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){

        Player p = e.getPlayer();

        e.setJoinMessage(ChatColor.BLUE + "Welcome to the server " + p.getDisplayName());

        p.sendTitle(ChatColor.BLUE + "WELCOME", ChatColor.AQUA + "ON THE SERVER", 0, 90, 45);

    }

}
