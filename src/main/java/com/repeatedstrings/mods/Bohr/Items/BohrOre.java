package com.repeatedstrings.mods.Bohr.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by james on 5/6/17.
 */

// parent needs to be mod/models.item --> not items for resources

public class BohrOre extends Item {
    public BohrOre(String bohr_ore, CreativeTabs materials) {
        setUnlocalizedName(bohr_ore);
        setRegistryName(bohr_ore);
        setCreativeTab(materials);
    }
}
