package io.eight_onar.projectabysscontentpack.data.generators;

import io.eight_onar.projectabysscontentpack.ProjectAbyssContentPack;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class PAItemTagGenerator extends ItemTagsProvider {
    public PAItemTagGenerator(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider,
                              CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, ProjectAbyssContentPack.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

    }
}

