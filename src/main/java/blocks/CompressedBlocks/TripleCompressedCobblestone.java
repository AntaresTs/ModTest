package blocks.CompressedBlocks;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.utils.ModItemGroop;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TripleCompressedCobblestone extends Block {
    public TripleCompressedCobblestone(){
        super(Material.rock);
        setBlockName("triple_compressed_cobblestone");
        setBlockTextureName(ExampleMod.MODID + ":triple_compressed_cobblestone");
        setCreativeTab(ModItemGroop.ModBlocks);
        setHardness(10);
        setResistance(40.0F);
    }
}
