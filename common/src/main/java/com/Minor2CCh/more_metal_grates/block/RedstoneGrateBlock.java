package com.Minor2CCh.more_metal_grates.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;

@SuppressWarnings("deprecation")
public class RedstoneGrateBlock extends GrateBlock{
    public RedstoneGrateBlock(Properties properties) {
        super(properties);
    }
    @Override
    public boolean isSignalSource(BlockState blockState) {
        return true;
    }

    @Override
    public int getSignal(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, Direction direction) {
        return 15;
    }
}
