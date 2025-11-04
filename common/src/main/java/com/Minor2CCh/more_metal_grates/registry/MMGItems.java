package com.Minor2CCh.more_metal_grates.registry;

import com.Minor2CCh.more_metal_grates.More_metal_grates;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public class MMGItems {
    public static final Supplier<BlockItem> IRON_GRATE = registerItem(
            "iron_grate", () -> new BlockItem(MMGBlocks.IRON_GRATE.get(), new Item.Properties()));
    public static final Supplier<BlockItem> GOLD_GRATE = registerItem(
            "gold_grate", () -> new BlockItem(MMGBlocks.GOLD_GRATE.get(), new Item.Properties()));
    public static final Supplier<BlockItem> LAPIS_GRATE = registerItem(
            "lapis_grate", () -> new BlockItem(MMGBlocks.LAPIS_GRATE.get(), new Item.Properties()));
    public static final Supplier<BlockItem> QUARTZ_GRATE = registerItem(
            "quartz_grate", () -> new BlockItem(MMGBlocks.QUARTZ_GRATE.get(), new Item.Properties()));
    public static final Supplier<BlockItem> SMOOTH_QUARTZ_GRATE = registerItem(
            "smooth_quartz_grate", () -> new BlockItem(MMGBlocks.SMOOTH_QUARTZ_GRATE.get(), new Item.Properties()));
    public static final Supplier<BlockItem> AMETHYST_GRATE = registerItem(
            "amethyst_grate", () -> new BlockItem(MMGBlocks.AMETHYST_GRATE.get(), new Item.Properties()));
    public static final Supplier<BlockItem> REDSTONE_GRATE = registerItem(
            "redstone_grate", () -> new BlockItem(MMGBlocks.REDSTONE_GRATE.get(), new Item.Properties()));
    public static final Supplier<BlockItem> EMERALD_GRATE = registerItem(
            "emerald_grate", () -> new BlockItem(MMGBlocks.EMERALD_GRATE.get(), new Item.Properties()));
    public static final Supplier<BlockItem> DIAMOND_GRATE = registerItem(
            "diamond_grate", () -> new BlockItem(MMGBlocks.DIAMOND_GRATE.get(), new Item.Properties()));
    public static final Supplier<BlockItem> NETHERITE_GRATE = registerItem(
            "netherite_grate", () -> new BlockItem(MMGBlocks.NETHERITE_GRATE.get(), new Item.Properties()));
    private static <T extends Item> Supplier<T> registerItem(String id, Supplier<T> item){
        return More_metal_grates.PLATFORM.itemRegister(id, item);
    }
    public static void init(){
    }
}
