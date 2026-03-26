package com.github.Minor2CCh.more_metal_grates.registry;

import com.github.Minor2CCh.more_metal_grates.MoreMetalGrates;
import com.github.Minor2CCh.more_metal_grates.RedStoneGrateBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.WaterloggedTransparentBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

public class MMGBlocks {
    public static final Block IRON_GRATE = register(
            "iron_grate",
            WaterloggedTransparentBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)
                    .sound(SoundType.COPPER_GRATE)
                    .noOcclusion()
                    .requiresCorrectToolForDrops()
                    .isValidSpawn(Blocks::never)
                    .isRedstoneConductor(Blocks::never)
                    .isSuffocating(Blocks::never)
                    .isViewBlocking(Blocks::never),
            defaultItemProperties()
    );
    public static final Block GOLD_GRATE = register(
            "gold_grate",
            WaterloggedTransparentBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_BLOCK)
                    .sound(SoundType.COPPER_GRATE)
                    .noOcclusion()
                    .requiresCorrectToolForDrops()
                    .isValidSpawn(Blocks::never)
                    .isRedstoneConductor(Blocks::never)
                    .isSuffocating(Blocks::never)
                    .isViewBlocking(Blocks::never),
            defaultItemProperties()
    );

    public static final Block LAPIS_GRATE = register(
            "lapis_grate",
            WaterloggedTransparentBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_BLOCK)
                    .sound(SoundType.COPPER_GRATE)
                    .noOcclusion()
                    .requiresCorrectToolForDrops()
                    .isValidSpawn(Blocks::never)
                    .isRedstoneConductor(Blocks::never)
                    .isSuffocating(Blocks::never)
                    .isViewBlocking(Blocks::never),
            defaultItemProperties()
    );
    public static final Block QUARTZ_GRATE = register(
            "quartz_grate",
            WaterloggedTransparentBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_BLOCK)
                    .sound(SoundType.COPPER_GRATE)
                    .strength(2.0F, 6.0F)
                    .noOcclusion()
                    .requiresCorrectToolForDrops()
                    .isValidSpawn(Blocks::never)
                    .isRedstoneConductor(Blocks::never)
                    .isSuffocating(Blocks::never)
                    .isViewBlocking(Blocks::never),
            defaultItemProperties()
    );
    public static final Block SMOOTH_QUARTZ_GRATE = register(
            "smooth_quartz_grate",WaterloggedTransparentBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_QUARTZ)
                    .sound(SoundType.COPPER_GRATE)
                    .noOcclusion()
                    .requiresCorrectToolForDrops()
                    .isValidSpawn(Blocks::never)
                    .isRedstoneConductor(Blocks::never)
                    .isSuffocating(Blocks::never)
                    .isViewBlocking(Blocks::never),
            defaultItemProperties()
    );
    public static final Block AMETHYST_GRATE = register(
            "amethyst_grate",WaterloggedTransparentBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.AMETHYST_BLOCK)
                    .sound(SoundType.AMETHYST_CLUSTER)
                    .noOcclusion()
                    .requiresCorrectToolForDrops()
                    .isValidSpawn(Blocks::never)
                    .isRedstoneConductor(Blocks::never)
                    .isSuffocating(Blocks::never)
                    .isViewBlocking(Blocks::never),
            defaultItemProperties()
    );
    public static final Block REDSTONE_GRATE = register(
            "redstone_grate", RedStoneGrateBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_BLOCK)
                    .sound(SoundType.COPPER_GRATE)
                    .noOcclusion()
                    .requiresCorrectToolForDrops()
                    .isValidSpawn(Blocks::never)
                    .isRedstoneConductor(Blocks::never)
                    .isSuffocating(Blocks::never)
                    .isViewBlocking(Blocks::never),
            defaultItemProperties()
    );
    public static final Block DIAMOND_GRATE = register(
            "diamond_grate",WaterloggedTransparentBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_BLOCK)
                    .sound(SoundType.COPPER_GRATE)
                    .noOcclusion()
                    .requiresCorrectToolForDrops()
                    .isValidSpawn(Blocks::never)
                    .isRedstoneConductor(Blocks::never)
                    .isSuffocating(Blocks::never)
                    .isViewBlocking(Blocks::never),
            defaultItemProperties()
    );
    public static final Block EMERALD_GRATE = register(
            "emerald_grate",WaterloggedTransparentBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_BLOCK)
                    .sound(SoundType.COPPER_GRATE)
                    .noOcclusion()
                    .requiresCorrectToolForDrops()
                    .isValidSpawn(Blocks::never)
                    .isRedstoneConductor(Blocks::never)
                    .isSuffocating(Blocks::never)
                    .isViewBlocking(Blocks::never),
            defaultItemProperties()
    );
    public static final Block NETHERITE_GRATE = register(
            "netherite_grate",WaterloggedTransparentBlock::new,
            BlockBehaviour.Properties.ofFullCopy(Blocks.NETHERITE_BLOCK)
                    .sound(SoundType.NETHERITE_BLOCK)
                    .noOcclusion()
                    .requiresCorrectToolForDrops()
                    .isValidSpawn(Blocks::never)
                    .isRedstoneConductor(Blocks::never)
                    .isSuffocating(Blocks::never)
                    .isViewBlocking(Blocks::never),
            defaultItemProperties()
    );
    private static Block register(String name, Function<BlockBehaviour.Properties, Block> blockFactory, BlockBehaviour.Properties blockProperties, Item.Properties itemProperties) {
        ResourceKey<Block> blockKey = keyOfBlock(name);
        Block block = blockFactory.apply(blockProperties.setId(blockKey));
        ResourceKey<Item> itemKey = keyOfItem(name);
        Registry.register(BuiltInRegistries.ITEM, itemKey, new BlockItem(block, itemProperties.setId(itemKey)));

        return Registry.register(BuiltInRegistries.BLOCK, blockKey, block);
    }

    private static ResourceKey<Block> keyOfBlock(String name) {
        return ResourceKey.create(Registries.BLOCK, MoreMetalGrates.of(name));
    }

    private static ResourceKey<Item> keyOfItem(String name) {
        return ResourceKey.create(Registries.ITEM, MoreMetalGrates.of(name));
    }
    private static Item.Properties defaultItemProperties() {
        return new Item.Properties();
    }
    public static void initialize() {
    }
}
