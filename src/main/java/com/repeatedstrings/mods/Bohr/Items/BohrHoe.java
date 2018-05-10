package com.repeatedstrings.mods.Bohr.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

/**
 * Created by james on 5/19/17.
 */
public class BohrHoe extends ItemHoe {
    public BohrHoe (String name, ToolMaterial mat, CreativeTabs tab) {
        super(mat);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
    }
}
