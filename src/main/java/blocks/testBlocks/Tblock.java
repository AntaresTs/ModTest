package blocks.testBlocks;

import blocks.SmelterBlock;
import blocks.tile.StorageTile;
import com.example.examplemod.ExampleMod;
import com.example.examplemod.test.Gui;
import com.example.examplemod.utils.ModItemGroop;
import com.google.common.collect.Sets;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Random;

public class Tblock extends BlockContainer  {

    public boolean cwich = false;
    @SideOnly(Side.CLIENT)
    private IIcon faceIcon;

    public Tblock(){
        super(Material.iron);
        setBlockName("tblock");
        setBlockTextureName(ExampleMod.MODID + ":tblock");
        setCreativeTab(ModItemGroop.ModBlocks);
        setResistance(9999999);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int metadata) {
        return new TestBlockTile();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
        return side == 1 ? faceIcon : (side == 0 ? faceIcon : blockIcon);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register) {
        super.registerBlockIcons(register);
        faceIcon = register.registerIcon(ExampleMod.MODID + ":tblockfase");
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
        if (world.isRemote){
            //Minecraft.getMinecraft().displayGuiScreen(new Gui());

            TileEntity tile = world.getTileEntity(x, y, z);
            if(tile instanceof TestBlockTile){
                TestBlockTile tesBlTil = (TestBlockTile) tile;
                tesBlTil.active(player, player.getHeldItem());
            }
        }
        return true;
    }

    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World world, int x, int y, int z, Random random){
        if (this.cwich){
            for (int i = 0; i < 10; i++) {
                world.spawnParticle("smoke", x+random.nextFloat(), y+1, z+random.nextFloat(), 0.0D, 0.0D, 0.0D);
            }
        }

    }
}
