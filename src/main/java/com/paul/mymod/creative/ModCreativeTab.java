package com.paul.mymod.creative;

import com.paul.mymod.MyMod;
import com.paul.mymod.item.ModItems;
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
