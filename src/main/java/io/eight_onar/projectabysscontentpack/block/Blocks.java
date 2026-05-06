package io.eight_onar.projectabysscontentpack.block;

import io.eight_onar.projectabysscontentpack.ProjectAbyssContentPack;
import io.eight_onar.projectabysscontentpack.item.Items;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SandBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class Blocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ProjectAbyssContentPack.MOD_ID);

    public static final RegistryObject<Block> BLOCKY = registerBlock("blocky",
            () -> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.IRON_ORE).sound(SoundType.GLASS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> WHITE_CRYSTAL_BLOCK = registerBlock("white_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.AMETHYST_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LIGHT_GREEN_CRYSTAL_BLOCK = registerBlock("lightgreen_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.AMETHYST_BLOCK).requiresCorrectToolForDrops()));
    public static  final RegistryObject<Block> BLUE_CRYSTAL_BLOCK = registerBlock("blue_crystal_block",
            () -> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.AMETHYST_BLOCK).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> VOLCANIC_TUFF_BLOCK = registerBlock("volcanic_tuff_block",
            () -> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.TUFF).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CALCAREOUS_TUFF_BLOCK = registerBlock("calcareous_tuff_block",
            () -> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.TUFF).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GEYSERITE_BLOCK = registerBlock("geyserite_block",
            () -> new Block(BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.TUFF).requiresCorrectToolForDrops()));

    //change pDustColor
    public static final RegistryObject<Block> BLACK_SAND = registerBlock("dark_sand",
            () -> new SandBlock(5525356, BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.SAND)));
    public static final RegistryObject<Block> BLACK_GRAVEL = registerBlock("dark_gravel",
            () -> new SandBlock(4012367, BlockBehaviour.Properties.copy(net.minecraft.world.level.block.Blocks.GRAVEL)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toRet = BLOCKS.register(name, block);
        registerBlockItem(name, toRet);
        return toRet;
    }

    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return Items.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    public static void register(IEventBus eventBus){
    BLOCKS.register(eventBus);
    }
}
