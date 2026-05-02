package io.eight_onar.projectabyss.creativetabs;

import io.eight_onar.projectabyss.ProjectAbyss;
import io.eight_onar.projectabyss.block.Blocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ProjectAbyss.MOD_ID);
    public static final RegistryObject<CreativeModeTab> TAB_DEC_ABYSS_BLOCKS = CREATIVE_MODE_TABS.register("tab_dec_abyss_blocks",
            () -> CreativeModeTab
                    .builder()
                    .icon(() -> Blocks.BLOCKY.get().asItem().getDefaultInstance())
                    .title(Component.translatable("tab.dec_abyss_blocks"))
                    .displayItems((pParameters, output) -> {
                        Blocks.BLOCKS.getEntries().forEach(block -> output.accept(block.get()));
                    }).build());

    public static final RegistryObject<CreativeModeTab> TAB_FUNC_ABYSS_BLOCKS = CREATIVE_MODE_TABS.register("tab_func_abyss_blocks",
            () -> CreativeModeTab
                    .builder()
                    .icon(() -> Blocks.VOLCANIC_TUFF_BLOCK.get().asItem().getDefaultInstance())
                    .title(Component.translatable("tab.func_abyss_blocks"))
                    .displayItems((pParameters, output) -> {
                        Blocks.BLOCKS.getEntries().forEach(block -> output.accept(block.get()));
                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
