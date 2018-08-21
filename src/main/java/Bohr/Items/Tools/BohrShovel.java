package Bohr.Items.Tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class BohrShovel extends ItemSpade {
  public BohrShovel(String langName, String regName,
                    int stackSize, ToolMaterial mat,
                    CreativeTabs tab) {
      super(mat);
      setUnlocalizedName(langName);
      setRegistryName(regName);
      setMaxStackSize(stackSize);
      setCreativeTab(tab);

  }
}
