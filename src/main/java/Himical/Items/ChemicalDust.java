package Himical.Items;

import Himical.handler.ModTabHimlical;
import com.example.examplemod.ExampleMod;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import java.util.List;

public class ChemicalDust extends Item {
    private String name;
    private String formula;
    private int toxicity;
    private int radioactive;

    private ChemicalDust(String name, String formula,int toxicity, int radioactive, int temp){
        this.name = name;
        this.formula = formula;
        this.toxicity = toxicity;
        this.radioactive = radioactive;

        this.setUnlocalizedName(name);
        this.setTextureName(ExampleMod.MODID + ":himical/dust_" + name.toLowerCase());
        this.setCreativeTab(ModTabHimlical.HimlicalDust);
    }
    public ChemicalDust(String name, String formula){
        this(name, formula, -1, -1, -1);
    }
    public ChemicalDust(String name, String formula, int toxicity){
        this(name, formula, toxicity, -1, -1);
    }
    public ChemicalDust(String name, String formula, int toxicity, int radioactive){
        this(name, formula, toxicity, radioactive, -1);
    }

    public void onUpdate(ItemStack itemStack, World world, Entity entity, int par4, boolean par5) {
        super.onUpdate(itemStack, world, entity, par4, par5);

        if(entity instanceof EntityPlayer){
            EntityPlayer player = (EntityPlayer) entity;
            if (toxicity > 0) {
                player.addPotionEffect(new PotionEffect(Potion.wither.id, 200, this.toxicity, true));
            }

        }
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void addInformation(ItemStack itemStack, EntityPlayer player, List list, boolean par4) {
        list.add(formula);
        if (toxicity > 0 && this.radioactive > 0){
            list.add("Toxicity: " + toxicity);
            list.add("Radioactive: " + radioactive + " rad/s");

        } else if (toxicity > 0) {
            list.add("Toxicity: " + toxicity);

        }else if (toxicity > 0) {
            list.add("Radioactive: " + radioactive + " rad/s");

        }
    }
}