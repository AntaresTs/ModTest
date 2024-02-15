package blocks.tile;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.Constants;

public class SmelterTile extends TileEntity {
    private ItemStack stack;
    private static final String INV_TAG = "Inventory";

    @Override
    public void writeToNBT(NBTTagCompound nbt) {
        super.writeToNBT(nbt);

        if(stack != null){
            NBTTagCompound inventoryTag = new NBTTagCompound();
            stack.writeToNBT(inventoryTag);
            nbt.setTag(INV_TAG, inventoryTag);
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

    /**
     * ������ ����� ���������� ������ ������� ���.
     */
    @Override
    public void updateEntity() {
        /*
         * ����������� ���������, ��� �������� ������������ �� ��������� �������, ����� ���������, ��� ������� ���� ��������.
         * ���� ������� ����� � ���������� ������� 100(5 ���) � �������� ���������� 0, �� ����������� �������� �� ���� ������ ���������.
         */

        if (!worldObj.isRemote && hasStack() && worldObj.getWorldTime() % 100 == 0){
            // ���� ������� �������� ������ �������� ����, �� ������ �������� ��������, ������� �������� � ���� ���� � ��������� "�����"
            if (stack.getItem() == Item.getItemFromBlock(Blocks.coal_ore)){
                worldObj.spawnEntityInWorld(new EntityItem(worldObj, xCoord, yCoord+1, zCoord, new ItemStack(Items.coal)));
                stack = null; // ������� ����
                markDirty(); // ���������
            } else if (stack.getItem() == Item.getItemFromBlock(Blocks.iron_ore)) { // ���� ������� �������� ������ �������� ����, �� ������ �������� ��������, ������� �������� � ���� ���� � ��������� "�������� ������"
                worldObj.spawnEntityInWorld(new EntityItem(worldObj, xCoord, yCoord + 1, zCoord, new ItemStack(Items.iron_ingot)));
                stack = null;
                markDirty();
            }
        }

    }

    public boolean hasStack(){
        return stack != null;
    }

    public void handleInputStack(EntityPlayer player, ItemStack stack){
        // ���� � StorageTile ���� ����, �� ���������� �������� �� ������� �������� �� StorageTile
        if(hasStack()){
            // ���� ��������� ��������, �� ������� ����� ��������, � ���� ������ ����� �������� ������ � ���������.
            if (!player.inventory.addItemStackToInventory(this.stack)) {
                player.dropPlayerItemWithRandomChoice(this.stack, false);
            }else {
                // ������ ������, ��� ������� �� ������������ � ��������� ����� ��������� �����, ������ ��� ���������� ���.
                player.inventoryContainer.detectAndSendChanges();
            }
            // ������� ���� �� StorageTile
            this.stack = null;
        } else if (stack != null) { // ���� ���� � ���� �� ����� null, �� �� ����� ������� � ���-�� 1 ��., � StorageTile
            ItemStack copy = stack.copy();
            copy.stackSize = 1;
            this.stack = copy;
            // ������� ���� ������� �� ��������� ������.
            --stack.stackSize;
        }
        // �� �������� �������� Tile Entity ��� "�������", ����� ���� ��������� ���� ������.
        markDirty();
    }
}
