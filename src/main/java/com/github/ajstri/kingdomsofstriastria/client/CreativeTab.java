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
package com.github.ajstri.kingdomsofstriastria.client;

import com.github.ajstri.kingdomsofstriastria.item.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import com.github.ajstri.kingdomsofstriastria.KingdomsOfStriastria;

/**
 * The class that handles the creation of the
 * Creative Tab. The creative tab is the section
 * of the creative inventory in which our items
 * will be shown.
 *
 * @author AJStri
 * @since April 1st, 2018
 */
public class CreativeTab extends CreativeTabs {

    public CreativeTab() {
        super(KingdomsOfStriastria.modId);

    }

    /**
     * Get the tab's icon item. The icon item is
     * the item that shows on the clickable tab.
     *
     * @return Item The item on the tab
     */
    @Override
    public Item getTabIconItem() {
        return null; // ITEM SHOWN ON TAB
    }

    /**
     * Get whether or not the creative tab has
     * a search bar. For our mod, we will not have
     * a search bar in our creative tab.
     *
     * @return boolean Whether or not the creative
     * tab has a search bar
     */
    @Override
    public boolean hasSearchBar() {
        return true;
    }

}
