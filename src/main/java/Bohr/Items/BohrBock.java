package Bohr.Items;

import Bohr.Handlers.BohrItemHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class BohrBock extends Block {
    private int maxReturn = 4;

    public BohrBock(Material mat, String unLName, String langName,
                    CreativeTabs tabs, float hard, float swings,
                    int numGivn, String tool) {
        super(mat);
        setUnlocalizedName(unLName);
        setRegistryName(langName);
        setCreativeTab(tabs);
        setResistance(swings);
        setHardness(hard);
        setHarvestLevel(tool, numGivn);
    }
    @Override
    public Item getItemDropped(IBlockState state,
                               Random random, int fortune) {
        return BohrItemHandler.bohrOre;
    }

    @Override
    public int quantityDropped(Random rand) {
        return rand.nextInt(maxReturn);
    }
}
