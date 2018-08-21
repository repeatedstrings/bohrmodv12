package Bohr.Items.Tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class BohrPickAxe extends ItemPickaxe {
  public BohrPickAxe(String langName, String regName,
                     int stackSize, ToolMaterial mat,
                     CreativeTabs tab) {
    super(mat);
    setUnlocalizedName(langName);
    setRegistryName(regName);
    setMaxStackSize(stackSize);
    setCreativeTab(tab);
  }
}
