package com.paul.mymod.item;

import com.paul.mymod.MyMod;
import com.paul.mymod.creative.ModCreativeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;



public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, "mymod");

    public static final RegistryObject<Item> SYRINGE =
            ITEMS.register("syringe",
                    () -> new Syringe(
                            new Item.Properties()
                                    .tab(ModCreativeTab.MYMOD_TAB)
                                    .stacksTo(16)
                    ));
    public static final RegistryObject<Item> EMPTY_SYRINGE =
            ITEMS.register("empty_syringe",
                    () -> new Empty_Syringe(
                            new Item.Properties()
                                    .tab(ModCreativeTab.MYMOD_TAB)
                                    .stacksTo(16)
                    ));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
