package com.example.examplemod.proxy.common.handler;

import blocks.*;
import blocks.CompressedBlocks.CompressedCobblestone;
import blocks.CompressedBlocks.DoubleCompressedCobblestone;
import blocks.CompressedBlocks.QuadrupleCompressedCobblestone;
import blocks.CompressedBlocks.TripleCompressedCobblestone;
import blocks.testBlocks.Tblock;
import blocks.tile.QuarryBlockTile;
import blocks.tile.SmelterTile;
import blocks.tile.StorageTile;
import blocks.testBlocks.TestBlockTile;
import blocks.tile.TankFluidTile;
import com.example.examplemod.ExampleMod;
import com.example.examplemod.proxy.client.render.tile.TankFluidTesr;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fluid.TestFluid;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class ModRegBlocks {
    public static final RubyBlock RUBL = new RubyBlock();
    public static final StorageBlock STBL = new StorageBlock();
    public static final SmelterBlock SMELTER_BLOCK = new SmelterBlock();
    public static final WoodBlock WOOBLOCK = new WoodBlock();
    public static final Tblock TBLOCK = new Tblock();
    public static final QuarryBlock QUARRY_BLOCK = new QuarryBlock();
    public static final FaceBlock FACE_BLOCK = new FaceBlock();

    //region —жатые блоки
    public static final CompressedCobblestone COMPRESSED_COBBLESTONE = new CompressedCobblestone();
    public static final DoubleCompressedCobblestone DOUBLE_COMPRESSED_COBBLESTONE = new DoubleCompressedCobblestone();
    public static final TripleCompressedCobblestone TRIPLE_COMPRESSED_COBBLESTONE = new TripleCompressedCobblestone();
    public static final QuadrupleCompressedCobblestone QUADRUPLE_COMPRESSED_COBBLESTONE = new QuadrupleCompressedCobblestone();
    //endregion
    public static final TankFluidBlock TANK_FLUID_BLOCK = new TankFluidBlock();

    public static final Fluid TEST_FLUID = new Fluid(ExampleMod.MODID + ":t_fluid");
    public static final TankFluidTesr TANK_FLUID_TESR = new TankFluidTesr();
    public static TestFluid TFLU;
    public static final LinoleumBlock LINOLEUM_BLOCK = new LinoleumBlock();

    public static void CliReg(){
        ClientRegistry.bindTileEntitySpecialRenderer(TankFluidTile.class, TANK_FLUID_TESR);
    }

    public static void register(){

        GameRegistry.registerBlock(RUBL, "ruby_block");
        GameRegistry.registerBlock(WOOBLOCK, "Wood block");
        GameRegistry.registerBlock(FACE_BLOCK, "Fase block");
        GameRegistry.registerBlock(LINOLEUM_BLOCK, "Linoleum");


        //region —жатые блоки
        GameRegistry.registerBlock(COMPRESSED_COBBLESTONE, "Compressed Cobblestone");
        GameRegistry.registerBlock(DOUBLE_COMPRESSED_COBBLESTONE, "Double Compressed Cobblestone");
        GameRegistry.registerBlock(TRIPLE_COMPRESSED_COBBLESTONE, "Triple Compressed Cobblestone");
        GameRegistry.registerBlock(QUADRUPLE_COMPRESSED_COBBLESTONE, "Quadruple Compressed Cobblestone");
        //endregion

        GameRegistry.registerBlock(STBL, "storage block");
        GameRegistry.registerTileEntity(StorageTile.class, ExampleMod.MODID + ":storage");
        GameRegistry.registerBlock(SMELTER_BLOCK, "Smelter block");
        GameRegistry.registerTileEntity(SmelterTile.class, ExampleMod.MODID + ":smelter");
        GameRegistry.registerBlock(TANK_FLUID_BLOCK, "tank fluid block");
        GameRegistry.registerTileEntity(TankFluidTile.class, "Tank fluid tile");
        GameRegistry.registerBlock(QUARRY_BLOCK, "Quary block");
        GameRegistry.registerTileEntity(QuarryBlockTile.class, "Quary block tile");

        GameRegistry.registerBlock(TBLOCK, "Test Block");
        GameRegistry.registerTileEntity(TestBlockTile.class, ExampleMod.MODID + ":tblock_tile");


        //∆идкость должна быть зарегистрирована раньше чем блок еЄ производ€щий
        if (FluidRegistry.registerFluid(TEST_FLUID)){
            TFLU = new TestFluid(TEST_FLUID);
            GameRegistry.registerBlock(TFLU, "test fluid");

            ModRegItems.TBUC = BucketHandler.registryBucket("t_fluid", TEST_FLUID);
        }
    }
}
