package com.paul.pauls_healing_mod.item.base;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import com.paul.pauls_healing_mod.util.HealingUtils;

public class BaseSyringe extends Item {

    private final float healAmount;
    private final int cooldownTicks;

    public BaseSyringe(Properties properties, float healAmount, int cooldownTicks) {
        super(properties);
        this.healAmount = healAmount;
        this.cooldownTicks = cooldownTicks;
    }

    @Override
    public InteractionResult interactLivingEntity(ItemStack stack, Player player, LivingEntity target, InteractionHand hand) {
        if (HealingUtils.addHealth(player.level, target, healAmount)) {
            if (!player.getAbilities().instabuild) {
                stack.shrink(1);
            }
            player.getCooldowns().addCooldown(this, cooldownTicks);
        }
        return InteractionResult.SUCCESS;
    }
}
