package Bohr.Handlers;

import Bohr.Items.BohrBock;
import static Bohr.Helper.BohrHelper.modelMaker;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;


public class BohrBlockHandler {
    public static Block bohrBlock;
    public static ItemBlock iBohrBlock;


    public static void preInit() {
        bohrBlock = new BohrBock(Material.ROCK, "loc_bohr_block",
                "bohr_block", CreativeTabs.BUILDING_BLOCKS,1F, 2F, 1,
                "pickaxe" );
        ForgeRegistries.BLOCKS.register(bohrBlock);

        iBohrBlock = new ItemBlock(bohrBlock);
        iBohrBlock.setRegistryName("bohr_block");
        modelMaker(iBohrBlock);

    }

    public static void init() {
    }

    public static void postInit() {
    }
}
