package com.Minor2CCh.more_metal_grates.registry;

import com.Minor2CCh.more_metal_grates.More_metal_grates;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

@SuppressWarnings("unused")
public class MMGCreativeModeTab {
    public static final Supplier<CreativeModeTab> TAB_MORE_METAL_GRATES = More_metal_grates.PLATFORM.creativeModeTabRegister(
            "tab",
            () -> new ItemStack(MMGItems.IRON_GRATE.get()),
            (parameters, output) ->{
                output.accept(MMGItems.IRON_GRATE.get());
                output.accept(MMGItems.GOLD_GRATE.get());
                output.accept(MMGItems.LAPIS_GRATE.get());
                output.accept(MMGItems.QUARTZ_GRATE.get());
                output.accept(MMGItems.SMOOTH_QUARTZ_GRATE.get());
                output.accept(MMGItems.AMETHYST_GRATE.get());
                output.accept(MMGItems.REDSTONE_GRATE.get());
                output.accept(MMGItems.EMERALD_GRATE.get());
                output.accept(MMGItems.DIAMOND_GRATE.get());
                output.accept(MMGItems.NETHERITE_GRATE.get());
            });
    public static CreativeModeTab createBuilder(CreativeModeTab.Builder builder, String id, Supplier<ItemStack> iconStack, BiConsumer<CreativeModeTab.ItemDisplayParameters, CreativeModeTab.Output> createTab){
        return builder
                .title(Component.translatable((String.format("itemGroup.%s.%s", More_metal_grates.MOD_ID, id))))
                .icon(iconStack)
                .displayItems(createTab::accept).build();
    }
    public static void init(){

    }
}
