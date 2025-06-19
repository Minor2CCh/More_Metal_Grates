package com.Minor2CCh.more_metal_grates;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.function.Supplier;


public class ModBlocks {
    public static final DeferredBlock<Block> IRON_GRATE =
            registerBlock("iron_grate",
                    () -> new WaterloggedTransparentBlock(BlockBehaviour.Properties.of()
                            .strength(5.0F, 6.0F)
                            .sound(SoundType.COPPER_GRATE)
                            .mapColor(MapColor.METAL)
                            .noOcclusion()
                            .requiresCorrectToolForDrops()
                            .isValidSpawn(Blocks::never)
                            .isRedstoneConductor(ModBlocks::never)
                            .isSuffocating(ModBlocks::never)
                            .isViewBlocking(ModBlocks::never)
                    ), new Item.Properties());
    public static final DeferredBlock<Block> GOLD_GRATE =
            registerBlock("gold_grate",
                    () -> new WaterloggedTransparentBlock(BlockBehaviour.Properties.of()
                            .strength(3.0F, 6.0F)
                            .sound(SoundType.COPPER_GRATE)
                            .mapColor(MapColor.GOLD)
                            .noOcclusion()
                            .requiresCorrectToolForDrops()
                            .isValidSpawn(Blocks::never)
                            .isRedstoneConductor(ModBlocks::never)
                            .isSuffocating(ModBlocks::never)
                            .isViewBlocking(ModBlocks::never)
                    ), new Item.Properties());
    public static final DeferredBlock<Block> LAPIS_GRATE =
            registerBlock("lapis_grate",
                    () -> new WaterloggedTransparentBlock(BlockBehaviour.Properties.of()
                            .strength(3.0F, 3.0F)
                            .sound(SoundType.COPPER_GRATE)
                            .mapColor(MapColor.LAPIS)
                            .noOcclusion()
                            .requiresCorrectToolForDrops()
                            .isValidSpawn(Blocks::never)
                            .isRedstoneConductor(ModBlocks::never)
                            .isSuffocating(ModBlocks::never)
                            .isViewBlocking(ModBlocks::never)
                    ), new Item.Properties());
    public static final DeferredBlock<Block> QUARTZ_GRATE =
            registerBlock("quartz_grate",
                    () -> new WaterloggedTransparentBlock(BlockBehaviour.Properties.of()
                            .strength(2.0F, 6.0F)
                            .sound(SoundType.COPPER_GRATE)
                            .mapColor(MapColor.QUARTZ)
                            .noOcclusion()
                            .requiresCorrectToolForDrops()
                            .isValidSpawn(Blocks::never)
                            .isRedstoneConductor(ModBlocks::never)
                            .isSuffocating(ModBlocks::never)
                            .isViewBlocking(ModBlocks::never)
                    ), new Item.Properties());
    public static final DeferredBlock<Block> SMOOTH_QUARTZ_GRATE =
            registerBlock("smooth_quartz_grate",
                    () -> new WaterloggedTransparentBlock(BlockBehaviour.Properties.of()
                            .strength(2.0F, 6.0F)
                            .sound(SoundType.COPPER_GRATE)
                            .mapColor(MapColor.QUARTZ)
                            .noOcclusion()
                            .requiresCorrectToolForDrops()
                            .isValidSpawn(Blocks::never)
                            .isRedstoneConductor(ModBlocks::never)
                            .isSuffocating(ModBlocks::never)
                            .isViewBlocking(ModBlocks::never)
                    ), new Item.Properties());
    public static final DeferredBlock<Block> AMETHYST_GRATE =
            registerBlock("amethyst_grate",
                    () -> new WaterloggedTransparentBlock(BlockBehaviour.Properties.of()
                            .strength(1.5F, 1.5F)
                            .sound(SoundType.AMETHYST_CLUSTER)
                            .mapColor(MapColor.COLOR_PURPLE)
                            .noOcclusion()
                            .requiresCorrectToolForDrops()
                            .isValidSpawn(Blocks::never)
                            .isRedstoneConductor(ModBlocks::never)
                            .isSuffocating(ModBlocks::never)
                            .isViewBlocking(ModBlocks::never)
                    ), new Item.Properties());
    public static final DeferredBlock<Block> REDSTONE_GRATE =
            registerBlock("redstone_grate",
                    () -> new RedStoneGrateBlock(BlockBehaviour.Properties.of()
                            .strength(5.0F, 6.0F)
                            .sound(SoundType.COPPER_GRATE)
                            .mapColor(MapColor.FIRE)
                            .noOcclusion()
                            .requiresCorrectToolForDrops()
                            .isValidSpawn(Blocks::never)
                            .isRedstoneConductor(ModBlocks::never)
                            .isSuffocating(ModBlocks::never)
                            .isViewBlocking(ModBlocks::never)
                    ), new Item.Properties());
    public static final DeferredBlock<Block> EMERALD_GRATE =
            registerBlock("emerald_grate",
                    () -> new WaterloggedTransparentBlock(BlockBehaviour.Properties.of()
                            .strength(5F, 6.0F)
                            .sound(SoundType.COPPER_GRATE)
                            .mapColor(MapColor.EMERALD)
                            .noOcclusion()
                            .requiresCorrectToolForDrops()
                            .isValidSpawn(Blocks::never)
                            .isRedstoneConductor(ModBlocks::never)
                            .isSuffocating(ModBlocks::never)
                            .isViewBlocking(ModBlocks::never)
                    ), new Item.Properties());
    public static final DeferredBlock<Block> DIAMOND_GRATE =
            registerBlock("diamond_grate",
                    () -> new WaterloggedTransparentBlock(BlockBehaviour.Properties.of()
                            .strength(5F, 6.0F)
                            .sound(SoundType.COPPER_GRATE)
                            .mapColor(MapColor.DIAMOND)
                            .noOcclusion()
                            .requiresCorrectToolForDrops()
                            .isValidSpawn(Blocks::never)
                            .isRedstoneConductor(ModBlocks::never)
                            .isSuffocating(ModBlocks::never)
                            .isViewBlocking(ModBlocks::never)
                    ), new Item.Properties());
    public static final DeferredBlock<Block> NETHERITE_GRATE =
            registerBlock("netherite_grate",
                    () -> new WaterloggedTransparentBlock(BlockBehaviour.Properties.of()
                            .strength(50.0F, 1200.0F)
                            .sound(SoundType.NETHERITE_BLOCK)
                            .mapColor(MapColor.COLOR_BLACK)
                            .noOcclusion()
                            .requiresCorrectToolForDrops()
                            .isValidSpawn(Blocks::never)
                            .isRedstoneConductor(ModBlocks::never)
                            .isSuffocating(ModBlocks::never)
                            .isViewBlocking(ModBlocks::never)
                    ), new Item.Properties().fireResistant());
    public static void initialize(){

    }
    private static boolean never(BlockState p_50806_, BlockGetter p_50807_, BlockPos p_50808_) {
        return false;
    }
    private static <T extends Block> DeferredBlock<T> registerBlock(String idPath, Supplier<T> block, Item.Properties itemProperties) {
        DeferredBlock<T> result = More_metal_grates.BLOCKS.register(idPath, block);
        More_metal_grates.ITEMS.register(idPath,
                () -> new BlockItem(result.get(), itemProperties));
        return result;
    }
}
