package com.repeatedstrings.mods.Bohr.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

/**
 * Created by james on 5/19/17.
 */
public class BohrArmor extends ItemArmor {
    public BohrArmor(String name, CreativeTabs tab, ArmorMaterial mat, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
        super(mat, renderIndexIn, equipmentSlotIn);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(tab);
    }

//    @Override
//    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
//        if (slot == 2) {
//            return "bohr:textures/models/armor/bohr_layer_2.png";
//        }
//        return "bohr:textures/models/armor/bohr_layer_1.png";
//    }
//
//    @Override
//        public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
//                if (itemStack.getItem() == AdventureItems.carbiteHelmet) {
//                effectPlayer(player, Potion.getPotionById(373), 0);
//            }
//        }

//        private void effectPlayer(EntityPlayer player, Potion potion, int amplifier){
//                if(player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1){
//                        player.addPotionEffect(new PotionEffect(potion., 159, amplifier, true, true));
//                }
//        }


}
