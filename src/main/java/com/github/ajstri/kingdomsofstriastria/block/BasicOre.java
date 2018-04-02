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

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;


/**
 * The class that handles the creation of ores.
 * @see BasicBlock
 *
 * @author AJStri
 * @since April 1st, 2018
 */
public class BasicOre extends BasicBlock {

    /**
     * BasicOre
     *
     * Our basic ore-block creating method.
     * Our ores will be made using this.
     * @param name
     */
    public BasicOre(String name) {
        super(Material.ROCK, name);

        setHardness(3f);
        setResistance(5f);
    }

    /**
     * Sets an item's Creative Tab - where
     * it is stored in the creative inventory.
     *
     * @param tab The creative tab to be stored in
     */
    @Override
    public BasicOre setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }

}
