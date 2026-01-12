package com.paul.pauls_healing_mod.creative;

import com.paul.pauls_healing_mod.MyMod;
import com.paul.pauls_healing_mod.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab {

    public static final CreativeModeTab MYMOD_TAB = new CreativeModeTab(MyMod.MODID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SYRINGE.get());
        }
    };

}
