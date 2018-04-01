package com.github.ajstri.kingdomsofstriastria;

import com.github.ajstri.kingdomsofstriastria.block.ModBlocks;
import com.github.ajstri.kingdomsofstriastria.client.KOSTab;
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


/**
 * Main Class of Kingdoms of Striastria mod.
 * @author AJStri
 * @since April 1st, 2018
 */
public class KingdomsOfStriastria {

    @SidedProxy(serverSide = "com.github.ajstri.kingdomsofstriastria.proxy.CommonProxy",
                clientSide = "com.github.ajstri.kingdomsofstriastria.proxy.ClientProxy")

    public static CommonProxy proxy;

    public static final String modId = "kos";
    public static final String modName = "Kingdoms of Striastria";
    public static final String modVersion = "0.0.1-SNAPSHOT";

    public static final KOSTab creativeTab = new KOSTab();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        // PRE INITIALIZATION

        ModItems.init();
        ModBlocks.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        // INITIALIZATION

        ModRecipes.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        // POST INITIALIZATION
    }

}
