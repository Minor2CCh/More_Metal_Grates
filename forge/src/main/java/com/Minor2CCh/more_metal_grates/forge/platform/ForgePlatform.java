package com.Minor2CCh.more_metal_grates.forge.platform;

import com.Minor2CCh.more_metal_grates.More_metal_grates;
import com.Minor2CCh.more_metal_grates.platform.IPlatform;
import com.Minor2CCh.more_metal_grates.registry.MMGCreativeModeTab;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.nio.file.Path;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class ForgePlatform implements IPlatform {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, More_metal_grates.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, More_metal_grates.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, More_metal_grates.MOD_ID);
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, More_metal_grates.MOD_ID);
    @Override
    public ModLoader getModLoader() {
        return ModLoader.FORGE;
    }

    @Override
    public <T extends Block> Supplier<T> blockRegister(String id, Supplier<T> block) {
        return BLOCKS.register(id, block);
    }

    @Override
    public <T extends Item> Supplier<T> itemRegister(String id, Supplier<T> item) {
        return ITEMS.register(id, item);
    }

    @Override
    public Supplier<SoundEvent> soundRegister(String id) {
        return SOUND_EVENTS.register(id, () -> SoundEvent.createVariableRangeEvent(More_metal_grates.of(id)));
    }

    @Override
    public SoundType registerSoundType(float volume, float pitch, Supplier<SoundEvent> breakSound, Supplier<SoundEvent> stepSound, Supplier<SoundEvent> placeSound, Supplier<SoundEvent> hitSound, Supplier<SoundEvent> fallSound) {
        return new ForgeSoundType(volume, pitch, breakSound, stepSound, placeSound, hitSound, fallSound);
    }

    @Override
    public Supplier<CreativeModeTab> creativeModeTabRegister(String id, Supplier<ItemStack> stack, BiConsumer<CreativeModeTab.ItemDisplayParameters, CreativeModeTab.Output> createTab) {
        return CREATIVE_MODE_TABS.register(id, () -> MMGCreativeModeTab.createBuilder(CreativeModeTab.builder(), id, stack, createTab));
    }

    @Override
    public Path getConfigPath() {
        return FMLPaths.CONFIGDIR.get();
    }

    @Override
    public boolean isModLoaded(String id) {
        return ModList.get().isLoaded(id);
    }
    public static void registryInit(IEventBus modEventBus){
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);
        SOUND_EVENTS.register(modEventBus);
    }
}
