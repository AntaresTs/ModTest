package com.example.examplemod.proxy;

import com.example.examplemod.proxy.common.CommonProxy;
import cpw.mods.fml.common.SidedProxy;

public class McModding {
    @SidedProxy(
            clientSide = "com.example.examplemod.proxy.client.ClientProxy",
            serverSide = "com.example.examplemod.proxy.common.CommonProxy"
    )
    public static CommonProxy proxy;
}
