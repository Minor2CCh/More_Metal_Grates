package com.github.Minor2CCh.more_metal_grates;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;

public final class RedStoneGrateBlock extends MetalGrateBlock {
    public RedStoneGrateBlock(Settings settings) {
        super(settings);
    }
    protected boolean emitsRedstonePower(BlockState state) {
        return true;
    }

    @Override
    protected int getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
        return 15;
    }
}