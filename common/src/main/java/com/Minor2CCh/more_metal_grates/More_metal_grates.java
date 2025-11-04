package com.Minor2CCh.more_metal_grates;

import com.Minor2CCh.more_metal_grates.platform.IPlatform;
import com.Minor2CCh.more_metal_grates.registry.MMGBlocks;
import com.Minor2CCh.more_metal_grates.registry.MMGCreativeModeTab;
import com.Minor2CCh.more_metal_grates.registry.MMGItems;
import com.Minor2CCh.more_metal_grates.registry.MMGSoundEvents;
import net.minecraft.resources.ResourceLocation;

public final class More_metal_grates {
    public static final String MOD_ID = "more_metal_grates";
    public static IPlatform PLATFORM;

    public static void init(IPlatform platform) {
        PLATFORM = platform;
        MMGSoundEvents.init();
        MMGBlocks.init();
        MMGItems.init();
        MMGCreativeModeTab.init();
    }
    public static ResourceLocation of(String id){
        return new ResourceLocation(MOD_ID, id);
    }
}
