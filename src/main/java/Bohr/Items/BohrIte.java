package Bohr.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BohrIte extends Item{
  public BohrIte(String lang_bohr_ite, String reg_bohr_ite, int stackSize, CreativeTabs tab) {
    this.setUnlocalizedName(lang_bohr_ite)
        .setRegistryName(reg_bohr_ite)
        .setMaxStackSize(stackSize)
        .setCreativeTab(tab);
  }
}