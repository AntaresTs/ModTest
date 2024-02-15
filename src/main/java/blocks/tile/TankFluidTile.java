package blocks.tile;

import com.example.examplemod.proxy.client.render.tile.TankFluidTesr;
import com.example.examplemod.proxy.common.handler.ModRegBlocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.fluids.*;

public class TankFluidTile extends TileEntity implements IFluidHandler {
    // ���������� ��������� ��������
    private final FluidTank fluidTank = new FluidTank(10_000);

    /**
     * ��������� �������� �� ���������� ����������, ������������� ��������� �������� �� IFluidHandler.
     *
     * @param from ����������, �� ������� ������������ ��������.
     * @param resource FluidStack, �������������� ����� �������� � ������������ ���������� ��������, ���������� ����������.
     * @param doFill ���� �������� false, ������� ����� ������ �������������.
     * @return ���-�� ��������, �� ������� ��� (��� ��� ��, ���� �� ���� �����������) �������� ���������.
     */

    @Override
    public int fill(ForgeDirection from, FluidStack resource, boolean doFill) {
        return fluidTank.fill(resource, doFill);
    }

    /**
     * ������� �������� �� ���������� �����������, ������������� ��������� �������� �� IFluidHandler.
     *
     * @param from ����������, � ������� ����� ��������� ��������.
     * @param resource FluidStack, �������������� �������� � ������������ ���������� ��������, ���������� �����.
     * @param doDrain ���� �������� false, �� ���� ����� ������ �������������.
     * @return FluidStack, �������������� �������� � ���-��, ������� ���� (��� ���� ��, ���� �� ���� �����������) ����� �� ����������.
     */

    @Override
    public FluidStack drain(ForgeDirection from, FluidStack resource, boolean doDrain) {
        if (resource == null || !resource.isFluidEqual(fluidTank.getFluid())) {
            return null;
        }
        return fluidTank.drain(resource.amount, doDrain);
    }

    /**
     * ������� �������� �� ���������� �����������, ������������� ��������� �������� �� IFluidHandler.
     * ���� ����� �� ������������ � ��������.
     *
     * @param from ����������, � ������� ����� ��������� ��������.
     * @param maxDrain ������������ ���������� �������� ��� �����.
     * @param doDrain ���� �������� false, �� ���� ����� ������ �������������.
     * @return FluidStack, �������������� �������� � ���-��, ������� ���� (��� ���� ��, ���� �� ���� �����������) �����.
     */
    @Override
    public FluidStack drain(ForgeDirection from, int maxDrain, boolean doDrain) {
        return fluidTank.drain(maxDrain, doDrain);
    }

    /**
     * ���������� �������� true, ���� ������ �������� ����� ���� ������� � �������� �����������.
     * ����� ���������, ��� ������ ���������� �������� true, ���� �������� ����� ��������� � ��������� �����������.
     *
     * @param from ����������, � ������� ����� ������������ ��������.
     * @param fluid ��������, ������� ����� ���������.
     * @return ���������� ���������� ��������.
     */
    @Override
    public boolean canFill(ForgeDirection from, Fluid fluid) {
        return true;
    }

    /**
     * ���������� �������� true, ���� ������ �������� ����� ���� ��������� �� ��������� �����������.
     * ����� ���������, ��� ������ ���������� �������� true, ���� �������� ����� �������� �� ��������� �����������.
     *
     * @param from ����������, � ������� ����� ��������� ��������.
     * @param fluid ��������, ������� ����� ���������.
     * @return ���������� ���������� ��������.
     */
    @Override
    public boolean canDrain(ForgeDirection from, Fluid fluid) {
        return true;
    }

    /**
     * ���������� ������ ���������� �����������. ��� ������� ������ ������������
     * ��� ��������������� ����������� ������������. �������� {@link FluidTankInfo}.
     *
     * @param from ����������, ������������, ����� ���������� ������� �����������.
     * @return ���������� ��� ��������������� ���������� �����������.
     */
    @Override
    public FluidTankInfo[] getTankInfo(ForgeDirection from) {
        return new FluidTankInfo[] { fluidTank.getInfo() };
    }

    /**
     * ���-�� �������� ����������� � ����������.
     *
     * @return ���������� ���-�� ��������.
     */
    public int getAmount() {
        return fluidTank.getFluidAmount();
    }

    /**
     * ����������� ����������.
     *
     * @return ���������� ���-�� ��������� �������� � ����������.
     */
    public int getCapacity() {
        return fluidTank.getCapacity();
    }

    @Override
    public void updateEntity() {
        if (getWorldObj().isRemote){
            TankFluidTile tile = (TankFluidTile) worldObj.getTileEntity(xCoord, yCoord, zCoord);
            ModRegBlocks.TANK_FLUID_TESR.renderTileEntityAt(tile, xCoord, yCoord, zCoord, 1F);
        }
        //TankFluidTile tile =

    }

    private void writeExtendedData(NBTTagCompound nbt) {
        // ���������� ������ ���������� � NBT
        fluidTank.writeToNBT(nbt);
    }

    private void readExtendedData(NBTTagCompound nbt) {
        // ������ ������ ���������� �� NBT
        fluidTank.readFromNBT(nbt);
    }

}
