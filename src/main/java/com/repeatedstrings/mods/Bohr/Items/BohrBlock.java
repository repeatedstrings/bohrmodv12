package com.repeatedstrings.mods.Bohr.Items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class BohrBlock extends Block {
    public BohrBlock(Material mat, String name, CreativeTabs tab, float hard, float swings, int numGivn, String tool) {
        super(mat);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
        setHardness(hard);
        setResistance(swings);
        setHarvestLevel(tool, numGivn);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random random, int fortune){
        return Items.ACACIA_BOAT;
    }

}
