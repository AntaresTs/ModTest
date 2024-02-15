package blocks;

import blocks.tile.ShrederTile;
import com.example.examplemod.ExampleMod;
import com.example.examplemod.utils.ModItemGroop;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class ShrederBlock extends BlockContainer {
    @SideOnly(Side.CLIENT)
    private IIcon faceIcon;
    public ShrederBlock(){
        super(Material.iron);
        setBlockName("shreder");
        setBlockTextureName(ExampleMod.MODID + "shreder_block");
        setCreativeTab(ModItemGroop.ModBlocks);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int metadata) {
        return null;
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
        TileEntity tile = world.getTileEntity(x, y, z);
        if (tile instanceof ShrederTile){
            ShrederTile shrederTile = (ShrederTile) tile;
            shrederTile.activate(player, player.getHeldItem());
        }
        return true;
    }
}
