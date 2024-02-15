package items;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.utils.ModItemGroop;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

import java.util.List;

public class Stick extends Item {
    boolean mode = false;
    public Stick(){
        setUnlocalizedName("mod_stick");
        setTextureName(ExampleMod.MODID + "mod_stick");
        setMaxStackSize(1);
        // setMaxDamage(800); //Прочность предмета
        setCreativeTab(ModItemGroop.ModItems);
    }

    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack parItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4){ //Описание предмета
        par3List.add("§2Good stick");
        par3List.add("§2stick");
    }

//    public boolean hitEntity(ItemStack parItemStack, EntityLivingBase p_77644_2_, EntityLivingBase Entity) { // Срабатывает когда Entity уже получил урон
//        parItemStack.damageItem(10, Entity); // Предмету будет наносится урон разомером 10 ед. при ударе по Entity
//        return false;
//    }

    public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) { // Срабатывает когда произведен шелчек левой кнопкой мыши по энтитb

        return false;
    }

    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
        if(world.isRemote){ //Если происходит на стороне клиенка (при !world.isRemote - на стороне сервера)
            if (!mode){
                player.addChatMessage(new ChatComponentText("fliy on"));            //Вывести сообщение в чат игрока
                player.capabilities.allowFlying = true;                                           //Включить режим полета для игрока
                mode = true;
            }else {
                player.addChatMessage(new ChatComponentText("fliy off"));
                player.capabilities.allowFlying = false;          // capabilities.isFlying - Обозначает что мы именно летаем,
                mode = false;                                  // т.е. если призимлится на землю то мы получим урон, если хотим чтобы урон не получали
            }                                                  // надо писать capabilities.allowFlying (так будет полет как в креативе)
        }
        return itemStack;
    }

    public boolean itemInteractionForEntity(ItemStack itemStack, EntityPlayer player, EntityLivingBase entity) { //Когда ПКМ по энтити
        player.addChatMessage(new ChatComponentText("PCM is entity; Entity clear!"));
        entity.isDead = true;

        return false;
    }

    public void onUpdate(ItemStack itemStack, World world, Entity entity, int par4, boolean par5) { //Происходит каждый тик если энтити содержит данный предмет
        super.onUpdate(itemStack, world, entity, par4, par5);
        if(entity instanceof EntityPlayer){ //если энтити является игроком
            EntityPlayer player = (EntityPlayer) entity;
            ItemStack equippad = player.getCurrentEquippedItem();

            if (equippad == itemStack){ // если у игрока есть эта палка, то он получает следующие эффекты.
                player.addPotionEffect(new PotionEffect(Potion.jump.id, 2, 2, true));
                player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 2, 2, true));
            }
        }
    }

    public void onCreated(ItemStack p_77622_1_, World world, EntityPlayer player) { //Если предмет скрафчен
        if (!world.isRemote){ //Также проверка на клиентскую/серверную часть
            player.addChatMessage(new ChatComponentText("crafted"));
        }
    }

}
