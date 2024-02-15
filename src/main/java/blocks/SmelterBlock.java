package blocks;

import blocks.tile.SmelterTile;
import com.example.examplemod.ExampleMod;
import com.example.examplemod.utils.ModItemGroop;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class SmelterBlock extends BlockContainer {
    public SmelterBlock(){
        super(Material.iron);
        setBlockName("smalter");
        setBlockTextureName(ExampleMod.MODID + ":smalter");
        setCreativeTab(ModItemGroop.ModBlocks);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int metadata) {
        return new SmelterTile();
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer activator, int side, float hitX, float hitY, float hitZ){
        if(!world.isRemote){
            TileEntity tile = world.getTileEntity(x, y, z);

            if(tile instanceof SmelterTile){
                SmelterTile smelter = (SmelterTile) tile;
                smelter.handleInputStack(activator, activator.getHeldItem());
            }
        }
        return true;
    }
}
