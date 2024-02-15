package blocks;

import blocks.tile.TankFluidTile;
import com.example.examplemod.ExampleMod;
import com.example.examplemod.proxy.client.render.tile.TankFluidTesr;
import com.example.examplemod.proxy.common.handler.ModRegBlocks;
import com.example.examplemod.proxy.common.handler.ModRegItems;
import com.example.examplemod.utils.ModItemGroop;
import items.FluidCellItem;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidStack;


public class TankFluidBlock extends BlockContainer {
    public TankFluidBlock(){
        super(Material.iron);
        setBlockName("tank_fluid");
        setBlockTextureName(ExampleMod.MODID + ":tank_fluid");
        setCreativeTab(ModItemGroop.ModFluid);
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer activator, int side, float hitX, float hitY, float hitZ) {
        if (world.isRemote) {

            return true;
        }

        TileEntity tile = world.getTileEntity(x, y, z);

        if (tile instanceof TankFluidTile) {
            ItemStack held = activator.getHeldItem();



            if (held == null) {
                return false;
            }

            if (held.getItem() == ModRegItems.FLUID_CELL_ITEM) {
                handleFillCell((TankFluidTile) tile, held);
            } else if (held.getItem() == Items.bucket) {
                handleFillBucket((TankFluidTile) tile, activator, held);
            } else {
                handleFillFluidTank((TankFluidTile) tile, activator, held);
            }
        }
        return true;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int metadata) {
        return new TankFluidTile();
    }

    /**
     * ������ ����� ����� ���������� ��� ���������� {@link ModRegItems#FLUID_CELL_ITEM}
     *
     * @param tank ��������� � ���������.
     * @param held ���� �������� ����������� � ����.
     */
    private void handleFillCell(TankFluidTile tank, ItemStack held) {
        // ������� �������� �������� �� ���������� ��� ������ ���������� ���-�� ��������
        FluidStack fluidStack = tank.drain(ForgeDirection.UP, FluidContainerRegistry.BUCKET_VOLUME, false);
        // ���� ���� �� ����� null � ���-�� �������� ������ 0, �� �������� �������� � ���������� ������
        // ������ ��� ���������, ���������� ���������, ����� �� �� ��������� ������, ��� ������ ���������� ����
        if (fluidStack != null && fluidStack.amount > 0 && ((FluidCellItem) held.getItem()).fill(held, fluidStack, false) > 0) {
            // ���� �� ������ �������, �� ���������� ���� �������� �� ���������� �������� � ��������� ������
            fluidStack = tank.drain(ForgeDirection.UP, FluidContainerRegistry.BUCKET_VOLUME, true);
            // ��������� ���� ������ ��� ��������
            ((FluidCellItem) held.getItem()).fill(held, fluidStack, true);
            // ��������� � �������������� ������ � ��������
            tank.markDirty();
            tank.getWorldObj().markBlockForUpdate(tank.xCoord, tank.yCoord, tank.zCoord);
        }
    }

    /**
     * ������ ����� ����� ���������� ��� ���������� ������� �����.
     *
     * @param tank ��������� � ���������.
     * @param player ����� ����������������� � ������.
     * @param held ���� �������� ����������� � ����.
     */
    private void handleFillBucket(TankFluidTile tank, EntityPlayer player, ItemStack held) {
        FluidStack fluidStack = tank.drain(ForgeDirection.UP, FluidContainerRegistry.BUCKET_VOLUME, false);
        if (fluidStack != null && fluidStack.amount > 0) {
            fluidStack = tank.drain(ForgeDirection.UP, FluidContainerRegistry.BUCKET_VOLUME, true);

            if (!player.capabilities.isCreativeMode) {
                addItemStackOrDrop(player, FluidContainerRegistry.fillFluidContainer(fluidStack, held));
                --held.stackSize;
            }

            tank.markDirty();
            tank.getWorldObj().markBlockForUpdate(tank.xCoord, tank.yCoord, tank.zCoord);
        }
    }

    /**
     * ������ ����� ����� ���������� ��� ���������� ���������� ��������� �� �����/���������� ������.
     *
     * @param tile ��������� � ���������.
     * @param player ����� ����������������� � ������.
     * @param held ���� �������� ����������� � ����.
     */
    private void handleFillFluidTank(TankFluidTile tile, EntityPlayer player, ItemStack held) {
        // �������� �������� �� ���������� �� ����� ��������
        FluidStack fluidStack = FluidContainerRegistry.getFluidForFilledItem(held);
        // ���������, ��� �� ����� ��������� ��������� ���������, ��� ������ ����������
        if (tile.fill(ForgeDirection.UP, fluidStack, false) > 0) {
            // ��������� ��������� ����
            tile.fill(ForgeDirection.UP, fluidStack, true);

            if (!player.capabilities.isCreativeMode) {
                addItemStackOrDrop(player, FluidContainerRegistry.drainFluidContainer(held));
                --held.stackSize;
            }

            tile.markDirty();
            tile.getWorldObj().markBlockForUpdate(tile.xCoord, tile.yCoord, tile.zCoord);
        }
    }

    /**
     * ������ ����� ������ ��� ������ ����� �������� � ��������� � ��������������, ���� ���� �� ������� ������, �� �������
     * ����� �������� �� �����.
     *
     * @param player �����, �������� ����� ����� ���� ��������.
     * @param stack ����, ������� ����� �����.
     */
    private void addItemStackOrDrop(EntityPlayer player, ItemStack stack) {
        if (!player.inventory.addItemStackToInventory(stack)) {
            player.dropPlayerItemWithRandomChoice(stack, false);
        } else {
            player.openContainer.detectAndSendChanges();
        }
    }
}
