package com.example.examplemod.utils;

import com.example.examplemod.proxy.common.handler.ModRegBlocks;
import com.example.examplemod.proxy.common.handler.ModRegItems;
import com.example.examplemod.proxy.common.handler.ModRegTools;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItemGroop{
    public static CreativeTabs ModItems = new CreativeTabs("ModItems") {
        @Override
        public Item getTabIconItem() {
            return ModRegItems.RING;
        }
    };
    public static CreativeTabs ModTools = new CreativeTabs("Mod Tools") {
        @Override
        public Item getTabIconItem() {
            return ModRegTools.RUPICK;
        }
    };
    public static CreativeTabs ModBlocks = new CreativeTabs("Mod Blocks") {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(ModRegBlocks.RUBL); // Блок в виде предмета
        }
    };
    public static CreativeTabs ModFluid = new CreativeTabs("Mod Fluid") {
        @Override
        public Item getTabIconItem() {
            return ModRegItems.TBUC; // Блок в виде предмета
        }
    };

}
