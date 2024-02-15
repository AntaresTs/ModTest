package blocks.tile;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.Constants;

public class ShrederTile extends TileEntity {
    ItemStack stack;
    private static final String INV_TAG = "Inventory";

    @Override
    public void writeToNBT(NBTTagCompound nbt) {
        super.writeToNBT(nbt);
        if(stack != null){
            NBTTagCompound inventoryTag = new NBTTagCompound();
            stack.writeToNBT(inventoryTag);
            nbt.setTag(INV_TAG, inventoryTag); //Сохраняет значение в карте с заданным ключом
        }
    }

    @Override
    public void readFromNBT(NBTTagCompound nbt) {
        super.readFromNBT(nbt);

        if (nbt.hasKey(INV_TAG, Constants.NBT.TAG_COMPOUND)) {
            NBTTagCompound inventoryTag = nbt.getCompoundTag(INV_TAG);
            stack = ItemStack.loadItemStackFromNBT(inventoryTag);
        }
    }

    @Override
    public void updateEntity() {
        if (stack != null){

        }
    }

    public void activate(EntityPlayer player, ItemStack stacks){
        if (stacks != null){
            
        }
    }
}
