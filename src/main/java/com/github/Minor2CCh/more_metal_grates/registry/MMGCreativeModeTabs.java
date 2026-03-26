package com.github.Minor2CCh.more_metal_grates.registry;


import com.github.Minor2CCh.more_metal_grates.MoreMetalGrates;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

@SuppressWarnings("unused")
public class MMGCreativeModeTabs {
    public static final CreativeModeTab GRATES_ITEM_GROUP = register("grates_item_group",
            FabricCreativeModeTab.builder()
            .icon(() -> new ItemStack(MMGBlocks.IRON_GRATE))
            .title(Component.literal("More Metal Grates"))
            .displayItems((parameres, output) -> {
                output.accept(MMGBlocks.IRON_GRATE.asItem());
                output.accept(MMGBlocks.GOLD_GRATE.asItem());
                output.accept(MMGBlocks.LAPIS_GRATE.asItem());
                output.accept(MMGBlocks.QUARTZ_GRATE.asItem());
                output.accept(MMGBlocks.SMOOTH_QUARTZ_GRATE.asItem());
                output.accept(MMGBlocks.AMETHYST_GRATE.asItem());
                output.accept(MMGBlocks.REDSTONE_GRATE.asItem());
                output.accept(MMGBlocks.DIAMOND_GRATE.asItem());
                output.accept(MMGBlocks.EMERALD_GRATE.asItem());
                output.accept(MMGBlocks.NETHERITE_GRATE.asItem());
            })
            .build());
    public static void initialize() {
    }
    @SuppressWarnings("all")
    private static CreativeModeTab register(String name, CreativeModeTab tab){
        ResourceKey<CreativeModeTab> key = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), MoreMetalGrates.of(name));
        return Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, key, tab);

    }
}
