package com.paul.pauls_healing_mod.item.base;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import com.paul.pauls_healing_mod.util.HealingUtils;

public class BaseEmptySyringe extends Item {

    private final float drainAmount;
    private final int cooldownTicks;

    public BaseEmptySyringe(Properties properties, float drainAmount, int cooldownTicks) {
        super(properties);
        this.drainAmount = drainAmount;
        this.cooldownTicks = cooldownTicks;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(
            Level level,
            Player player,
            InteractionHand hand) 
    {

        ItemStack stack = player.getItemInHand(hand);

        if (HealingUtils.drainHealth(player.level, player, drainAmount)) {

            if (!player.getAbilities().instabuild) {
                stack.shrink(1);
            }
                player.getCooldowns().addCooldown(this, cooldownTicks);

                    return InteractionResultHolder.sidedSuccess(stack, level.isClientSide);
        }

        return InteractionResultHolder.pass(stack);
    }
}