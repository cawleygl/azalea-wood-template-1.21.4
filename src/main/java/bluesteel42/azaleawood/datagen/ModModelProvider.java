package bluesteel42.azaleawood.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import bluesteel42.azaleawood.block.ModBlocks;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool azaleaPlankPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.AZALEA_PLANKS);
        azaleaPlankPool.stairs(ModBlocks.AZALEA_STAIRS);
        azaleaPlankPool.slab(ModBlocks.AZALEA_SLAB);
        azaleaPlankPool.button(ModBlocks.AZALEA_BUTTON);
        azaleaPlankPool.pressurePlate(ModBlocks.AZALEA_PRESSURE_PLATE);
        blockStateModelGenerator.registerDoor(ModBlocks.AZALEA_DOOR);
        blockStateModelGenerator.registerOrientableTrapdoor(ModBlocks.AZALEA_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool azaleaMosaicPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.AZALEA_MOSAIC);
        azaleaMosaicPool.stairs(ModBlocks.AZALEA_MOSAIC_STAIRS);
        azaleaMosaicPool.slab(ModBlocks.AZALEA_MOSAIC_SLAB);

        // Signs Textures
        azaleaPlankPool.family(ModBlocks.AZALEA_SIGN_FAMILY);
        azaleaPlankPool.family(ModBlocks.AZALEA_HANGING_SIGN_FAMILY);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}
