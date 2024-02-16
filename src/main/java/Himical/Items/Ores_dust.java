package Himical.Items;

import Himical.handler.ModTabHimlical;
import com.example.examplemod.ExampleMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class Ores_dust extends Item {
    private String name;
    private String formula;

    public Ores_dust(String name, String formula){
        this.setUnlocalizedName(name);
        this.setTextureName(ExampleMod.MODID + ":himical/ore_dust_"+name.toLowerCase());
        this.setCreativeTab(ModTabHimlical.HimlicalDust);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean par4) {
        if (formula != null){list.add(formula);}else {list.add("???");}

    }
}
