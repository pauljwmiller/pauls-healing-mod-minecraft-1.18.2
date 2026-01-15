package com.paul.pauls_healing_mod.util;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;

public class HealingUtils {
    
    public static boolean drainHealth(Level level, Player player, float amount) {
        if (player.getHealth() < amount) return false; // on client and server
          
        if(!level.isClientSide) {
            player.setHealth(player.getHealth() - amount); // on server
        }

        return true; // on client and server
    }

    public static boolean addHealth(Level level, LivingEntity target, float amount) {
        if (target.getHealth() >= target.getMaxHealth()) return false;

        if (!level.isClientSide) {
            target.setHealth(Math.min(target.getHealth() + amount, target.getMaxHealth()));
        }

        return true;
    }
}
