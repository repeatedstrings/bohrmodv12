package com.repeatedstrings.mods.Bohr;

import com.repeatedstrings.mods.Bohr.Config.Config;
import com.repeatedstrings.mods.Bohr.Handlers.BohrBlockHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by james on 5/6/17.
 * This class is what kicks everything off.  Forge ties into the @Mod annotation and
 * runs the initializer to build the item, and then registers it into the minecraft application.
 * Hurray for ServiceLocator Patterns!
 */
@Mod(modid= Config.MODID, name=Config.NAME, version=Config.VERSION)
public class BohrMod {
//    @SidedProxy(clientSide = Config.CLIENT_PROXY, serverSide = Config.SERVER_PROXY)
//    public static ReadySetGo readySetGo;

    // The event we are loading these at is before the game starts
    // (basically, we are putting them in the library that can be used)
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
//        BohrishItemHandler.init();
//        BohrishItemHandler.register();

        BohrBlockHandler.preinit();

//        GameRegistry.registerWorldGenerator(new BohrBlockinatorHandler(),0);
//
//        BohrishRecipeHandler.init();
//
//        BohrishArmorHandler.init();
//        BohrishArmorHandler.register();
    }

    // the event we are loading these at is when the game starts
    // take the handlers we created and put them in game.
    @EventHandler
    public void init(FMLInitializationEvent event) {
        {
//            BohrishItemHandler.registerRenders();

            BohrBlockHandler.init();
//            BohrishArmorHandler.registerRenders();
        }
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        BohrBlockHandler.postInit();
    }

}
