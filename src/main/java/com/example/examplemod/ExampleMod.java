package com.example.examplemod;

import com.example.examplemod.proxy.common.CommonProxy;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

import java.io.File;


@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "tmod";
    public static final String VERSION = "1.0";

    @SidedProxy(
            clientSide = "com.example.examplemod.proxy.client.ClientProxy",
            serverSide = "com.example.examplemod.proxy.common.CommonProxy"
    )
    public static CommonProxy proxy;

    // Не рекоммендуется оставлять информацию о загрузке модов
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){

        System.out.println("Предварительная инициализация мода");
        proxy.preInit(event);
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event){

        System.out.println("инициализация мода");
        proxy.init(event);
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

        System.out.println("Пост-инициализация мода");
        proxy.postInit(event);
    }
}
