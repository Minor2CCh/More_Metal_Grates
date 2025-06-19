package com.Minor2CCh.more_metal_grates;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.WaterloggedTransparentBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class RedStoneGrateBlock extends WaterloggedTransparentBlock {
    public RedStoneGrateBlock(Properties p_313902_) {
        super(p_313902_);
    }
    @Override
    protected boolean isSignalSource(@NotNull BlockState p_55213_) {
        return true;
    }

    @Override
    protected int getSignal(@NotNull BlockState p_55208_, @NotNull BlockGetter p_55209_, @NotNull BlockPos p_55210_, @NotNull Direction p_55211_) {
        return 15;
    }
}
