package com.example.examplemod.proxy.common.handler;

import cpw.mods.fml.common.registry.GameRegistry;
import items.*;
import items.MagicStick;
import items.materials.MagicIgot;
import items.materials.RubyItem;

public class ModRegItems {
    public static final RingItem RING = new RingItem();
    public static final FoodItem FITM = new FoodItem();
    public static final RubyItem RUBY =new RubyItem();
    public static final Stick STK = new Stick();
    public static final ItemEnderBag ITEM_ENDER_BAG = new ItemEnderBag();
    public static BucketItem TBUC;
    public static final MagicStick MAGIC_STICK = new MagicStick();
    public static final FluidCellItem FLUID_CELL_ITEM = new FluidCellItem();
    public static final MagicIgot MAGIC_IGOT = new MagicIgot();



    public static void register(){
        GameRegistry.registerItem(RING, "ring");
        GameRegistry.registerItem(FITM,"high-speed_leg");
        GameRegistry.registerItem(RUBY, "Ruby");
        GameRegistry.registerItem(STK, "Stick");
        GameRegistry.registerItem(MAGIC_STICK, "Magic stickss");
        GameRegistry.registerItem(ITEM_ENDER_BAG, "Ender bag");
        GameRegistry.registerItem(FLUID_CELL_ITEM, "fluid sell");
        GameRegistry.registerItem(MAGIC_IGOT, "Magic igot");

    }
}
