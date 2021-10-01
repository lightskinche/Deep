package net.lightskin.deep;

import net.lightskin.deep.Blocks.WeirdStone;
import net.lightskin.deep.Items.PlatiumIngot;
import net.lightskin.deep.Items.WeirdStoneItem;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main
{
    public static final String MODID = "deep";
    public static final String VERSION = "1.0";
    
    static Item platiumingot;
    static Block weirdstone;
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	//item and block registering
        platiumingot = new PlatiumIngot().setUnlocalizedName("platium_ingot").setTextureName("deep:platium_ingot");
        GameRegistry.registerItem(platiumingot, "platium_ingot");
        
        weirdstone = new WeirdStone(Material.air).setBlockName("weirdstone").setCreativeTab(CreativeTabs.tabBlock);
        GameRegistry.registerBlock(weirdstone, WeirdStoneItem.class, "weirdstone");
    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
           //Tile, Entity, Gui registering
    }
    
}
