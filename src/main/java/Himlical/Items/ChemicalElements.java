package Himlical.Items;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.utils.ModTabHimlical;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ChemicalElements extends Item {
    private String formula;
    private double MeltingPoint;
    public ChemicalElements(String name, String ChemicalFormula){
        formula = ChemicalFormula;
        setUnlocalizedName(name);
        setTextureName(ExampleMod.MODID + ":himical/element_"+name.toLowerCase());
        setCreativeTab(ModTabHimlical.Himlical);
    }
    public ChemicalElements(String name, String ChemicalFormula, double Melting_point){
        formula = ChemicalFormula;
        MeltingPoint = Melting_point;
        setUnlocalizedName(name);
        setTextureName(ExampleMod.MODID + ":himical/element_"+name.toLowerCase());
        setCreativeTab(ModTabHimlical.Himlical);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean par4) {
        list.add("Chemical formula: "+ formula);
        if (MeltingPoint > 0){
            list.add("Melting point: "+ MeltingPoint + "K");
        }

    }
}
