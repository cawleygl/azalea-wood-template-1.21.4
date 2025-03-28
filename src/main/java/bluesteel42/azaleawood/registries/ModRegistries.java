package bluesteel42.azaleawood.registries;

import bluesteel42.azaleawood.util.ModTags;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import bluesteel42.azaleawood.block.ModBlocks;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModRegistries {
    public static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.AZALEA_STEM, ModBlocks.STRIPPED_AZALEA_STEM);
        StrippableBlockRegistry.register(ModBlocks.AZALEA_BLOCK, ModBlocks.STRIPPED_AZALEA_BLOCK);
    }

    public static void registerFlammables() {
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.AZALEA_STEM, 60, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_AZALEA_STEM, 60, 60);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.AZALEA_PLANKS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.AZALEA_MOSAIC, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.AZALEA_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.AZALEA_MOSAIC_SLAB, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.AZALEA_FENCE_GATE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.AZALEA_FENCE, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.AZALEA_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.AZALEA_MOSAIC_STAIRS, 5, 20);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.AZALEA_BLOCK, 5, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_AZALEA_BLOCK, 5, 5);
    }
    public static void registerFuels() {
        FuelRegistryEvents.BUILD.register((builder, context) -> {
            builder.add(ModBlocks.AZALEA_STEM, 50);
            builder.add(ModBlocks.STRIPPED_AZALEA_STEM, 50);
            builder.add(ModTags.Items.AZALEA_BLOCKS, 300);
            builder.add(ModBlocks.AZALEA_MOSAIC, 300);
            builder.add(ModBlocks.AZALEA_MOSAIC_SLAB, 150);
            builder.add(ModBlocks.AZALEA_MOSAIC_STAIRS, 300);
        });
    }
}
