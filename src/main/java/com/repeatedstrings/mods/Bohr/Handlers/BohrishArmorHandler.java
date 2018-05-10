//package com.repeatedstrings.mods.Bohr.Handlers;
//
//import com.repeatedstrings.mods.Bohr.Items.BohrArmor;
//import net.minecraft.client.Minecraft;
//import net.minecraft.client.renderer.block.model.ModelResourceLocation;
//import net.minecraft.creativetab.CreativeTabs;
//import net.minecraft.inventory.EntityEquipmentSlot;
//import net.minecraft.item.Item;
//import net.minecraftforge.fml.common.registry.GameRegistry;
//
///**
// * Created by james on 5/19/17.
// */
//public class BohrishArmorHandler implements BohrHandlerInterface {
//
//    public static Item bohrHelm;
//    public static Item bohrChest;
//    public static Item bohrLegs;
//    public static Item bohrFeet;
//
//    public static void init() {
//        bohrHelm = new BohrArmor("bohr_helm", CreativeTabs.COMBAT, MaterialHandler.BOHR_ARMOR, 0, EntityEquipmentSlot.HEAD);
//        bohrChest = new BohrArmor("bohr_chest", CreativeTabs.COMBAT, MaterialHandler.BOHR_ARMOR, 0, EntityEquipmentSlot.CHEST);
//        bohrLegs = new BohrArmor("bohr_legs", CreativeTabs.COMBAT, MaterialHandler.BOHR_ARMOR, 1, EntityEquipmentSlot.LEGS);
//        bohrFeet = new BohrArmor("bohr_feet", CreativeTabs.COMBAT, MaterialHandler.BOHR_ARMOR, 0, EntityEquipmentSlot.FEET);
//
//    }
//    public static void register(){
//        GameRegistry.register(bohrHelm);
//        GameRegistry.register(bohrChest);
//        GameRegistry.register(bohrLegs);
//        GameRegistry.register(bohrFeet);
//
//    }
//    public static void registerRenders() {
//        registerRenders(bohrHelm);
//        registerRenders(bohrChest);
//        registerRenders(bohrLegs);
//        registerRenders(bohrFeet);
//
//
//    }
//    public static void registerRenders(Item item) {
//        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
//                .register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"  ));
//    }
//}
