package com.Minor2CCh.more_metal_grates.registry;

import com.Minor2CCh.more_metal_grates.More_metal_grates;
import com.Minor2CCh.more_metal_grates.block.GrateBlock;
import com.Minor2CCh.more_metal_grates.block.RedstoneGrateBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;

import java.util.function.Supplier;

public class MMGBlocks {
    public static final Supplier<Block> IRON_GRATE =
            registerBlock("iron_grate",
                    () -> new GrateBlock(BlockBehaviour.Properties.of()
                            .strength(5.0F, 6.0F)
                            .sound(MMGSoundTypes.COPPER_GRATE)
                            .mapColor(MapColor.METAL)
                            .noOcclusion()
                            .requiresCorrectToolForDrops()
                            .isValidSpawn(MMGBlocks::never)
                            .isRedstoneConductor(MMGBlocks::never)
                            .isSuffocating(MMGBlocks::never)
                            .isViewBlocking(MMGBlocks::never)
                    ));
    public static final Supplier<Block> GOLD_GRATE =
            registerBlock("gold_grate",
                    () -> new GrateBlock(BlockBehaviour.Properties.of()
                            .strength(3.0F, 6.0F)
                            .sound(MMGSoundTypes.COPPER_GRATE)
                            .mapColor(MapColor.GOLD)
                            .noOcclusion()
                            .requiresCorrectToolForDrops()
                            .isValidSpawn(MMGBlocks::never)
                            .isRedstoneConductor(MMGBlocks::never)
                            .isSuffocating(MMGBlocks::never)
                            .isViewBlocking(MMGBlocks::never)
                    ));
    public static final Supplier<Block> LAPIS_GRATE =
            registerBlock("lapis_grate",
                    () -> new GrateBlock(BlockBehaviour.Properties.of()
                            .strength(3.0F, 3.0F)
                            .sound(MMGSoundTypes.COPPER_GRATE)
                            .mapColor(MapColor.LAPIS)
                            .noOcclusion()
                            .requiresCorrectToolForDrops()
                            .isValidSpawn(MMGBlocks::never)
                            .isRedstoneConductor(MMGBlocks::never)
                            .isSuffocating(MMGBlocks::never)
                            .isViewBlocking(MMGBlocks::never)
                    ));
    public static final Supplier<Block> QUARTZ_GRATE =
            registerBlock("quartz_grate",
                    () -> new GrateBlock(BlockBehaviour.Properties.of()
                            .strength(2.0F, 6.0F)
                            .sound(MMGSoundTypes.COPPER_GRATE)
                            .mapColor(MapColor.QUARTZ)
                            .noOcclusion()
                            .requiresCorrectToolForDrops()
                            .isValidSpawn(MMGBlocks::never)
                            .isRedstoneConductor(MMGBlocks::never)
                            .isSuffocating(MMGBlocks::never)
                            .isViewBlocking(MMGBlocks::never)
                    ));
    public static final Supplier<Block> SMOOTH_QUARTZ_GRATE =
            registerBlock("smooth_quartz_grate",
                    () -> new GrateBlock(BlockBehaviour.Properties.of()
                            .strength(2.0F, 6.0F)
                            .sound(MMGSoundTypes.COPPER_GRATE)
                            .mapColor(MapColor.QUARTZ)
                            .noOcclusion()
                            .requiresCorrectToolForDrops()
                            .isValidSpawn(MMGBlocks::never)
                            .isRedstoneConductor(MMGBlocks::never)
                            .isSuffocating(MMGBlocks::never)
                            .isViewBlocking(MMGBlocks::never)
                    ));
    public static final Supplier<Block> AMETHYST_GRATE =
            registerBlock("amethyst_grate",
                    () -> new GrateBlock(BlockBehaviour.Properties.of()
                            .strength(1.5F, 1.5F)
                            .sound(SoundType.AMETHYST_CLUSTER)
                            .mapColor(MapColor.COLOR_PURPLE)
                            .noOcclusion()
                            .requiresCorrectToolForDrops()
                            .isValidSpawn(MMGBlocks::never)
                            .isRedstoneConductor(MMGBlocks::never)
                            .isSuffocating(MMGBlocks::never)
                            .isViewBlocking(MMGBlocks::never)
                    ));
    public static final Supplier<Block> REDSTONE_GRATE =
            registerBlock("redstone_grate",
                    () -> new RedstoneGrateBlock(BlockBehaviour.Properties.of()
                            .strength(5.0F, 6.0F)
                            .sound(MMGSoundTypes.COPPER_GRATE)
                            .mapColor(MapColor.FIRE)
                            .noOcclusion()
                            .requiresCorrectToolForDrops()
                            .isValidSpawn(MMGBlocks::never)
                            .isRedstoneConductor(MMGBlocks::never)
                            .isSuffocating(MMGBlocks::never)
                            .isViewBlocking(MMGBlocks::never)
                    ));
    public static final Supplier<Block> EMERALD_GRATE =
            registerBlock("emerald_grate",
                    () -> new GrateBlock(BlockBehaviour.Properties.of()
                            .strength(5F, 6.0F)
                            .sound(MMGSoundTypes.COPPER_GRATE)
                            .mapColor(MapColor.EMERALD)
                            .noOcclusion()
                            .requiresCorrectToolForDrops()
                            .isValidSpawn(MMGBlocks::never)
                            .isRedstoneConductor(MMGBlocks::never)
                            .isSuffocating(MMGBlocks::never)
                            .isViewBlocking(MMGBlocks::never)
                    ));
    public static final Supplier<Block> DIAMOND_GRATE =
            registerBlock("diamond_grate",
                    () -> new GrateBlock(BlockBehaviour.Properties.of()
                            .strength(5F, 6.0F)
                            .sound(MMGSoundTypes.COPPER_GRATE)
                            .mapColor(MapColor.DIAMOND)
                            .noOcclusion()
                            .requiresCorrectToolForDrops()
                            .isValidSpawn(MMGBlocks::never)
                            .isRedstoneConductor(MMGBlocks::never)
                            .isSuffocating(MMGBlocks::never)
                            .isViewBlocking(MMGBlocks::never)
                    ));
    public static final Supplier<Block> NETHERITE_GRATE =
            registerBlock("netherite_grate",
                    () -> new GrateBlock(BlockBehaviour.Properties.of()
                            .strength(50.0F, 1200.0F)
                            .sound(SoundType.NETHERITE_BLOCK)
                            .mapColor(MapColor.COLOR_BLACK)
                            .noOcclusion()
                            .requiresCorrectToolForDrops()
                            .isValidSpawn(MMGBlocks::never)
                            .isRedstoneConductor(MMGBlocks::never)
                            .isSuffocating(MMGBlocks::never)
                            .isViewBlocking(MMGBlocks::never)
                    ));
    private static boolean never(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos) {
        return false;
    }
    private static Boolean never(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, EntityType<?> entityType) {
        return false;
    }
    private static <T extends Block> Supplier<T> registerBlock(String id, Supplier<T> block){
        return More_metal_grates.PLATFORM.blockRegister(id, block);
    }
    public static void init(){
    }
}
