package com.Minor2CCh.more_metal_grates.forge;

import com.Minor2CCh.more_metal_grates.More_metal_grates;
import com.Minor2CCh.more_metal_grates.forge.platform.ForgePlatform;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(More_metal_grates.MOD_ID)
public final class More_metal_gratesForge {
    public More_metal_gratesForge() {
        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        More_metal_grates.init(new ForgePlatform());
        ForgePlatform.registryInit(modEventBus);
    }
}
