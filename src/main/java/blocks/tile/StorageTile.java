package blocks.tile;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.Constants;

public class StorageTile extends TileEntity {
    private ItemStack stack;

    // ����� �������� ������ � �������� ����, ������������� ��������� ���������
    private static final String INV_TAG = "Inventory";

    /**
     * ������ ����� ���������� ��� ������ ������ Tile Entity � ����. �� �� ����������� ������� ����� ������������� ������,
     * ��� ��� ��� ����� �������� � ������ �������� ������ Tile Entity.
     *
     * @param nbt ������ NBT � ������� ����� ��������� ���������� � Tile Entity.
     */

    @Override
    public void writeToNBT(NBTTagCompound nbt){
        super.writeToNBT(nbt);
        if(stack != null){
            NBTTagCompound inventoryTag = new NBTTagCompound();
            stack.writeToNBT(inventoryTag);
            nbt.setTag(INV_TAG, inventoryTag); //��������� �������� � ����� � �������� ������
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
     * ����� �� Tile Entity �����������. � ����� ������ Tile Entity �� ����� ������ {@link TileEntity#updateEntity}, � ������ ���������
     * Tile Entity �� �����.
     *
     * @return ���������� ���������� ��������.
     */

    @Override
    public boolean canUpdate() {
        return false;
    }

    /**
     * ��������������� �����, ����������� ������� ����� � Tile Entity.
     * @return ���������� ���������� ��������.
     */

    public boolean hasStack(){
        return stack != null;
    }

    /**
     * ������ ����� ���������� ��� ��������� ����� � � ����������� �� ���������� ������, ���������� ��������.
     *
     * @param player    ����� ����������������� � ������
     * @param stack     ���� �������� ������ � ����
     */
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
