package Bohr.Helper;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BohrHelper {
  final static int DEFAULT_ITEM_SUBTYPE = 0;

  public static void modelMaker(Item bohrItem){
    ForgeRegistries.ITEMS.register(bohrItem);
    ModelResourceLocation imrl = new ModelResourceLocation(bohrItem.getRegistryName(),
        "inventory");
    ModelLoader.setCustomModelResourceLocation(
        bohrItem, DEFAULT_ITEM_SUBTYPE, imrl);
  }
}
