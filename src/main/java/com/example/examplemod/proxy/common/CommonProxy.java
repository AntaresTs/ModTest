package com.example.examplemod.proxy.common;

import com.example.examplemod.proxy.common.handler.*;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent event) {
        //FMLCommonHandler.instance().bus().register(new FMLEventListener());
        ModRegItems.register();
        ModRegTools.register();
        ModRegBlocks.register();
        MinecraftForge.EVENT_BUS.register(new BucketHandler());
    }

    public void init(FMLInitializationEvent event) {

    }

    public void postInit(FMLPostInitializationEvent event) {
        ModRegReciptes.registerRecipes();
    }
}
