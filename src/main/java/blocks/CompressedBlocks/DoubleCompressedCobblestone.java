package blocks.CompressedBlocks;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.utils.ModItemGroop;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class DoubleCompressedCobblestone extends Block {
    public DoubleCompressedCobblestone(){
        super(Material.rock);
        setBlockName("double_compressed_cobblestone");
        setBlockTextureName(ExampleMod.MODID + ":double_compressed_cobblestone");
        setCreativeTab(ModItemGroop.ModBlocks);
        setHardness(10);
        setResistance(30.0F);
    }
}
