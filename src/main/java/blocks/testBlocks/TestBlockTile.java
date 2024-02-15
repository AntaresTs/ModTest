package blocks.testBlocks;

import com.example.examplemod.proxy.common.handler.ModRegBlocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EffectRenderer;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityMinecartTNT;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.play.server.S2APacketParticles;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.Constants;

import java.util.ArrayList;

public class TestBlockTile extends TileEntity {
    private ItemStack stack;
    private boolean flag = false;
    private int sicl = 6000;
    private static final String INV_TAG = "Inventory";

    @Override
    public void writeToNBT(NBTTagCompound nbt){
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
            ItemStack out = new ItemStack(Item.getItemFromBlock(Blocks.gravel));
            out.stackSize = 2;

            worldObj.spawnEntityInWorld(new EntityItem(worldObj ,xCoord+0.5,yCoord+1, zCoord+0.5, out));
            stack = null;
        }
    }

    //

    public void active(EntityPlayer player, ItemStack stack1){
        if (player.getHeldItem() != null) {
            if (stack1.getItem().equals(Item.getItemFromBlock(Blocks.cobblestone))) {
                stack = stack1.copy();
                stack.stackSize = 1;
                --stack1.stackSize;
            }

        }

    }
}
//world.spawnParticle("smoke", x, y+1, z, 0.0D, 0.0D, 0.0D);
// Minecraft.getMinecraft().thePlayer.sendChatMessage(block.getBlockBoundsMaxX() + "");