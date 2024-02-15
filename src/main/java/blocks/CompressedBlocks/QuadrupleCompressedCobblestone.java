package blocks.CompressedBlocks;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.utils.ModItemGroop;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class QuadrupleCompressedCobblestone extends Block {
    public QuadrupleCompressedCobblestone(){
        super(Material.rock);
        setBlockName("quadruple_compressed_cobblestone");
        setBlockTextureName(ExampleMod.MODID + ":quadruple_compressed_cobblestone");
        setCreativeTab(ModItemGroop.ModBlocks);
        setHardness(10);
        setResistance(50.0F);
    }
}
