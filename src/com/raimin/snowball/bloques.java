/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raimin.snowball;

import jdk.nashorn.internal.ir.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

/**
 *
 * @author joser
 */
public class bloques implements Listener{
    private Main plugin;

    public bloques(Main instance) {
        plugin = instance;
    }
    
//ESTO ESTÁ SIN TERMINAR (REMPLAZAR LOS BLOQUES)
    public void onBlockPlace(BlockPlaceEvent e){
       // e.getBlock().getX()
       Block block = (Block) e.getBlock();
       //Material material = block.getType();
       Player p = e.getPlayer();
    }
//HASTA AQUÍ adasdasd
    
}
