package com.github.Minor2CCh.more_metal_grates.client;

import com.github.Minor2CCh.more_metal_grates.mmg_block;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class More_metal_gratesClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutoutMipped(),
                mmg_block.IRON_GRATE,
                mmg_block.GOLD_GRATE,
                mmg_block.LAPIS_GRATE,
                mmg_block.QUARTZ_GRATE,
                mmg_block.SMOOTH_QUARTZ_GRATE,
                mmg_block.AMETHYST_GRATE,
                mmg_block.REDSTONE_GRATE,
                mmg_block.DIAMOND_GRATE,
                mmg_block.EMERALD_GRATE,
                mmg_block.NETHERITE_GRATE
        );

    }
}
