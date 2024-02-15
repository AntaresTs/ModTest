package com.example.examplemod.proxy.common.handler;

import cpw.mods.fml.common.registry.GameRegistry;
import items.tools.*;

public class ModRegTools {
    public static final RubySword RUSW = new RubySword();
    public static final RubyAxe RUAXE = new RubyAxe();
    public static final RubyPickaxe RUPICK = new RubyPickaxe();
    public static final RubySpade RUSP = new RubySpade();
    public static final RubyMultiTool RUMUTO = new RubyMultiTool();

    public static void register(){
        GameRegistry.registerItem(RUSW, "rubu sword");
        GameRegistry.registerItem(RUAXE, "ruby axe");
        GameRegistry.registerItem(RUPICK, "ruby pickaxe");
        GameRegistry.registerItem(RUSP, "Ruby spade");
        GameRegistry.registerItem(RUMUTO, "Ruby multi tool");
    }
}
