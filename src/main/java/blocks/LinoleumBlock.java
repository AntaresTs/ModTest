package blocks;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.utils.ModItemGroop;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class LinoleumBlock extends Block {
    public LinoleumBlock(){
        super(Material.wood);
        setBlockName("linoleum");
        setBlockTextureName(ExampleMod.MODID + ":linoleum_block");
        setCreativeTab(ModItemGroop.ModBlocks);
        setHardness(10);
        setHarvestLevel("axe", 1);
    }
}
