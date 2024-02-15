package com.example.examplemod.proxy.common.handler;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModRegReciptes {
    public static void registerRecipes(){
        GameRegistry.addShapelessRecipe(new ItemStack(ModRegItems.STK, 1 ), new Object[] {Blocks.gravel});
        GameRegistry.addShapedRecipe(new ItemStack(ModRegItems.ITEM_ENDER_BAG),
                "LLL", "LEL", "LLL",
                'L', Items.leather,
                'E', Blocks.ender_chest
        );
        //region Craft Linolieum
        GameRegistry.addShapedRecipe(new ItemStack(ModRegBlocks.LINOLEUM_BLOCK, 4),
                "ALL", "ALL", "AAA",
                'L', Item.getItemFromBlock(Blocks.wooden_slab)
        );
        GameRegistry.addShapedRecipe(new ItemStack(ModRegBlocks.LINOLEUM_BLOCK, 4),
                "AAA", "LLA", "LLA",
                'L', Item.getItemFromBlock(Blocks.wooden_slab)
        );
        GameRegistry.addShapedRecipe(new ItemStack(ModRegBlocks.LINOLEUM_BLOCK, 4),
                "AAA", "ALL", "ALL",
                'L', Item.getItemFromBlock(Blocks.wooden_slab)
        );
        //endregion

        //region —жатые блоки
        GameRegistry.addShapedRecipe(new ItemStack(ModRegBlocks.COMPRESSED_COBBLESTONE),
                "LLL", "LLL", "LLL",
                'L', Blocks.cobblestone
        );
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cobblestone, 9 ), new Object[] {ModRegBlocks.COMPRESSED_COBBLESTONE});

        GameRegistry.addShapedRecipe(new ItemStack(ModRegBlocks.DOUBLE_COMPRESSED_COBBLESTONE),
                "LLL", "LLL", "LLL",
                'L', ModRegBlocks.COMPRESSED_COBBLESTONE
        );
        GameRegistry.addShapelessRecipe(new ItemStack(ModRegBlocks.COMPRESSED_COBBLESTONE, 9 ), new Object[] {ModRegBlocks.DOUBLE_COMPRESSED_COBBLESTONE});

        GameRegistry.addShapedRecipe(new ItemStack(ModRegBlocks.TRIPLE_COMPRESSED_COBBLESTONE),
                "LLL", "LLL", "LLL",
                'L', ModRegBlocks.DOUBLE_COMPRESSED_COBBLESTONE
        );
        GameRegistry.addShapelessRecipe(new ItemStack(ModRegBlocks.DOUBLE_COMPRESSED_COBBLESTONE, 9 ), new Object[] {ModRegBlocks.TRIPLE_COMPRESSED_COBBLESTONE});

        GameRegistry.addShapedRecipe(new ItemStack(ModRegBlocks.QUADRUPLE_COMPRESSED_COBBLESTONE),
                "LLL", "LLL", "LLL",
                'L', ModRegBlocks.TRIPLE_COMPRESSED_COBBLESTONE
        );
        GameRegistry.addShapelessRecipe(new ItemStack(ModRegBlocks.TRIPLE_COMPRESSED_COBBLESTONE, 9 ), new Object[] {ModRegBlocks.QUADRUPLE_COMPRESSED_COBBLESTONE});
        //endregion
    }
}
