package com.Minor2CCh.more_metal_grates.fabric.client;

import com.Minor2CCh.more_metal_grates.registry.MMGBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;

public final class More_metal_gratesFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderType.cutoutMipped(),
                MMGBlocks.IRON_GRATE.get(),
                MMGBlocks.GOLD_GRATE.get(),
                MMGBlocks.LAPIS_GRATE.get(),
                MMGBlocks.QUARTZ_GRATE.get(),
                MMGBlocks.SMOOTH_QUARTZ_GRATE.get(),
                MMGBlocks.AMETHYST_GRATE.get(),
                MMGBlocks.REDSTONE_GRATE.get(),
                MMGBlocks.EMERALD_GRATE.get(),
                MMGBlocks.DIAMOND_GRATE.get(),
                MMGBlocks.NETHERITE_GRATE.get());
    }
}
