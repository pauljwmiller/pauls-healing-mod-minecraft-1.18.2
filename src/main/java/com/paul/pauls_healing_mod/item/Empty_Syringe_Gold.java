// package com.paul.pauls_healing_mod.item;

// import net.minecraft.world.InteractionHand;
// import net.minecraft.world.InteractionResultHolder;
// import net.minecraft.world.entity.player.Player;
// import net.minecraft.world.item.Item;
// import net.minecraft.world.item.ItemStack;

// public class Empty_Syringe_Gold extends Item {
//     public Empty_Syringe_Gold(Item.Properties properties) {
//         super(properties);
//     }
    
//     @Override
//     public InteractionResultHolder<ItemStack> use(
//         Level level,
//         Player player,
//         InteractionHand hand) {

//         ItemStack stack = player.getItemInHand(hand);

//         if (!level.isClientSide) {
//             float HealAmount = 6.0F;
//             if (player.getHealth() >= HealAmount) {
//                 player.setHealth(player.getHealth() - HealAmount);
//         }
//         }
//     )
// }
