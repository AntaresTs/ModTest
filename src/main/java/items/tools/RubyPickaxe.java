package items.tools;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.proxy.common.handler.ModRegMaterial;
import com.example.examplemod.utils.ModItemGroop;
import com.google.common.collect.Sets;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

import java.util.Set;

public class RubyPickaxe extends ItemTool {
    public static final Set<Block> HARVEST_BLOCKS = Sets.newHashSet(
            Blocks.cobblestone, Blocks.double_stone_slab, Blocks.stone_slab, Blocks.stone, Blocks.sandstone,
            Blocks.mossy_cobblestone, Blocks.iron_ore, Blocks.iron_block, Blocks.coal_ore, Blocks.gold_block,
            Blocks.gold_ore, Blocks.diamond_ore, Blocks.diamond_block, Blocks.ice, Blocks.netherrack, Blocks.lapis_ore,
            Blocks.lapis_block, Blocks.redstone_ore, Blocks.lit_redstone_ore, Blocks.rail, Blocks.detector_rail,
            Blocks.golden_rail, Blocks.activator_rail
    );

    public RubyPickaxe(){
        super(2F, ModRegMaterial.RUBY_TOOL_MATERIAL, HARVEST_BLOCKS);
        setUnlocalizedName("");
        setTextureName(ExampleMod.MODID + ":ruby_pickaxe");
        setCreativeTab(ModItemGroop.ModTools);

        setHarvestLevel("pickaxe", ModRegMaterial.RUBY_TOOL_MATERIAL.getHarvestLevel());
    }

    @Override
    public boolean func_150897_b(Block block){
        if(block == Blocks.obsidian) {
            return toolMaterial.getHarvestLevel() == 10;
        }
        return block != Blocks.diamond_block && block != Blocks.diamond_ore ? block != Blocks.emerald_ore && block != Blocks.emerald_block ? block != Blocks.gold_block && block != Blocks.gold_ore ? block != Blocks.iron_block && block != Blocks.iron_ore ? block != Blocks.lapis_block && block != Blocks.lapis_ore ? block != Blocks.redstone_ore && block != Blocks.lit_redstone_ore ? block.getMaterial() == Material.rock || block.getMaterial() == Material.iron || block.getMaterial() == Material.anvil : toolMaterial.getHarvestLevel() >= 2 : toolMaterial.getHarvestLevel() >= 1 : toolMaterial.getHarvestLevel() >= 1 : toolMaterial.getHarvestLevel() >= 2 : toolMaterial.getHarvestLevel() >= 2 : toolMaterial.getHarvestLevel() >= 2;
    }

    @Override
    public float func_150893_a (ItemStack toolStack, Block block) {
        if (block.getMaterial() != Material.iron && block.getMaterial() != Material.anvil && block.getMaterial() != Material.rock)
            return super.func_150893_a(toolStack, block);
        return efficiencyOnProperMaterial;
    }

//    @Override
//    public boolean onBlockDestroyed(ItemStack itemStack, World world, Block block, int x, int y, int z, EntityLivingBase entityLivingBase) {
//
//        return true;
//    }
}
