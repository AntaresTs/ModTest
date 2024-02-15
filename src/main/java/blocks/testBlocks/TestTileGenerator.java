package blocks.testBlocks;

import net.minecraft.tileentity.TileEntity;

public class TestTileGenerator extends TileEntity {
    private int maxEnergy = 10000;
    private int energyStorage = 0;
    private int energyGenerate = 20;
    private boolean flag = false;

    //private int tick = 0;
    @Override
    public void updateEntity(){
        if(energyStorage < maxEnergy){
            energyStorage += energyGenerate;
        }

    }

    public boolean getEnergy(int size){
        return energyStorage - size > 0;
    }

    public void activate(){
        if (!flag) flag = !flag;
    }
}
