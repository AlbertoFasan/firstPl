package it.laFox.firstPl;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class FirstPl extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("[FirstPl] Plugin enabled.");

        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e){ // Removed the extra parameters Player & String
        Player p = e.getPlayer();
        e.setJoinMessage(null);
        Bukkit.broadcastMessage("&e&l" + p.getDisplayName() + "&bJoin Server"); //I would recommend doing 'p.getName();' instead of 'p'
        Bukkit.getServer().getLogger().info(p.getDisplayName() + "join server");
        p.sendMessage("&aWelcome to Server");
    }

}
