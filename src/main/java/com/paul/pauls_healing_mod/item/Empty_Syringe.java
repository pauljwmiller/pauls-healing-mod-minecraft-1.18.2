package com.paul.pauls_healing_mod.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import com.paul.pauls_healing_mod.util.HealingUtils;

public class Empty_Syringe extends Item {
    public Empty_Syringe(Item.Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(
            Level level,
            Player player,
            InteractionHand hand) 
    {

        ItemStack stack = player.getItemInHand(hand);

        if (HealingUtils.drainHealth(player.level, player, 2.0F)) {

            if (!player.getAbilities().instabuild) {
                stack.shrink(1);
            }
                player.getCooldowns().addCooldown(this, 20);

                    return InteractionResultHolder.sidedSuccess(stack, level.isClientSide);
        }

        return InteractionResultHolder.pass(stack);
    }
}