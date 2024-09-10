package com.github.Minor2CCh.more_metal_grates;

import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class mmg_block extends Blocks{
    public static final Block IRON_GRATE = register(
            new MetalGrateBlock(AbstractBlock.Settings.create()
                    .strength(5.0f, 6.0f)
                    .sounds(BlockSoundGroup.COPPER_GRATE)
                    .mapColor(MapColor.IRON_GRAY).nonOpaque().requiresTool().allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)),
            "iron_grate",
            true
    );
    public static final Block GOLD_GRATE = register(
            new MetalGrateBlock(AbstractBlock.Settings.create()
                    .strength(3.0f, 6.0f)
                    .sounds(BlockSoundGroup.COPPER_GRATE)
                    .mapColor(MapColor.GOLD).nonOpaque().requiresTool().allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)),
            "gold_grate",
            true
    );
    public static final Block LAPIS_GRATE = register(
            new MetalGrateBlock(AbstractBlock.Settings.create()
                    .strength(3.0f, 3.0f)
                    .sounds(BlockSoundGroup.COPPER_GRATE)
                    .mapColor(MapColor.LAPIS_BLUE).nonOpaque().requiresTool().allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)),
            "lapis_grate",
            true
    );
    public static final Block QUARTZ_GRATE = register(
            new MetalGrateBlock(AbstractBlock.Settings.create()
                    .strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.COPPER_GRATE)
                    .mapColor(MapColor.WHITE).nonOpaque().requiresTool().allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)),
            "quartz_grate",
            true
    );
    public static final Block SMOOTH_QUARTZ_GRATE = register(
            new MetalGrateBlock(AbstractBlock.Settings.create()
                    .strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.COPPER_GRATE)
                    .mapColor(MapColor.WHITE).nonOpaque().requiresTool().allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)),
            "smooth_quartz_grate",
            true
    );
    public static final Block AMETHYST_GRATE = register(
            new MetalGrateBlock(AbstractBlock.Settings.create()
                    .strength(1.5f, 1.5f)
                    .sounds(BlockSoundGroup.AMETHYST_CLUSTER)
                    .mapColor(MapColor.PURPLE).nonOpaque().requiresTool().allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)),
            "amethyst_grate",
            true
    );
    public static final Block REDSTONE_GRATE = register(
            new RedStoneGrateBlock(AbstractBlock.Settings.create()
                    .strength(5f, 6f)
                    .sounds(BlockSoundGroup.COPPER_GRATE)
                    .mapColor(MapColor.RED).nonOpaque().requiresTool().allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)),
            "redstone_grate",
            true
    );
    public static final Block DIAMOND_GRATE = register(
            new MetalGrateBlock(AbstractBlock.Settings.create()
                    .strength(5f, 6f)
                    .sounds(BlockSoundGroup.COPPER_GRATE)
                    .mapColor(MapColor.DIAMOND_BLUE).nonOpaque().requiresTool().allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)),
            "diamond_grate",
            true
    );
    public static final Block EMERALD_GRATE = register(
            new MetalGrateBlock(AbstractBlock.Settings.create()
                    .strength(5f, 6f)
                    .sounds(BlockSoundGroup.COPPER_GRATE)
                    .mapColor(MapColor.EMERALD_GREEN).nonOpaque().requiresTool().allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)),
            "emerald_grate",
            true
    );
    public static final Block NETHERITE_GRATE = register(
            new MetalGrateBlock(AbstractBlock.Settings.create()
                    .strength(50f, 1200f)
                    .sounds(BlockSoundGroup.NETHERITE)
                    .mapColor(MapColor.GRAY).nonOpaque().requiresTool().allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never)),
            "netherite_grate",
            true
    );










    public static Block register(Block block, String name, boolean shouldRegisterItem) {
        Identifier id = Identifier.of(More_metal_grates.MOD_ID, name);
        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }

        return Registry.register(Registries.BLOCK, id, block);

    }
    public static void initialize() {
    }
}
