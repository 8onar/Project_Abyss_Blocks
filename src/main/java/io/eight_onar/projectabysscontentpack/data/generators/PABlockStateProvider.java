package io.eight_onar.projectabysscontentpack.data.generators;

import io.eight_onar.projectabysscontentpack.ProjectAbyssContentPack;
import io.eight_onar.projectabysscontentpack.init.custom.block.PABlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class PABlockStateProvider extends BlockStateProvider {
    public PABlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ProjectAbyssContentPack.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        regBlockWithItem(PABlocks.BLUE_CRYSTAL_BLOCK);
        regBlockWithItem(PABlocks.LIGHT_GREEN_CRYSTAL_BLOCK);
        regBlockWithItem(PABlocks.WHITE_CRYSTAL_BLOCK);
        regBlockWithItem(PABlocks.GEYSERITE_BLOCK);
        regBlockWithItem(PABlocks.VOLCANIC_TUFF_BLOCK);
        regBlockWithItem(PABlocks.CALCAREOUS_TUFF_BLOCK);
        regBlockWithItem(PABlocks.DARK_GRAVEL);
        regBlockWithItem(PABlocks.DARK_SAND);
        regBlockWithItem(PABlocks.BLOCKY);
        regBlockWithItem(PABlocks.NYTHERITE_BLOCK);
        regBlockWithItem(PABlocks.UMBRYTE_BLOCK);
        regBlockWithItem(PABlocks.GRAVIUM_BLOCK);

        regBlockWithItem(PABlocks.NYTHERITE_ORE);
        regBlockWithItem(PABlocks.UMBRYTE_ORE);
        regBlockWithItem(PABlocks.GRAVIUM_ORE);
    }
    private void regBlockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
