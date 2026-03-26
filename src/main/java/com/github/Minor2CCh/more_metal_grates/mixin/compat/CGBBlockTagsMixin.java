package com.github.Minor2CCh.more_metal_grates.mixin.compat;

import com.github.Minor2CCh.more_metal_grates.config.ModConfigLoader;
import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import me.lukasabbe.coppergratesbubblethru.tags.ModBlockTags;
import net.minecraft.world.level.block.WaterloggedTransparentBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(ModBlockTags.class)
public class CGBBlockTagsMixin {
    @ModifyReturnValue(method = "isAWaterLoggedCopperGrates", at = @At("RETURN"))
    private static boolean isAWaterLoggedGratesEnable(boolean original, BlockState state){
        return original
                || ModConfigLoader.getConfig().compatCopperGratesBubble &&
                (state.getBlock() instanceof WaterloggedTransparentBlock) && state.hasProperty(BlockStateProperties.WATERLOGGED) && state.getValue(BlockStateProperties.WATERLOGGED);
    }
}
