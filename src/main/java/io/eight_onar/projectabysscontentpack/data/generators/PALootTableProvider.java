package io.eight_onar.projectabysscontentpack.data.generators;

import io.eight_onar.projectabysscontentpack.data.generators.loot.PABlockLootTables;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSet;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;

import java.util.List;
import java.util.Set;

public class PALootTableProvider {
    public static LootTableProvider create(PackOutput packOutput){
        return new LootTableProvider(packOutput, Set.of(), List.of(
            new LootTableProvider.SubProviderEntry(PABlockLootTables::new, LootContextParamSets.BLOCK)
        ));
    }
}
