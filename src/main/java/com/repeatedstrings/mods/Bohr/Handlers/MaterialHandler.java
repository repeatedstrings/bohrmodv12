package com.repeatedstrings.mods.Bohr.Handlers;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by james on 5/18/17.
 */
public class MaterialHandler {
//    public static final CreativeTabs BOHR_ARMOR = null;
    public static final ArmorMaterial BOHR_ARMOR = EnumHelper.addArmorMaterial("bohr armor",
        "bohr:bohr_armor", 1500, new int[]{3, 5, 4, 2}, 10,
        SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 8F);

    public static ToolMaterial BOHR = EnumHelper.addToolMaterial(
                "bohr material", 3, 2500, 4F, 4F, 16);
}