package com.github.Minor2CCh.more_metal_grates;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class mmg_ItemGroup {
    public static final RegistryKey<ItemGroup> GRATES_ITEM_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(More_metal_grates.MOD_ID, "grates_item_group"));
    public static final ItemGroup GRATES_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(mmg_block.IRON_GRATE))
            .displayName(Text.translatable("More Metal Grates"))
            .build();
    public static void initialize() {
        Registry.register(Registries.ITEM_GROUP, GRATES_ITEM_GROUP_KEY, GRATES_ITEM_GROUP);
        ItemGroupEvents.modifyEntriesEvent(GRATES_ITEM_GROUP_KEY).register(itemGroup -> {
            itemGroup.add(mmg_block.IRON_GRATE);
            itemGroup.add(mmg_block.GOLD_GRATE);
            itemGroup.add(mmg_block.LAPIS_GRATE);
            itemGroup.add(mmg_block.QUARTZ_GRATE);
            itemGroup.add(mmg_block.SMOOTH_QUARTZ_GRATE);
            itemGroup.add(mmg_block.AMETHYST_GRATE);
            itemGroup.add(mmg_block.REDSTONE_GRATE);
            itemGroup.add(mmg_block.DIAMOND_GRATE);
            itemGroup.add(mmg_block.EMERALD_GRATE);
            itemGroup.add(mmg_block.NETHERITE_GRATE);
                });
    }
}
