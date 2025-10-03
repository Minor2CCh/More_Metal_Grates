package com.github.Minor2CCh.more_metal_grates.config;

public class ModConfig {
    public Boolean compatCopperGratesBubble = true;
    public void fillDefaults() {
        if (compatCopperGratesBubble == null)
            compatCopperGratesBubble = true;
    }
}
