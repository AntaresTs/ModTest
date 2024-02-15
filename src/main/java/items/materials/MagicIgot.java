package items.materials;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.utils.ModItemGroop;
import net.minecraft.item.Item;

public class MagicIgot extends Item {
    public MagicIgot(){
        setUnlocalizedName("magic_igot");
        setTextureName(ExampleMod.MODID+":item_magic_igot");
        setMaxStackSize(100);
        setCreativeTab(ModItemGroop.ModItems);
    }
}
