package com.github.Minor2CCh.more_metal_grates;

import com.github.Minor2CCh.more_metal_grates.config.ModConfigLoader;
import net.fabricmc.api.ModInitializer;

public class More_metal_grates implements ModInitializer {
    public static final String MOD_ID = "more_metal_grates";

    @Override
    public void onInitialize() {
        ModConfigLoader.load();
        mmg_block.initialize();
        mmg_ItemGroup.initialize();
    }

}