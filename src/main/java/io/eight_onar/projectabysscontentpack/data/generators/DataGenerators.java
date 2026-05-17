package io.eight_onar.projectabysscontentpack.data.generators;

import io.eight_onar.projectabysscontentpack.ProjectAbyssContentPack;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = ProjectAbyssContentPack.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new PARecipeProvider(packOutput));
        generator.addProvider(event.includeServer(), PALootTableProvider.create(packOutput));

        generator.addProvider(event.includeClient(), new PABlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new PAItemModelProvider(packOutput, existingFileHelper));

        PABlockTagGenerator blockTagGenerator = generator.addProvider(event.includeServer(),
            new PABlockTagGenerator(packOutput, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new PAItemTagGenerator(packOutput,lookupProvider, blockTagGenerator.contentsGetter(), existingFileHelper));

    }
}
