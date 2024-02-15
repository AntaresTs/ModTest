package items;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.utils.ModItemGroop;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;

public class FoodItem extends ItemFood{
    public FoodItem() {
        super(2, 10F, false);
        setPotionEffect(Potion.moveSpeed.id, 20, 100, 1F);
        setAlwaysEdible();

        setUnlocalizedName("high_speed_leg");
        setTextureName(ExampleMod.MODID + ":high_speed_leg");
        setMaxStackSize(64);

        setCreativeTab(ModItemGroop.ModItems);

    }
}

