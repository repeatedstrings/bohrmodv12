package Bohr.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BohrOre extends Item {
  public BohrOre(String lang_bohr_ore, String reg_bohr_ore,
                 int stackSize, CreativeTabs tab) {
    this.setUnlocalizedName(lang_bohr_ore);
    this.setRegistryName(reg_bohr_ore);
    this.setMaxStackSize(stackSize);
    this.setCreativeTab(tab);
  }
}
