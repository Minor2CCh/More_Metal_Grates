package com.github.Minor2CCh.more_metal_grates.mixin.compat;

import com.github.Minor2CCh.more_metal_grates.config.ModConfigLoader;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import me.lukasabbe.coppergratesbubblethru.tags.ModBlockTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.GrateBlock;
import net.minecraft.state.property.Properties;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(ModBlockTags.class)
public class CGBBlockTagsMixin {
    @ModifyReturnValue(method = "isAWaterLoggedCopperGrates", at = @At("RETURN"))
    private static boolean isAWaterLoggedGratesEnable(boolean original, BlockState state){
        return original
                || ModConfigLoader.getConfig().compatCopperGratesBubble &&
                (state.getBlock() instanceof GrateBlock) && state.contains(Properties.WATERLOGGED) && state.get(Properties.WATERLOGGED);
    }
}
