package Bohr.Handlers;

import Bohr.Config.Config;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BohrRecipeHandler {
  public static void preInit() {}
  public static void init() {
    GameRegistry.addSmelting(BohrItemHandler.bohrOre,
        new ItemStack(BohrItemHandler.bohrIte, 2), 3f);

    addItem(new ItemStack(BohrToolHandler.bohrPickAxe,1),
        new Object[]{ "BBB"," S "," S ",
            'B', BohrItemHandler.bohrIte, 'S', Items.STICK
        });

    addItem(new ItemStack(BohrToolHandler.bohrShovel, 1),
        new Object[]{" B "," S "," S ",
            'B', BohrItemHandler.bohrIte, 'S', Items.STICK
    });

    addItem(new ItemStack(BohrToolHandler.bohrHoe, 1),
        new Object[]{"BB ", " S "," S ",
        'B', BohrItemHandler.bohrIte, 'S', Items.STICK
    });

    addItem(new ItemStack(BohrToolHandler.bohrAxe, 1),
        new Object[] { "BB ", "BS ", " S ",
            'B', BohrItemHandler.bohrIte, 'S', Items.STICK

        });
  }

  private static void addItem(ItemStack output, Object... input) {
    ResourceLocation name = new ResourceLocation(Config.MODID);
    ResourceLocation group = null;
    GameRegistry.addShapedRecipe(name, group, output, input);
  }

  public static void postInit() {}
}
