package Himical.ores;

import Himical.handler.RegisterHimical;
import com.example.examplemod.ExampleMod;
import Himical.handler.ModTabHimlical;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.ArrayList;

public class Magnetite_ores extends Block {
    /**
     * 	‘ормула Fe3O4
     * 	“еоретический состав: FeO Ч 31,03 %; Fe2O3 Ч 68,97 %, Fe Ч 72,36 %; O Ч 27,64 %
     * 	примеси Ti, V, Mn, Mg, Al, Cr
     */

    public Magnetite_ores(){
        super(Material.rock);
        setBlockName("Magnetite_ores");
        setBlockTextureName(ExampleMod.MODID + "magnetite_ores");
        setHardness(10);
        setCreativeTab(ModTabHimlical.HimlicalOres);
    }

    @Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
        ArrayList<ItemStack> drors = new ArrayList<>();
        drors.add(new ItemStack(RegisterHimical.IRON, 3));
        drors.add(new ItemStack(RegisterHimical.OXYGEN, 4));

        return drors;
    }
}
