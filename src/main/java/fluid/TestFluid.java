package fluid;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.utils.ModItemGroop;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.world.World;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class TestFluid extends BlockFluidClassic {
    public TestFluid(Fluid fluid){
        super(fluid, Material.water);

        fluid.setBlock(this);
        setBlockName("test_fluid");
        setBlockTextureName(ExampleMod.MODID + ":testFluid_still");
        setCreativeTab(ModItemGroop.ModFluid);
    }

    @Override
    public boolean displaceIfPossible(World world, int x, int y, int z) {
        return !world.getBlock(x, y, z).getMaterial().isLiquid() && super.displaceIfPossible(world, x, y, z);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register) {
        super.registerBlockIcons(register);
        // Получаем переданную жидкость через конструктор и добавляем ей текстуру неподвижной и подвижной жидкости.
        getFluid().setIcons(blockIcon, register.registerIcon(ExampleMod.MODID + ":testFluid_flow"));
    }
}
