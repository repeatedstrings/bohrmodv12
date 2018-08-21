package Bohr.Handlers;

import net.minecraftforge.common.util.EnumHelper;

import static net.minecraft.item.Item.ToolMaterial;

public class BohrMaterialHandler {
  static String materialName = "bohr_stuff";
  static int harvestLevel = 3;
  static int maxUses = 100;
  static float efficiency = 4f;
  static float damamage = 4f;
  static int enchantablility = 16;

  public static ToolMaterial BOHR = EnumHelper.addToolMaterial(materialName,harvestLevel,
      maxUses,efficiency,damamage,enchantablility);

}
