package net.macieboop.macieslighting.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab TAB_ML = new CreativeModeTab("ml_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SOLDERING_IRON.get());
        }
    };
}
