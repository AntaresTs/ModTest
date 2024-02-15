package blocks.testBlocks;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.utils.ModItemGroop;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class TestBlockGenerator extends Block {
    @SideOnly(Side.CLIENT)
    private IIcon faceIcon;

    public TestBlockGenerator(){
        super(Material.iron);
        setBlockName("tblock_generator");
        setBlockTextureName(ExampleMod.MODID + ":tblock_generator");
        setCreativeTab(ModItemGroop.ModBlocks);
        setResistance(9999999);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register) {
        super.registerBlockIcons(register);
        faceIcon = register.registerIcon(ExampleMod.MODID + ":tblockfase");
    }

    @Override
    public TileEntity createTileEntity(World world, int metadata) {
        return new TestTileGenerator();
    }

}
