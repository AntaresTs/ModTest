package com.example.examplemod.proxy.client.render.blocks;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.world.IBlockAccess;

public class RubyBlockRenderer implements ISimpleBlockRenderingHandler {
    /**
     * Данный метод отвечает за отрисовку блока в инвентаре.
     *
     * @param block блок для которого применяется данная отрисовка
     * @param metadata метаданные блока
     * @param modelId уникальный идентификатор модели
     * @param renderer глобальный рендер блоков
     */
    @Override
    public void renderInventoryBlock(Block block, int metadata, int modelId, RenderBlocks renderer) {
    }

    /**
     * Данный метод определяет необходимость, а также за отрисовку блока в мире.
     *
     * @param world     мир в котором находится блок.
     * @param x         позиция блока по X координате.
     * @param y         позиция блока по Y координате.
     * @param z         позиция блока по Z координате.
     * @param block     блок для которого применяется данная отрисовка.
     * @param modelId   уникальный идентификатор модели.
     * @param renderer  глобальный рендер блоков.
     * @return возвращает условие для отрисовки блока в мире
     */
    @Override
    public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer) {
        return false;
    }

    /**
     * Данный метод определяет необходимость отрисовки блока в 3D виде. При низкой настройки графики, блок не будет сплюснутым.
     *
     * @param modelId уникальный идентификатор модели.
     * @return возвращает условие для отрисовки модели в 3D виде.
     */
    @Override
    public boolean shouldRender3DInInventory(int modelId) {
        return false;
    }

    /**
     * Уникальный идентификатор отрисовки блока. Не должен быть ниже 42 числа, иначе будет конфликт с ванильной отрисовкой блоков!
     *
     * @return возвращает уникальный номер.
     */
    @Override
    public int getRenderId() {
        return 0;
    }
}