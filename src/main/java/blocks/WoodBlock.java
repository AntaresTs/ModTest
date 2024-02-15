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
        setLightLevel(5F);                                // Светимость блока
        setLightOpacity(10);                              //Прозрачность блока
        setHardness(20);                                  //Прочность блока
        setResistance(20.0F);                             //Взрывоустойчивость (у большенства = 10, у обсидиана 2000)
        setHarvestLevel("axe", 2);         // Добыча каким инструментом и с каким левелом
        setCreativeTab(ModItemGroop.ModBlocks);                 // Вкладка в креативе
    }

//    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z){ // Позволяет переходить сквозь блок
//        return null;
//    }

    @SideOnly(Side.CLIENT)
    public boolean onBlockActivated(World world, int p2, int p3, int p4, EntityPlayer player, int p6, float p7, float p8, float p9){ // если игрок провзаимодействовал с блоком
        Minecraft.getMinecraft().thePlayer.sendChatMessage("Это сообщение на русском? no..., fuc you!"); //Сообщение в чат игрока
        MinecraftServer.getServer().getCommandManager().executeCommand(MinecraftServer.getServer(), "weather rain"); //Исполнение команды (Кто отправил команду, сама команда)
        Minecraft.getMinecraft().thePlayer.setHealth(1F);

        return true;
    }

}
