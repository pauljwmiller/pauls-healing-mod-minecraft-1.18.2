package com.paul.pauls_healing_mod.item;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import com.paul.pauls_healing_mod.util.HealingUtils;

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

        if (HealingUtils.addHealth(player.level, target, 2.0F)) {

            if (!player.getAbilities().instabuild) { // Not creative mode, etc.
                player.getCooldowns().addCooldown(this, 10); // 0.5 sec
            }
        }
        return InteractionResult.SUCCESS;
    }
}
