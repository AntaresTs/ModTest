package blocks.tile;

import blocks.QuarryBlock;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraftforge.common.util.Constants;

import java.util.ArrayList;
import java.util.List;

public class QuarryBlockTile extends TileEntity {

    private int xi = 0;
    private int yi = 0;
    private int zi = 0;
    private int fortune = 1;
    private int lineX = 0;
    private int lineZ = 0;
    private int lineY = 0;
    private int sideX = 20 ;
    private int sideY;
    private int sideZ = 20 ;
    ArrayList<ItemStack> drops;

    private ItemStack stack;
    private boolean flag = false;
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

    private void setStackItem(ItemStack stack) {
        int controll = 0;
        int imput = 0;
        TileEntity tileEntityChest = worldObj.getTileEntity(xCoord, yCoord + 1, zCoord);
        //worldObj.spawnEntityInWorld(new EntityItem(worldObj, xCoord, yCoord + 1, zCoord, stack.copy()));
        if (tileEntityChest instanceof IInventory) {
            IInventory tileChest = (IInventory) tileEntityChest;
                while (imput < tileChest.getSizeInventory() && stack != null){

                    if(tileChest.getStackInSlot(imput) != null
                            && tileChest.isItemValidForSlot(imput, stack)
                            && tileChest.getStackInSlot(imput).getItem().equals(stack.getItem())
                            && tileChest.getStackInSlot(imput).stackSize < 64)
                    {
                        tileChest.getStackInSlot(imput).stackSize += stack.stackSize;
                        break;

                    }else if (tileChest.isItemValidForSlot(imput, stack) && tileChest.getStackInSlot(imput) == null){
                        tileChest.setInventorySlotContents(imput, stack);
                        //imput++;
                        break;
                    }
                    if (imput > tileChest.getSizeInventory()-1){
                        worldObj.spawnEntityInWorld(new EntityItem(worldObj, xCoord, yCoord + 1, zCoord, stack.copy()));
                    }

                    imput++;
                    controll ++;
                    if (controll > (tileChest.getSizeInventory() + 100)){
                        Minecraft.getMinecraft().thePlayer.sendChatMessage("ERROR!!!");
                        break;
                    }
                }
//            }
        }else {
            if (stack != null) {
                worldObj.spawnEntityInWorld(new EntityItem(worldObj, xCoord, yCoord + 1, zCoord, stack.copy()));
                stack = null;
            }
        }
    }



    @Override
    public void updateEntity() {
        Block block;

        sideY = yi;

        int targetX = xi + lineX;
        int targetY = yi - lineY;
        int targetZ = zi + lineZ;

        if (flag) {
            block = worldObj.getBlock(targetX, targetY, targetZ);
            while (block != null && block.isAir(worldObj, targetX, targetY, targetZ)) {

                lineX++;

                if (lineX >= sideX) {
                    lineX = 0;
                    lineZ++;
                    if (lineZ >= sideZ) {
                        lineZ = 0;
                        lineY++;
                    }
                }

                targetX = xi + lineX;
                targetY = yi - lineY;
                targetZ = zi + lineZ;

                block = worldObj.getBlock(targetX, targetY, targetZ);
               //System.out.println("x: " + targetX + ", y:" + targetY + ", z: " + targetZ);
            }

            if (block != null) {
                if (block.getMaterial().isLiquid()) {
                    worldObj.setBlockToAir(targetX, targetY, targetZ);
                }
                mine(block, targetX, targetY, targetZ, fortune);
            }
        }
    }

    private void mine(Block block, int x, int y, int z, int fortune){
        if (!worldObj.isRemote) {
                //do
                if (canBreak(block, x, y, z)){
                    int meta = worldObj.getBlockMetadata(x, y, z);
                    drops = block.getDrops(worldObj, xCoord, yCoord, zCoord, meta, fortune);
                }
                if (drops != null) {
                    //setStackItem(drops);
                    for (ItemStack item : drops) {
                        worldObj.spawnEntityInWorld(new EntityItem(worldObj, x+0.5, y+0.5, z+0.5, item.copy()));
                    }
                    chancDrops(x, y, z);
                    drops.clear();
                    markDirty();
                }

            
                worldObj.func_147480_a(x, y, z, false);
                lineX++;

            if (lineX >= sideX){
                lineX = 0;
                lineZ ++;

                if (lineZ >= sideZ) {
                    lineX = 0;
                    lineZ = 0;
                    lineY++;

                    if (lineY >= sideY) {
                        flag = false;
                        Minecraft.getMinecraft().thePlayer.sendChatMessage("Off");
                    }
                }
            }
        }
    }

    private void chancDrops(int targetX, int targetY, int targetZ){
        int rangeHor = 3;
        int rangeVer = 1;

        List<EntityItem> items = worldObj.getEntitiesWithinAABB(EntityItem.class, AxisAlignedBB.getBoundingBox(
                targetX + 0.5 - rangeHor,
                targetY + 0.5 - rangeVer,
                targetZ + 0.5 - rangeHor,
                targetX + 0.5 + rangeHor,
                targetY + 0.5 + rangeVer,
                targetZ + 0.5 + rangeHor
        ));

        for (EntityItem item : items){
            if(item.isDead) continue;
            setStackItem(item.getEntityItem().copy());

            if(stack == null)
                item.setDead();
            else
                item.setEntityItemStack(stack.copy());


        }
    }






    private boolean canBreak(Block block, int x, int y, int z) { //Если блок можно добыть
        return !block.isAir(worldObj, x, y, z) && block.getBlockHardness(worldObj, x, y, z) >= 0 && !block.getMaterial().isLiquid() && block != Blocks.bedrock;
    }


    public void active(int x, int y, int z){
        if (!flag){
            flag = true;
            xi = x+1;
            yi = y+2;
            zi = z;
            Minecraft.getMinecraft().thePlayer.sendChatMessage("On");
        }else {
            flag = false;
            Minecraft.getMinecraft().thePlayer.sendChatMessage("Off");
        }
    }

    public void isShiftActive(){
        if (fortune >= 9){
            fortune = 1;
            Minecraft.getMinecraft().thePlayer.sendChatMessage("Fortune is clear");
        }else {
            fortune += 1;
            Minecraft.getMinecraft().thePlayer.sendChatMessage("Fortune = " + fortune);
        }
    }
}
