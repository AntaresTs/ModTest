package items;

import com.example.examplemod.utils.ModItemGroop;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.ItemFluidContainer;

import java.util.List;

public class FluidCellItem extends ItemFluidContainer {
    public FluidCellItem() {
        // Первое значение ни на что не влияет, вторым значением является кол-во вмещаемой жидкости.
        super(0, 5_000);
        setUnlocalizedName("fluid_cell");
        setTextureName("fluid_cell");
        setCreativeTab(ModItemGroop.ModFluid);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer holder, List tooltip, boolean isAdv) { //позволяет элементам добавлять пользовательские строки информации к описанию при наведении курсора мыши
        // Воспользуемся уже готовым методом для получения стека жидкости.
        FluidStack fluidStack = getFluid(stack);
        if (fluidStack != null) {
            tooltip.add(fluidStack.amount + " / " + capacity + " mB (" + fluidStack.getLocalizedName() + ")");
        } else {
            tooltip.add("<empty>");
        }
    }
}
