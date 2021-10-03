package net.lightskin.deep.Items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.lightskin.deep.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;

public class PlatiumIngot extends Item{
     public PlatiumIngot() {
    	 super();
    	 this.setMaxDamage(0);
    	 this.setCreativeTab(CreativeTabs.tabMisc);
    	 this.setUnlocalizedName("platium_ingot");
    	 this.setTextureName("deep:platium_ingot");
     }
     @Override
     public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
    	 player.travelToDimension(Main.PlatiumDimId);
    	 return stack;
     }
     
}
