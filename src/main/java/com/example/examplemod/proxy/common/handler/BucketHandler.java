package com.example.examplemod.proxy.common.handler;

import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import items.BucketItem;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBucket;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;

import java.util.HashMap;
import java.util.Map;

public class BucketHandler {
    private static final Map<Block, ItemBucket> buckets = new HashMap<>();

    /**
     * ��������������� ����� ����������� ��� ������� ����������� ����.
     *
     * @param name  �������� �����
     * @param fluid �������� � ������� ����� ��������� �����.
     * @return ���������� ������ �����.
     */

    public static BucketItem registryBucket(String name, Fluid fluid) {
        BucketItem bucket = new BucketItem(name, fluid.getBlock());
        // ������������ ��������� �����.
        GameRegistry.registerItem(bucket, name + "_bucket");
        // ������������ ��������� � ���������, �.�. �����. ��������� ���������� �������� ���� ������� �����.
        FluidContainerRegistry.registerFluidContainer(fluid, new ItemStack(bucket), FluidContainerRegistry.EMPTY_BUCKET);
        // ��������� � ������ ����� �������� �����, ������� ����� �������� ��� ����� ��������.
        buckets.put(fluid.getBlock(), bucket);
        return bucket;
    }

    @SubscribeEvent
    public void onFluidBucket(FillBucketEvent event){
        // �������� ����� �� �����, �� �������� ���� ��������� ����.
        ItemBucket bucket = buckets.get(event.world.getBlock(event.target.blockX, event.target.blockY, event.target.blockZ));

        if (bucket != null && event.world.getBlockMetadata(event.target.blockX, event.target.blockY, event.target.blockZ) == 0){
            event.world.setBlockToAir(event.target.blockX, event.target.blockY, event.target.blockZ);
            event.result = new ItemStack(bucket);
            event.setResult(Event.Result.ALLOW);
        }
    }
}
