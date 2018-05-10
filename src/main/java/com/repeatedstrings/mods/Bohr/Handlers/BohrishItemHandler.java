//package com.repeatedstrings.mods.Bohr.Handlers;
//
//import com.repeatedstrings.mods.Bohr.Items.*;
//import net.minecraft.client.Minecraft;
//import net.minecraft.client.renderer.block.model.ModelResourceLocation;
//import net.minecraft.creativetab.CreativeTabs;
//import net.minecraft.item.Item;
//import net.minecraftforge.fml.common.registry.GameRegistry;
//
///**
// * Created by james on 5/6/17.
// */
//public class BohrishItemHandler implements BohrHandlerInterface {
//    public static Item bohrOre;
//    public static Item bohrite;
//    public static Item bohrAxe;
//    public static Item bohrHoe;
//    public static Item bohrPickaxe;
//    public static Item bohrShovel;
//    public static Item bohrSword;
//
//
//    public static void init() {
//        bohrAxe = new BohrAxe("bohr_axe", MaterialHandler.BOHR, CreativeTabs.TOOLS);
//        bohrHoe = new BohrHoe("bohr_hoe", MaterialHandler.BOHR, CreativeTabs.TOOLS);
//        bohrOre = new BohrOre("bohr_ore", CreativeTabs.MATERIALS);
//        bohrite = new Bohrite("bohrite", CreativeTabs.MATERIALS);
//        bohrPickaxe = new BohrPickAxe("bohr_pickaxe", MaterialHandler.BOHR, CreativeTabs.TOOLS);
//        bohrShovel = new BohrShovel("bohr_shovel",MaterialHandler.BOHR, CreativeTabs.TOOLS);
//        bohrSword = new BohrSword("bohr_sword", MaterialHandler.BOHR, CreativeTabs.COMBAT);
//    }
//
//    public static void register() {
//        GameRegistry.register(bohrAxe);
//        GameRegistry.register(bohrHoe);
//        GameRegistry.register(bohrOre);
//        GameRegistry.register(bohrite);
//        GameRegistry.register(bohrPickaxe);
//        GameRegistry.register(bohrShovel);
//        GameRegistry.register(bohrSword);
//
//    }
//
//    // no item passed in here
//    public static void registerRenders() {
//        registerRenders(bohrAxe);
//        registerRenders(bohrHoe);
//        registerRenders(bohrOre);
//        registerRenders(bohrite);
//        registerRenders(bohrPickaxe);
//        registerRenders(bohrShovel);
//        registerRenders(bohrSword);
//    }
//
//    // an item here overloading
//    public static void registerRenders(Item item) {
//        // ugly due to newest forge libs
//        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
//                .register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"  ));
//    }
//
//}
