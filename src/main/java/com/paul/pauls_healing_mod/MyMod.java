package com.paul.pauls_healing_mod;

import com.paul.pauls_healing_mod.item.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.IEventBus;

@Mod(MyMod.MODID)
public class MyMod {

    public static final String MODID = "pauls_healing_mod";

    public MyMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(bus);
    }
}
