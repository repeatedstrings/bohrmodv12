package Bohr.Items.Tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;

public class BohrHoe extends ItemHoe {
  public BohrHoe(String langName, String regName,
                 int stackSize, ToolMaterial mat, CreativeTabs tab) {
    super(mat);
    setUnlocalizedName(langName);
    setRegistryName(regName);
    setMaxStackSize(stackSize);
    setCreativeTab(tab);
  }
}
