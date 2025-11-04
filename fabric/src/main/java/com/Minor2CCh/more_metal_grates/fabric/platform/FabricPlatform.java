package com.Minor2CCh.more_metal_grates.fabric.platform;

import com.Minor2CCh.more_metal_grates.More_metal_grates;
import com.Minor2CCh.more_metal_grates.platform.IPlatform;
import com.Minor2CCh.more_metal_grates.registry.MMGCreativeModeTab;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;

import java.nio.file.Path;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class FabricPlatform implements IPlatform {
    @Override
    public ModLoader getModLoader() {
        return ModLoader.FABRIC;
    }

    @Override
    public <T extends Block> Supplier<T> blockRegister(String id, Supplier<T> block) {
        T blockInfo = block.get();
        ResourceLocation blockID = More_metal_grates.of(id);
        Registry.register(BuiltInRegistries.BLOCK, blockID, blockInfo);
        return () -> blockInfo;
    }

    @Override
    public <T extends Item> Supplier<T> itemRegister(String id, Supplier<T> item) {
        T itemInfo = item.get();
        ResourceLocation blockID = More_metal_grates.of(id);
        Registry.register(BuiltInRegistries.ITEM, blockID, itemInfo);
        return () -> itemInfo;
    }

    @Override
    public Supplier<SoundEvent> soundRegister(String id) {
        ResourceLocation soundID = More_metal_grates.of(id);
        SoundEvent soundInfo = Registry.register(BuiltInRegistries.SOUND_EVENT, soundID, SoundEvent.createVariableRangeEvent(soundID));

        return () -> soundInfo;
    }

    @Override
    public SoundType registerSoundType(float volume, float pitch, Supplier<SoundEvent> breakSound, Supplier<SoundEvent> stepSound, Supplier<SoundEvent> placeSound, Supplier<SoundEvent> hitSound, Supplier<SoundEvent> fallSound) {
        return new SoundType(volume, pitch, breakSound.get(), stepSound.get(), placeSound.get(), hitSound.get(), fallSound.get());
    }

    @Override
    public Supplier<CreativeModeTab> creativeModeTabRegister(String id, Supplier<ItemStack> stack, BiConsumer<CreativeModeTab.ItemDisplayParameters, CreativeModeTab.Output> createTab) {
        CreativeModeTab tab = MMGCreativeModeTab.createBuilder(FabricItemGroup.builder(), id, stack, createTab);
        ResourceKey<CreativeModeTab> key = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), More_metal_grates.of(id));
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, key, tab);
        return () -> tab;
    }

    @Override
    public Path getConfigPath() {
        return FabricLoader.getInstance().getConfigDir();
    }

    @Override
    public boolean isModLoaded(String id) {
        return FabricLoader.getInstance().isModLoaded(id);
    }
}
