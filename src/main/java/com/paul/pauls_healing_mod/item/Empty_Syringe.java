package com.paul.pauls_healing_mod.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class Empty_Syringe extends Item {
    public Empty_Syringe(Item.Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(
            Level level,
            Player player,
            InteractionHand hand) {

        ItemStack stack = player.getItemInHand(hand);

        if (!level.isClientSide) {
            player.setHealth(player.getHealth() - 2.0F);
            stack.shrink(1);
            player.getCooldowns().addCooldown(this, 20);

            ItemStack replacement = new ItemStack(ModItems.SYRINGE.get());

            if (stack.isEmpty()) {
                player.setItemInHand(hand, replacement);
            } else {
                if (!player.getInventory().add(replacement)) {
                    player.drop(replacement, false);
                }
            }
        }
        return InteractionResultHolder.sidedSuccess(player.getItemInHand(hand), level.isClientSide);
    }
}
