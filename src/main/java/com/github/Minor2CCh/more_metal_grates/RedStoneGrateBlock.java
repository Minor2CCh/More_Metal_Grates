package com.github.Minor2CCh.more_metal_grates;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.WaterloggedTransparentBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import org.jspecify.annotations.NonNull;

public final class RedStoneGrateBlock extends WaterloggedTransparentBlock {
    public RedStoneGrateBlock(BlockBehaviour.Properties settings) {
        super(settings);
    }
    @Override
    protected boolean isSignalSource(@NonNull BlockState state) {
        return true;
    }

    @Override
    protected int getSignal(final @NonNull BlockState state, final @NonNull BlockGetter level, final @NonNull BlockPos pos, final @NonNull Direction direction) {
        return 15;
    }
}