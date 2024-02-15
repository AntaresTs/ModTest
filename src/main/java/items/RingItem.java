package items;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.utils.ModItemGroop;
import net.minecraft.item.Item;
public class RingItem extends Item{
    public RingItem(){
        setUnlocalizedName("ring");
        setTextureName(ExampleMod.MODID + ":ring");
        setMaxStackSize(1);
        setCreativeTab(ModItemGroop.ModItems);
    }
}
