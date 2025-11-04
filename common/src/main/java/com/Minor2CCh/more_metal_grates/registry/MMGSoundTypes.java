package com.Minor2CCh.more_metal_grates.registry;

import com.Minor2CCh.more_metal_grates.More_metal_grates;
import net.minecraft.world.level.block.SoundType;

public class MMGSoundTypes {
    public static final SoundType COPPER_GRATE = More_metal_grates.PLATFORM.registerSoundType(1.0f, 1.0f, MMGSoundEvents.COPPER_GRATE_BREAK, MMGSoundEvents.COPPER_GRATE_STEP, MMGSoundEvents.COPPER_GRATE_PLACE, MMGSoundEvents.COPPER_GRATE_HIT, MMGSoundEvents.COPPER_GRATE_FALL);
}
