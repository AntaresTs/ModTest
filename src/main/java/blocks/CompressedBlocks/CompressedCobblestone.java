package blocks.CompressedBlocks;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.utils.ModItemGroop;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CompressedCobblestone extends Block {
    public CompressedCobblestone(){
        super(Material.rock);
        setBlockName("compressed_cobblestone");
        setBlockTextureName(ExampleMod.MODID + ":compressed_cobblestone");
        setCreativeTab(ModItemGroop.ModBlocks);
        setHardness(10);
        setResistance(20.0F);
    }
}
