package Bohr;

import Bohr.Config.Config;
import Bohr.Handlers.BohrBlockHandler;
import Bohr.Handlers.BohrItemHandler;
import Bohr.Handlers.BohrWorldHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(name = Config.NAME, version = Config.VERSION, modid = Config.MODID)
public class BohrMod {
    @EventHandler
    public void preinit(FMLPreInitializationEvent event){
        BohrBlockHandler.preInit();
        BohrWorldHandler.preInit();
        BohrItemHandler.preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event){
        BohrBlockHandler.init();
        BohrWorldHandler.init();
        BohrItemHandler.init();
    }

    @EventHandler
    public void postinit(FMLPostInitializationEvent event) {
        BohrBlockHandler.postInit();
        BohrWorldHandler.postInit();
        BohrItemHandler.postInit();
    }
}
