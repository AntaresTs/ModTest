package Himical.ores;

import Himical.handler.ModTabHimlical;
import com.example.examplemod.ExampleMod;
import com.example.examplemod.utils.ModItemGroop;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Random;

public class ChemicalOres extends Block {
    private String name;
    private ArrayList<ItemStack> drors = new ArrayList<>();
    private Item drop;
    private int size;
    public ChemicalOres(String name, Item drop, int size){
        super(Material.rock);
        this.name = name;
        this.drop = drop;
        this.size = size;
        this.drors.add(new ItemStack(this.drop, this.size));

        setBlockName(this.name);
        setBlockTextureName(ExampleMod.MODID + "himical/" + this.name.toLowerCase());
        setCreativeTab(ModTabHimlical.HimlicalOres);
    }

    @Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
        return this.drors;
    }
}
