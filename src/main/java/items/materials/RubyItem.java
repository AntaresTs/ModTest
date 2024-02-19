package items.materials;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.utils.ModItemGroop;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class RubyItem extends Item {
    public RubyItem(){
        setUnlocalizedName("item_ruby");
        setTextureName(ExampleMod.MODID+":item_ruby");
        setMaxStackSize(64);
        setCreativeTab(ModItemGroop.ModItems);
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack parItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4){ //Описание предмета
        par3List.add("Chemical formula: Al2O3");
    }
}
