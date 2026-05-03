package io.eight_onar.projectabysscontentpack.creativetabs;

import io.eight_onar.projectabysscontentpack.ProjectAbyssContentPack;
import io.eight_onar.projectabysscontentpack.block.Blocks;
import io.eight_onar.projectabysscontentpack.item.Items;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ProjectAbyssContentPack.MOD_ID);
// BLOCKS
    public static final RegistryObject<CreativeModeTab> TAB_BUILDING_ABYSS_BLOCKS = CREATIVE_MODE_TABS.register("tab_building_abyss_blocks",
            () -> CreativeModeTab
                    .builder()
                    .icon(() -> Blocks.BLOCKY.get().asItem().getDefaultInstance())
                    .title(Component.translatable("ctab.building_abyss_blocks"))
                    .displayItems((pParameters, output) -> {
                        Blocks.BLOCKS.getEntries().forEach(block -> output.accept(block.get()));
                    }).build());
    public static final RegistryObject<CreativeModeTab> TAB_COLORED_ABYSS_BLOCKS = CREATIVE_MODE_TABS.register("tab_colored_abyss_blocks",
            () -> CreativeModeTab
                    .builder()
                    .icon(() -> Blocks.BLOCKY.get().asItem().getDefaultInstance())
                    .title(Component.translatable("ctab.colored_abyss_blocks"))
                    .displayItems((pParameters, output) -> {
                        Blocks.BLOCKS.getEntries().forEach(block -> output.accept(block.get()));
                    }).build());
    public static final RegistryObject<CreativeModeTab> TAB_NATURAL_ABYSS_BLOCKS = CREATIVE_MODE_TABS.register("tab_natural_abyss_blocks",
            () -> CreativeModeTab
                    .builder()
                    .icon(() -> Blocks.BLOCKY.get().asItem().getDefaultInstance())
                    .title(Component.translatable("ctab.natural_abyss_blocks"))
                    .displayItems((pParameters, output) -> {
                        Blocks.BLOCKS.getEntries().forEach(block -> output.accept(block.get()));
                    }).build());
    public static final RegistryObject<CreativeModeTab> TAB_FUNC_ABYSS_BLOCKS = CREATIVE_MODE_TABS.register("tab_func_abyss_blocks",
            () -> CreativeModeTab
                    .builder()
                    .icon(() -> Blocks.BLOCKY.get().asItem().getDefaultInstance())
                    .title(Component.translatable("ctab.func_abyss_blocks"))
                    .displayItems((pParameters, output) -> {
                        Blocks.BLOCKS.getEntries().forEach(block -> output.accept(block.get()));
                    }).build());
// ITEMS
    public static final RegistryObject<CreativeModeTab> TAB_ABYSS_TOOLS_UTILITIES_ITEMS = CREATIVE_MODE_TABS.register("tab_tools_utilities_abyss_items",
            ()-> CreativeModeTab
                    .builder()
                    .icon(() -> Items.PUPPY.get().getDefaultInstance())
                    .title(Component.translatable("ctab.tools_utilities_abyss_items"))
                    .displayItems((pParameters, output) -> {
                        Items.ITEMS.getEntries().forEach(item -> output.accept(item.get()));
                    }).build());
    public static final RegistryObject<CreativeModeTab> TAB_INGRIDIENTS_ABYSS_ITEMS = CREATIVE_MODE_TABS.register("tab_ingridients_abyss_items",
            ()-> CreativeModeTab
                    .builder()
                    .icon(() -> Items.PUPPY.get().getDefaultInstance())
                    .title(Component.translatable("ctab.ingridients_abyss_items"))
                    .displayItems((pParameters, output) -> {
                        Items.ITEMS.getEntries().forEach(item -> output.accept(item.get()));
                    }).build());
    public static final RegistryObject<CreativeModeTab> TAB_FOOD_DRINKS_ABYSS_ITEMS = CREATIVE_MODE_TABS.register("tab_food_drinks_abyss_items",
            ()-> CreativeModeTab
                    .builder()
                    .icon(() -> Items.PUPPY.get().getDefaultInstance())
                    .title(Component.translatable("ctab.food_drinks_abyss_items"))
                    .displayItems((pParameters, output) -> {
                        Items.ITEMS.getEntries().forEach(item -> output.accept(item.get()));
                    }).build());
    public static final RegistryObject<CreativeModeTab> TAB_COMBAT_ABYSS_ITEMS = CREATIVE_MODE_TABS.register("tab_combat_abyss_items",
            ()-> CreativeModeTab
                    .builder()
                    .icon(() -> Items.PUPPY.get().getDefaultInstance())
                    .title(Component.translatable("ctab.combat_abyss_items"))
                    .displayItems((pParameters, output) -> {
                        Items.ITEMS.getEntries().forEach(item -> output.accept(item.get()));
                    }).build());
// test\idk
    public static final RegistryObject<CreativeModeTab> TAB_MISC_ABYSS_ITEMS = CREATIVE_MODE_TABS.register("tab_misc_abyss_items",
            ()-> CreativeModeTab
                    .builder()
                    .icon(() -> Items.PUPPY.get().getDefaultInstance())
                    .title(Component.translatable("ctab.misc_abyss_items"))
                    .displayItems((pParameters, output) -> {
                        Items.ITEMS.getEntries().forEach(item -> output.accept(item.get()));
                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
