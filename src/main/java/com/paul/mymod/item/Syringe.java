package com.paul.mymod.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class Syringe extends Item {

    public Syringe(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult interactLivingEntity(
            ItemStack stack,
            Player player,
            LivingEntity target,
            InteractionHand hand) {

        if (!player.level.isClientSide) {

            if (target.getHealth() < target.getMaxHealth()) {
                target.setHealth(Math.min(target.getHealth() + 2.0F, target.getMaxHealth()));

                stack.shrink(1);

                player.getCooldowns().addCooldown(this, 20);
            }
        }
        return InteractionResult.SUCCESS;
    }
}
