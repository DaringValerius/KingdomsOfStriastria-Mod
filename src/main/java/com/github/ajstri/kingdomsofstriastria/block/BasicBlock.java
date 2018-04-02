/*
 * Copyright 2018 AJStri
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.ajstri.kingdomsofstriastria.block;

import com.github.ajstri.kingdomsofstriastria.KingdomsOfStriastria;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.github.ajstri.kingdomsofstriastria.item.ItemModelProvider;

/**
 * The class that handles the creation of blocks.
 *
 * @author AJStri
 * @since April 1st, 2018
 */
public class BasicBlock extends Block implements ItemModelProvider {

    protected String name;

    /**
     * BasicBlock
     *
     * This is our basic block-creating method.
     * Our blocks will be made using this.
     *
     * @param material The material of the block
     * @param name The name of the block
     */
    public BasicBlock(Material material, String name) {
        super(material);
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(KingdomsOfStriastria.creativeTab);
    }

    @Override
    public void registerItemModel(Item itemBlock) {
        KingdomsOfStriastria.proxy.registerItemRenderer(itemBlock, 0, name);

    }

    /**
     * Sets an item's Creative Tab - where
     * it is stored in the creative inventory.
     *
     * @param tab The creative tab to be stored in
     */
    @Override
    public BasicBlock setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

}
