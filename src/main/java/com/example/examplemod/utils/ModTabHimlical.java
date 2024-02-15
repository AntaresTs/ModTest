package com.example.examplemod.utils;

import com.example.examplemod.proxy.common.handler.ModRegItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class ModTabHimlical{
    public static CreativeTabs Himlical = new CreativeTabs("Himlical") {
        @Override
        public Item getTabIconItem() {
            return Items.iron_ingot;
        }
    };
}
