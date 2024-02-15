package com.example.examplemod.proxy.client.render.blocks;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.world.IBlockAccess;

public class RubyBlockRenderer implements ISimpleBlockRenderingHandler {
    /**
     * ������ ����� �������� �� ��������� ����� � ���������.
     *
     * @param block ���� ��� �������� ����������� ������ ���������
     * @param metadata ���������� �����
     * @param modelId ���������� ������������� ������
     * @param renderer ���������� ������ ������
     */
    @Override
    public void renderInventoryBlock(Block block, int metadata, int modelId, RenderBlocks renderer) {
    }

    /**
     * ������ ����� ���������� �������������, � ����� �� ��������� ����� � ����.
     *
     * @param world     ��� � ������� ��������� ����.
     * @param x         ������� ����� �� X ����������.
     * @param y         ������� ����� �� Y ����������.
     * @param z         ������� ����� �� Z ����������.
     * @param block     ���� ��� �������� ����������� ������ ���������.
     * @param modelId   ���������� ������������� ������.
     * @param renderer  ���������� ������ ������.
     * @return ���������� ������� ��� ��������� ����� � ����
     */
    @Override
    public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {
        return false;
    }

    /**
     * ������ ����� ���������� ������������� ��������� ����� � 3D ����. ��� ������ ��������� �������, ���� �� ����� ����������.
     *
     * @param modelId ���������� ������������� ������.
     * @return ���������� ������� ��� ��������� ������ � 3D ����.
     */
    @Override
    public boolean shouldRender3DInInventory(int modelId) {
        return false;
    }

    /**
     * ���������� ������������� ��������� �����. �� ������ ���� ���� 42 �����, ����� ����� �������� � ��������� ���������� ������!
     *
     * @return ���������� ���������� �����.
     */
    @Override
    public int getRenderId() {
        return 0;
    }
}