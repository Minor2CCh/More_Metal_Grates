package com.Minor2CCh.more_metal_grates;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, More_metal_grates.MODID);
    public static final Supplier<CreativeModeTab> TAB_MORE_METAL_GRATES = CREATIVE_MODE_TABS.register(More_metal_grates.MODID,
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.more_metal_grates"))
                    .icon(() -> new ItemStack(ModBlocks.IRON_GRATE))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.IRON_GRATE.get());
                        output.accept(ModBlocks.GOLD_GRATE.get());
                        output.accept(ModBlocks.LAPIS_GRATE.get());
                        output.accept(ModBlocks.QUARTZ_GRATE.get());
                        output.accept(ModBlocks.SMOOTH_QUARTZ_GRATE.get());;
                        output.accept(ModBlocks.AMETHYST_GRATE.get());
                        output.accept(ModBlocks.REDSTONE_GRATE.get());
                        output.accept(ModBlocks.EMERALD_GRATE.get());
                        output.accept(ModBlocks.DIAMOND_GRATE.get());
                        output.accept(ModBlocks.NETHERITE_GRATE.get());
                    }).build());
    public static void initialize(IEventBus modEventBus){
        CREATIVE_MODE_TABS.register(modEventBus);
    }
}
