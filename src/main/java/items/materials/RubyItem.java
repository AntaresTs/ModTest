package items.materials;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.utils.ModItemGroop;
import net.minecraft.item.Item;

public class RubyItem extends Item {
    public RubyItem(){
        setUnlocalizedName("item_ruby");
        setTextureName(ExampleMod.MODID+":item_ruby");
        setMaxStackSize(64);
        setCreativeTab(ModItemGroop.ModItems);
    }
}
