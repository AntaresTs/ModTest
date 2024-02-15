package blocks;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.utils.ModItemGroop;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RubyBlock extends Block {
    public RubyBlock(){
        super(Material.rock);
        setBlockName("ruby_block");
        setBlockTextureName(ExampleMod.MODID + ":ruby_block");
        setLightLevel(5F);                                // Светимость блока
        setLightOpacity(10);                              //Прозрачность блока
        setHardness(20);                                  //Прочность блока
        setResistance(10.0F);                             //Взрывоустойчивость (у большенства = 10, у обсидиана 2000)
        setHarvestLevel("pickaxe", 2);      // Добыча каким инструментом и с каким левелом
        setCreativeTab(ModItemGroop.ModBlocks);
    }
}
