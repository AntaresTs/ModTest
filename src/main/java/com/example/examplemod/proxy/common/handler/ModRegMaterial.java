package com.example.examplemod.proxy.common.handler;

import com.example.examplemod.ExampleMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;

public class ModRegMaterial {
    public static final Item.ToolMaterial RUBY_TOOL_MATERIAL = EnumHelper.addToolMaterial(ExampleMod.MODID + ":ruby", 10, 1800, 20F, 50F, 30);

    static {
        RUBY_TOOL_MATERIAL.setRepairItem(new ItemStack(ModRegItems.RUBY));
    }
}
