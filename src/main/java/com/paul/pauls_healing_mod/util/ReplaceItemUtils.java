package com.paul.pauls_healing_mod.util;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.InteractionHand;

public class ReplaceItemUtils {

    public static boolean replaceWithItem(Level level, Player player, ItemStack stack, InteractionHand hand, Item replacementItem) {
        if (level.isClientSide) return false; // server only

        ItemStack replacement = new ItemStack(replacementItem);

        if (stack.isEmpty()) {
            player.setItemInHand(hand, replacement);
        } else if (!player.getInventory().add(replacement)) {
            player.drop(replacement, false);
        }

        return true;
    }
}