package items;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.utils.ModItemGroop;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBucket;

public class BucketItem extends ItemBucket {
    public BucketItem(String name, Block fluidBlock){
        super(fluidBlock);
        setUnlocalizedName(name + "_bucket");
        setMaxStackSize(1);
        setCreativeTab(ModItemGroop.ModFluid);
        setTextureName(ExampleMod.MODID + ':' + name + "_bucket");
    }
}
