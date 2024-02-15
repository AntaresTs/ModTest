package blocks;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.utils.ModItemGroop;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class FaceBlock extends Block {
    @SideOnly(Side.CLIENT)
    private IIcon faceIcon;

    public FaceBlock(){
        super(Material.rock);
        setBlockName("fase");
        setBlockTextureName(ExampleMod.MODID + "block_fase");
        setCreativeTab(ModItemGroop.ModBlocks);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) { // ���������� �������� �����. ���������: �������, ����������
        if (meta == 2 && side == 2) return faceIcon;
        if (meta == 3 && side == 5) return faceIcon;
        if (meta == 0 && side == 3) return faceIcon;
        if (meta == 1 && side == 4) return faceIcon;
        return blockIcon;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register) {
        super.registerBlockIcons(register);
        faceIcon = register.registerIcon(ExampleMod.MODID + ":face");
    }

    /**
     * ������ ����� ���������� ����� ��������� ����� � ����.
     *
     * @param world     ��� � ������� ��������������� ����.
     * @param x         ������� �� ������� ��� ���������� ���� �� X ����������.
     * @param y         ������� �� ������� ��� ���������� ���� �� Y ����������.
     * @param z         ������� �� ������� ��� ���������� ���� �� Z ����������.
     * @param placer    �������� ������������ ���� � ����.
     * @param stack     ������� � ������� �������� ��� ���������� ����.
     */
    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase placer, ItemStack stack) {
        int direction = MathHelper.floor_double(((placer.rotationYaw * 4.0) / 360.0) + 2.5) & 3;
        world.setBlockMetadataWithNotify(x, y, z, direction, 2);
    }
}
