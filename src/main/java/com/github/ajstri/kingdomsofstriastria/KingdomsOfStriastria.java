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
package com.github.ajstri.kingdomsofstriastria;

import com.github.ajstri.kingdomsofstriastria.block.ModBlocks;
import com.github.ajstri.kingdomsofstriastria.client.CreativeTab;
import com.github.ajstri.kingdomsofstriastria.item.ModItems;
import com.github.ajstri.kingdomsofstriastria.proxy.CommonProxy;
import com.github.ajstri.kingdomsofstriastria.recipe.ModRecipes;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = KingdomsOfStriastria.modId, name = KingdomsOfStriastria.modName,
     version = KingdomsOfStriastria.modVersion, acceptedMinecraftVersions = "[1.10.2]")

/*
 * IMPORTANT
 *
 * When updating the version of the mod:
 * JavaDoc of Main Class
 * String modVersion
 * mcmod.info
 */

/**
 * Main Class of Kingdoms of Striastria mod.
 * @author AJStri
 * @version 0.0.1-SNAPSHOT
 * @since April 1st, 2018
 */
public class KingdomsOfStriastria {

    @SidedProxy(serverSide = "com.github.ajstri.kingdomsofstriastria.proxy.CommonProxy",
                clientSide = "com.github.ajstri.kingdomsofstriastria.proxy.ClientProxy")

    public static CommonProxy proxy;

    public static final String modId = "kos";
    public static final String modName = "Kingdoms of Striastria";
    public static final String modVersion = "0.0.1-SNAPSHOT";

    public static final CreativeTab creativeTab = new CreativeTab();

    /**
     * Pre-Initialization
     *
     * Initializes the mod's items and blocks. More to come
     *
     * @param event The pre-initialization event of FML
     */
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // PRE INITIALIZATION

        ModItems.init();
        ModBlocks.init();
    }

    /**
     * Initialization
     *
     * Initializes the mod's recipes. More to come
     *
     * @param event The initialization event of FML
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        // INITIALIZATION

        ModRecipes.init();
    }

    /**
     * Post-Initialization
     *
     * More to come
     *
     * @param event The post-initialization event of FML
     */
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        // POST INITIALIZATION
    }

}
