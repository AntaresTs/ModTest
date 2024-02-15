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
        setLightLevel(5F);                                // ���������� �����
        setLightOpacity(10);                              //������������ �����
        setHardness(20);                                  //��������� �����
        setResistance(10.0F);                             //������������������ (� ����������� = 10, � ��������� 2000)
        setHarvestLevel("pickaxe", 2);      // ������ ����� ������������ � � ����� �������
        setCreativeTab(ModItemGroop.ModBlocks);
    }
}
