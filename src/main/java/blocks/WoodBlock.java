package blocks;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.utils.ModItemGroop;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;

public class WoodBlock extends Block {
    public WoodBlock(){
        super(Material.wood);
        setBlockName("mod_wood_block");
        setBlockTextureName(ExampleMod.MODID + ":mod_wood_block");
        setLightLevel(5F);                                // ���������� �����
        setLightOpacity(10);                              //������������ �����
        setHardness(20);                                  //��������� �����
        setResistance(20.0F);                             //������������������ (� ����������� = 10, � ��������� 2000)
        setHarvestLevel("axe", 2);         // ������ ����� ������������ � � ����� �������
        setCreativeTab(ModItemGroop.ModBlocks);                 // ������� � ��������
    }

//    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z){ // ��������� ���������� ������ ����
//        return null;
//    }

    @SideOnly(Side.CLIENT)
    public boolean onBlockActivated(World world, int p2, int p3, int p4, EntityPlayer player, int p6, float p7, float p8, float p9){ // ���� ����� ������������������� � ������
        Minecraft.getMinecraft().thePlayer.sendChatMessage("��� ��������� �� �������? no..., fuc you!"); //��������� � ��� ������
        MinecraftServer.getServer().getCommandManager().executeCommand(MinecraftServer.getServer(), "weather rain"); //���������� ������� (��� �������� �������, ���� �������)
        Minecraft.getMinecraft().thePlayer.setHealth(1F);

        return true;
    }

}
