package com.github.Minor2CCh.more_metal_grates;

import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class mmg_block{
    public static final Block IRON_GRATE = register(
            "iron_grate",
            GrateBlock::new,
            AbstractBlock.Settings.create().strength(5.0f, 6.0f)
                    .sounds(BlockSoundGroup.COPPER_GRATE)
                    .mapColor(MapColor.IRON_GRAY).nonOpaque().requiresTool().allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never),
            true,
            false
    );
    public static final Block GOLD_GRATE = register(
            "gold_grate",
            GrateBlock::new,
            AbstractBlock.Settings.create().strength(3.0f, 6.0f)
                    .sounds(BlockSoundGroup.COPPER_GRATE)
                    .mapColor(MapColor.GOLD).nonOpaque().requiresTool().allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never),
            true,
            false
    );

    public static final Block LAPIS_GRATE = register(
            "lapis_grate",GrateBlock::new,
            AbstractBlock.Settings.create()
                    .strength(3.0f, 3.0f)
                    .sounds(BlockSoundGroup.COPPER_GRATE)
                    .mapColor(MapColor.LAPIS_BLUE).nonOpaque().requiresTool().allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never),

            true, false
    );
    public static final Block QUARTZ_GRATE = register(
            "quartz_grate",GrateBlock::new,
            AbstractBlock.Settings.create()
                    .strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.COPPER_GRATE)
                    .mapColor(MapColor.WHITE).nonOpaque().requiresTool().allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never),

            true, false
    );
    public static final Block SMOOTH_QUARTZ_GRATE = register(
            "smooth_quartz_grate",GrateBlock::new, AbstractBlock.Settings.create()
                    .strength(2.0f, 6.0f)
                    .sounds(BlockSoundGroup.COPPER_GRATE)
                    .mapColor(MapColor.WHITE).nonOpaque().requiresTool().allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never),

            true, false
    );
    public static final Block AMETHYST_GRATE = register(
            "amethyst_grate",GrateBlock::new, AbstractBlock.Settings.create()
                    .strength(1.5f, 1.5f)
                    .sounds(BlockSoundGroup.AMETHYST_CLUSTER)
                    .mapColor(MapColor.PURPLE).nonOpaque().requiresTool().allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never),

            true, false
    );
    public static final Block REDSTONE_GRATE = register(
            "redstone_grate",RedStoneGrateBlock::new, AbstractBlock.Settings.create()
                    .strength(5f, 6f)
                    .sounds(BlockSoundGroup.COPPER_GRATE)
                    .mapColor(MapColor.RED).nonOpaque().requiresTool().allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never),

            true, false
    );
    public static final Block DIAMOND_GRATE = register(
            "diamond_grate",GrateBlock::new, AbstractBlock.Settings.create()
                    .strength(5f, 6f)
                    .sounds(BlockSoundGroup.COPPER_GRATE)
                    .mapColor(MapColor.DIAMOND_BLUE).nonOpaque().requiresTool().allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never),

            true, false
    );
    public static final Block EMERALD_GRATE = register(
            "emerald_grate",GrateBlock::new, AbstractBlock.Settings.create()
                    .strength(5f, 6f)
                    .sounds(BlockSoundGroup.COPPER_GRATE)
                    .mapColor(MapColor.EMERALD_GREEN).nonOpaque().requiresTool().allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never),
            true, false
    );
    public static final Block NETHERITE_GRATE = register(
            "netherite_grate",GrateBlock::new, AbstractBlock.Settings.create()
                    .strength(50f, 1200f)
                    .sounds(BlockSoundGroup.NETHERITE)
                    .mapColor(MapColor.GRAY).nonOpaque().requiresTool().allowsSpawning(Blocks::never)
                    .solidBlock(Blocks::never)
                    .suffocates(Blocks::never)
                    .blockVision(Blocks::never),

            true, true
    );
    private static Block register(String name, Function<AbstractBlock.Settings, Block> blockFactory, AbstractBlock.Settings settings, boolean shouldRegisterItem, boolean fireProof) {
        RegistryKey<Block> blockKey = keyOfBlock(name);
        Block block = blockFactory.apply(settings.registryKey(blockKey));

        if (shouldRegisterItem) {
            RegistryKey<Item> itemKey = keyOfItem(name);
            BlockItem blockItem;// = new BlockItem(block, new Item.Settings().fireproof().registryKey(itemKey));
            if(fireProof) {
                blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey).fireproof());
            }
            else{
                blockItem = new BlockItem(block, new Item.Settings().registryKey(itemKey));
            }
            Registry.register(Registries.ITEM, itemKey, blockItem);
        }

        return Registry.register(Registries.BLOCK, blockKey, block);
    }

    private static RegistryKey<Block> keyOfBlock(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(More_metal_grates.MOD_ID, name));
    }

    private static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(More_metal_grates.MOD_ID, name));
    }










    public static void initialize() {
    }
}
