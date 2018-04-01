package com.github.ajstri.kingdomsofstriastria.item;

import com.github.ajstri.kingdomsofstriastria.KingdomsOfStriastria;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

public class ItemBase extends Item implements ItemModelProvider {
    protected String name;

    public ItemBase(String name) {
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(KingdomsOfStriastria.creativeTab);
    }

    @Override
    public void registerItemModel(Item item) {
        KingdomsOfStriastria.proxy.registerItemRenderer(item, 0, name);
    }

    @Override
    public ItemBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}
