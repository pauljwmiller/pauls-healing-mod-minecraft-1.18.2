package com.paul.pauls_healing_mod.item;

import com.paul.pauls_healing_mod.creative.ModCreativeTab;
import net.minecraft.world.item.Item;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;



public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, "pauls_healing_mod");

    public static final RegistryObject<Item> SYRINGE =
            ITEMS.register("syringe",
                    () -> new Syringe(
                            new Item.Properties()
                                    .tab(ModCreativeTab.MYMOD_TAB)
                                    .stacksTo(16)
                    ));
    public static final RegistryObject<Item> SYRINGE_GOLD =
            ITEMS.register("syringe_gold",
                    () -> new Syringe(
                            new Item.Properties()
                                    .tab(ModCreativeTab.MYMOD_TAB)
                                    .stacksTo(16)
                    ));
    public static final RegistryObject<Item> SYRINGE_DIAMOND =
            ITEMS.register("syringe_diamond",
                    () -> new Syringe(
                            new Item.Properties()
                                    .tab(ModCreativeTab.MYMOD_TAB)
                                    .stacksTo(16)
                    ));
    public static final RegistryObject<Item> EMPTY_SYRINGE =
            ITEMS.register("empty_syringe",
                    () -> new EmptySyringe(
                            new Item.Properties()
                                    .tab(ModCreativeTab.MYMOD_TAB)
                                    .stacksTo(16)
                    ));

    public static final RegistryObject<Item> EMPTY_SYRINGE_GOLD =
            ITEMS.register("empty_syringe_gold",
                    () -> new EmptySyringeGold(
                            new Item.Properties()
                                    .tab(ModCreativeTab.MYMOD_TAB)
                                    .stacksTo(16)
                    ));

    public static final RegistryObject<Item> EMPTY_SYRINGE_DIAMOND =
            ITEMS.register("empty_syringe_diamond",
                    () -> new EmptySyringeDiamond(
                            new Item.Properties()
                                    .tab(ModCreativeTab.MYMOD_TAB)
                                    .stacksTo(16)
                    ));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
