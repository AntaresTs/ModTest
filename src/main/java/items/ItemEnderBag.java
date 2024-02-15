package items;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.utils.ModItemGroop;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryEnderChest;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

public class ItemEnderBag extends Item {

    boolean itPl = false;
    public ItemEnderBag(){
        this.canRepair = false; // Предмет нельзя ремонтировать
        this.setUnlocalizedName("item_ender_bag");
        this.setTextureName(ExampleMod.MODID + ":item_ender_bag");
        this.setCreativeTab(ModItemGroop.ModItems);
        this.maxStackSize = 1;
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        if (!world.isRemote) {
            InventoryEnderChest inventoryEnderChest = entityPlayer.getInventoryEnderChest();
            if (inventoryEnderChest != null){
                entityPlayer.displayGUIChest(inventoryEnderChest);
            }
        }
        return itemStack;
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer, List par3List, boolean par4){
        par3List.add("Ender bag");
    }
}
