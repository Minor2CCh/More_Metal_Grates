package com.Minor2CCh.more_metal_grates.registry;

import com.Minor2CCh.more_metal_grates.More_metal_grates;
import net.minecraft.sounds.SoundEvent;

import java.util.function.Supplier;

public class MMGSoundEvents {
    public static final Supplier<SoundEvent> COPPER_GRATE_BREAK = registerSound("block.more_metal_grates.copper_grate.break");
    public static final Supplier<SoundEvent> COPPER_GRATE_STEP = registerSound("block.more_metal_grates.copper_grate.step");
    public static final Supplier<SoundEvent> COPPER_GRATE_PLACE = registerSound("block.more_metal_grates.copper_grate.place");
    public static final Supplier<SoundEvent> COPPER_GRATE_HIT = registerSound("block.more_metal_grates.copper_grate.hit");
    public static final Supplier<SoundEvent> COPPER_GRATE_FALL = registerSound("block.more_metal_grates.copper_grate.fall");
    private static Supplier<SoundEvent> registerSound(String id){
        return More_metal_grates.PLATFORM.soundRegister(id);
    }
    public static void init(){
    }
}
