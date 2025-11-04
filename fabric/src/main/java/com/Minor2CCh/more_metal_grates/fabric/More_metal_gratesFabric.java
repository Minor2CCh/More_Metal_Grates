package com.Minor2CCh.more_metal_grates.fabric;

import com.Minor2CCh.more_metal_grates.More_metal_grates;
import com.Minor2CCh.more_metal_grates.fabric.platform.FabricPlatform;
import net.fabricmc.api.ModInitializer;

public final class More_metal_gratesFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        More_metal_grates.init(new FabricPlatform());
    }
}
