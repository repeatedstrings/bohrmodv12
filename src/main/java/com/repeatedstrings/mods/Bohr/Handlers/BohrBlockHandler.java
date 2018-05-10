package com.repeatedstrings.mods.Bohr.Handlers;

import com.repeatedstrings.mods.Bohr.Items.BohrBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by james on 5/8/17.
 */
public class BohrBlockHandler implements BohrHandlerInterface {
    public static Block bohrBlock;
    public static ItemBlock iBohrBlock;

    public static void preinit() {
        bohrBlock = new BohrBlock(Material.ROCK, "bohr_block", CreativeTabs.BUILDING_BLOCKS, 1F, 2F, 0, "pickaxe");
        bohrBlock.setRegistryName("bohr_block");
        ForgeRegistries.BLOCKS.register(bohrBlock);

        iBohrBlock = new ItemBlock(bohrBlock);
        iBohrBlock.setRegistryName("ibohr_block");
        ForgeRegistries.ITEMS.register(iBohrBlock);

    }

    public static void init() {
    }

    public static void postInit() {
    }

}
