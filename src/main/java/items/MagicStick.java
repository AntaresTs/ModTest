package items;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.utils.ModItemGroop;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

import java.util.List;

public class MagicStick extends Item {
    public MagicStick(){
        setUnlocalizedName("debug_stick");
        setTextureName(ExampleMod.MODID + ":debug_stick");
        setMaxStackSize(1);
        setCreativeTab(ModItemGroop.ModItems);

    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack parItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4){ //Описание предмета
        par3List.add("Good-stick");
        par3List.add("stick");
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        if (!world.isRemote){
            String mess = "eddEffect";
            player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 500, 2, true));
            player.addChatMessage(new ChatComponentText(mess));
        }
        return stack;
    }
}
