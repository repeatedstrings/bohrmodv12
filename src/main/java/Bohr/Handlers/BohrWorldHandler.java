package Bohr.Handlers;

import Bohr.Items.BohrWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BohrWorldHandler {
  public static void preInit() {
    GameRegistry.registerWorldGenerator(new BohrWorldGenerator(), 3);
  }

  public static void init() {
  }

  public static void postInit() {
  }
}
