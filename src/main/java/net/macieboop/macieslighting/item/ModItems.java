package net.macieboop.macieslighting.item;

import net.macieboop.macieslighting.mLighting;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS,mLighting.MOD_ID);

    public static final RegistryObject<Item> SOLDERING_IRON = ITEMS.register("soldering_iron",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.TAB_ML)
                    .stacksTo(1)
            ));
    public static final RegistryObject<Item> SOLDER = ITEMS.register("solder",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.TAB_ML)
                    .stacksTo(16)
            ));

    //make the textures and stuff for these:
    public static final RegistryObject<Item> CASSITERITE = ITEMS.register("cassiterite",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.TAB_ML)
                    .stacksTo(64)
            ));
    public static final RegistryObject<Item> TIN = ITEMS.register("tin",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.TAB_ML)
                    .stacksTo(64)
            ));
    public static final RegistryObject<Item> PLASTIC = ITEMS.register("plastic",
            () -> new Item(new Item.Properties()
                    .tab(ModCreativeModeTab.TAB_ML)
                    .stacksTo(16)
            ));

    public  static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
