package items.tools;


import com.example.examplemod.ExampleMod;
import com.example.examplemod.proxy.common.handler.ModRegMaterial;
import com.example.examplemod.utils.ModItemGroop;
import net.minecraft.item.ItemSword;

public class RubySword extends ItemSword {
    public RubySword(){
        super(ModRegMaterial.RUBY_TOOL_MATERIAL);
        setUnlocalizedName("ruby_sword");
        setTextureName(ExampleMod.MODID + ":ruby_sword");
        setCreativeTab(ModItemGroop.ModTools);
    }
}
