package items.tools;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.proxy.common.handler.ModRegMaterial;
import com.example.examplemod.utils.ModItemGroop;
import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemTool;

import java.util.Set;

public class RubySpade extends ItemTool {
    public static final Set<Block> HARVEST_BLOCKS = Sets.newHashSet(
            Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel, Blocks.snow_layer,
            Blocks.snow, Blocks.clay, Blocks.farmland, Blocks.soul_sand, Blocks.mycelium
    );

    public RubySpade(){
        super(1F, ModRegMaterial.RUBY_TOOL_MATERIAL, HARVEST_BLOCKS);
        setUnlocalizedName("ruby_spade");
        setTextureName(ExampleMod.MODID + ":ruby_spade");
        setCreativeTab(ModItemGroop.ModTools);

        setHarvestLevel("shovel", ModRegMaterial.RUBY_TOOL_MATERIAL.getHarvestLevel());
    }
}
