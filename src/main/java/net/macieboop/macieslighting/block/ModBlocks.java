package net.macieboop.macieslighting.block;

import net.macieboop.macieslighting.item.ModCreativeModeTab;
import net.macieboop.macieslighting.item.ModItems;
import net.macieboop.macieslighting.mLighting;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.LeverBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, mLighting.MOD_ID);

    public static final RegistryObject<Block> LS_STANDARD = registerBlock("standardls",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL)
                    .noCollission()
                    .strength(0.5f)),
            ModCreativeModeTab.TAB_ML);
    public static final RegistryObject<Block> L_LAMP1 = registerBlock("lamp1",
            () -> new Block(BlockBehaviour.Properties.of(Material.GLASS)
                    /*.lightLevel()*/
                    .strength(0.5f)),
            ModCreativeModeTab.TAB_ML);
    public static final RegistryObject<Block> ORE_TIN = registerBlock("tinore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1.5f)
                    .requiresCorrectToolForDrops(),
            UniformInt.of(3,7)),
            ModCreativeModeTab.TAB_ML);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }
    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}
