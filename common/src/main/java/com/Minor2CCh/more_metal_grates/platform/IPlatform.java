package com.Minor2CCh.more_metal_grates.platform;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

import java.nio.file.Path;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

@SuppressWarnings("unused")
public interface IPlatform {
    enum ModLoader{
        FORGE,
        FABRIC
    }
    interface QuadConsumer<A, B, C, D> {
        void accept(A a, B b, C c, D d);
    }
    ModLoader getModLoader();
    <T extends Block> Supplier<T> blockRegister(String id, Supplier<T> block);
    <T extends Item> Supplier<T> itemRegister(String id, Supplier<T> item);
    Supplier<SoundEvent> soundRegister(String id);
    SoundType registerSoundType(float volume, float pitch, Supplier<SoundEvent> breakSound, Supplier<SoundEvent> stepSound, Supplier<SoundEvent> placeSound, Supplier<SoundEvent> hitSound, Supplier<SoundEvent> fallSound);
    Supplier<CreativeModeTab> creativeModeTabRegister(String id, Supplier<ItemStack> stack, BiConsumer<CreativeModeTab.ItemDisplayParameters, CreativeModeTab.Output> createTab);
    Path getConfigPath();
    boolean isModLoaded(String id);
}
