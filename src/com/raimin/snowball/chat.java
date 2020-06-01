package com.raimin.snowball;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;


public class chat implements Listener{

    private Main plugin;

    public chat(Main instance) {
        plugin = instance;
        instance.getLogger().info("§aSe ha cargado el §ochat");
    }

    @EventHandler
    public void onPlayerChat(AsyncPlayerChatEvent e) {
        e.setFormat("§b" + e.getPlayer().getName() + "§7: §f" + e.getMessage());
        if(e.getMessage().contains("Raimin21")){
            e.setMessage(e.getPlayer().getName()+"ha llamado a Raimin21");
        }
    }
    
    public void onDeath (PlayerDeathEvent e){
        //e.getEntity().getKiller()
        e.setDeathMessage("§cMUERTES§b " + e.getEntity().getName() + "§bha muerto a manos de " + e.getEntity());
    }
    
}
