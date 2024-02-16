package Himical.handler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class ModTabHimlical{
    public static CreativeTabs HimlicalElements = new CreativeTabs("HimicalElements") {
        @Override
        public Item getTabIconItem() {
            return Items.iron_ingot;
        }
    };
    public static CreativeTabs HimlicalDust = new CreativeTabs("HimicalDust") {
        @Override
        public Item getTabIconItem() {
            return RegisterHimical.ALUMINUM_DUST;
        }
    };
    public static CreativeTabs HimlicalOres = new CreativeTabs("HimicalOres") {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(RegisterHimical.LIMONITE_ORE);
        }
    };
}
