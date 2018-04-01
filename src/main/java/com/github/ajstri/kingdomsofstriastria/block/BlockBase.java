package com.github.ajstri.kingdomsofstriastria.block;

import com.github.ajstri.kingdomsofstriastria.KingdomsOfStriastria;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.github.ajstri.kingdomsofstriastria.item.ItemModelProvider;

public class BlockBase extends Block implements ItemModelProvider {

    protected String name;

    public BlockBase(Material materialIn, String name) {
        super(materialIn);
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(KingdomsOfStriastria.creativeTab);
    }

    @Override
    public void registerItemModel(Item itemBlock) {
        KingdomsOfStriastria.proxy.registerItemRenderer(itemBlock, 0, name);

    }

    @Override
    public BlockBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

}
