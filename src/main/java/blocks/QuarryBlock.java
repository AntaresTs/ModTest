package blocks;

import blocks.testBlocks.TestBlockTile;
import blocks.tile.QuarryBlockTile;
import com.example.examplemod.ExampleMod;
import com.example.examplemod.utils.ModItemGroop;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class QuarryBlock extends BlockContainer {
    public QuarryBlock(){
        super(Material.iron);
        setBlockName("quarry_block");
        setBlockTextureName(ExampleMod.MODID + ":quarry_block");
        setCreativeTab(ModItemGroop.ModBlocks);
    }

    @Override
    public TileEntity createNewTileEntity(World world, int metadata) {
        return new QuarryBlockTile();
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {

        if (!world.isRemote){
            TileEntity tile = world.getTileEntity(x, y, z);

            if(tile instanceof QuarryBlockTile){
                QuarryBlockTile quarBlTil = (QuarryBlockTile) tile;

                if (player.isSneaking()){
                    quarBlTil.isShiftActive();
                }else{

                    quarBlTil.active(x, y, z);
                }
            }
        }

        return true;
    }
}
