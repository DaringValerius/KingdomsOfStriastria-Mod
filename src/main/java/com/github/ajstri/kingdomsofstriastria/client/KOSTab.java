package com.github.ajstri.kingdomsofstriastria.client;

import com.github.ajstri.kingdomsofstriastria.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.github.ajstri.kingdomsofstriastria.KingdomsOfStriastria;

public class KOSTab extends CreativeTabs {

    public KOSTab() {
        super(KingdomsOfStriastria.modId);

    }

    @Override
    public Item getTabIconItem() {
        return ModItems.ingotCopper; // ITEM SHOWN ON TAB
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }

}
