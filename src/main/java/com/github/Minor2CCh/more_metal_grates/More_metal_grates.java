package com.github.Minor2CCh.more_metal_grates;

import net.fabricmc.api.ModInitializer;

public class More_metal_grates implements ModInitializer {
    public static final String MOD_ID = "more_metal_grates";

    @Override
    public void onInitialize() {
        mmg_item.initialize();
        mmg_block.initialize();
        mmg_ItemGroup.initialize();
    }

}