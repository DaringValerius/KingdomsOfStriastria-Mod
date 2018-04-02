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
package com.github.ajstri.kingdomsofstriastria.item;

import com.github.ajstri.kingdomsofstriastria.KingdomsOfStriastria;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

/**
 * The class that handles the creation of items.
 *
 * @author AJStri
 * @since April 1st, 2018
 */
public class BasicItem extends Item implements ItemModelProvider {
    protected String name;

    /**
     * BasicItem
     *
     * This is our basic item-creating method.
     * Our blocks will be made using this.
     *
     * @param name The name of the item
     */
    public BasicItem(String name) {
        this.name = name;
        setUnlocalizedName(name); // Names will appear like item.itemName.name
                                  // until given a name in *.lang
        setRegistryName(name);
        setCreativeTab(KingdomsOfStriastria.creativeTab);
    }

    @Override
    public void registerItemModel(Item item) {
        KingdomsOfStriastria.proxy.registerItemRenderer(item, 0, name);
    }

    /**
     * Sets an item's Creative Tab - where
     * it is stored in the creative inventory.
     *
     * @param tab The creative tab to be stored in
     */
    @Override
    public BasicItem setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}
