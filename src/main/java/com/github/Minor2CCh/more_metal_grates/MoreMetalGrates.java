package com.github.Minor2CCh.more_metal_grates;

import com.github.Minor2CCh.more_metal_grates.config.ModConfigLoader;
import com.github.Minor2CCh.more_metal_grates.registry.MMGCreativeModeTabs;
import com.github.Minor2CCh.more_metal_grates.registry.MMGBlocks;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class MoreMetalGrates implements ModInitializer {
    public static final String MOD_ID = "more_metal_grates";
    public static final Logger LOGGER = (Logger) LogManager.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModConfigLoader.load();
        MMGBlocks.initialize();
        MMGCreativeModeTabs.initialize();
    }
    public static Identifier of(String path) {
        return Identifier.fromNamespaceAndPath(MoreMetalGrates.MOD_ID, path);
    }

}