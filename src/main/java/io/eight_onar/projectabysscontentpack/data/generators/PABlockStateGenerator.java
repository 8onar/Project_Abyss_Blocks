package io.eight_onar.projectabysscontentpack.data.generators;

import io.eight_onar.projectabysscontentpack.ProjectAbyssContentPack;
import io.eight_onar.projectabysscontentpack.init.custom.block.PABlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class PABlockStateGenerator  extends BlockStateProvider {
    public PABlockStateGenerator(PackOutput output, ExistingFileHelper exFileHelper) {
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
    }
    private void regBlockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
