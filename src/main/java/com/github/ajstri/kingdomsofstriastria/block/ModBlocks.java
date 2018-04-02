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

import com.github.ajstri.kingdomsofstriastria.item.ItemModelProvider;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * The class that handles the blocks of the mod.
 * @see BasicBlock
 * @see BasicOre
 *
 * @author AJStri
 * @since April 1st, 2018
 */
public class ModBlocks {

    //public static BasicOre oreCopper;

    /**
     * Initializes the mod's blocks -
     * registers them.
     */
    public static void init() {
        //oreCopper = register(new BasicOre("oreCopper"));
    }

    /**
     * Registers a given block.
     *
     * @param block The block to register
     * @param itemBlock The item block to register
     */
    private static <T extends Block> T register (T block, ItemBlock itemBlock) {

        GameRegistry.register(block);
        if(itemBlock != null) {
            GameRegistry.register(itemBlock);
        }

        if(block instanceof ItemModelProvider) {
            ((ItemModelProvider)block).registerItemModel(itemBlock);
        }

        return block;
    }

    /**
     * A simpler version of register(block, itemBlock)
     * and the one that is used. This method will call
     * register(block, itemBlock).
     *
     * @param block The block to register
     * @return
     */
    private static <T extends Block> T register(T block) {
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        return register(block, itemBlock);
    }

}
