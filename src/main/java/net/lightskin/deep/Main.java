package net.lightskin.deep;

import net.lightskin.deep.Items.PlatiumIngot;
import net.lightskin.deep.biome.PlatiumBiomeGen;
import net.lightskin.deep.world.PlatiumWorldProvider;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;
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
    public static int PlatiumDimId = -2;
    public static int PlatiumBiomeId = 55;
    public static BiomeGenBase platbiomegen;
    //TODO: Fix PlatiumChunkProvider and maybe PlatiumBiomeGen since they are likely casuing
    //the crash during preInitilization
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	//item and block registering
        platiumingot = new PlatiumIngot();
        GameRegistry.registerItem(platiumingot, "platium_ingot");
        GameRegistry.addShapelessRecipe(new ItemStack(platiumingot), Items.gold_ingot, Items.iron_ingot);
    
        DimensionManager.registerProviderType(PlatiumDimId, PlatiumWorldProvider.class, true);
        DimensionManager.registerDimension(PlatiumDimId, PlatiumBiomeId);
        
        platbiomegen = new PlatiumBiomeGen(PlatiumBiomeId).setColor(48).setBiomeName("Water Biome").setHeight(new BiomeGenBase.Height(-1.8f, 1.0f));
    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
           //Tile, Entity, Gui registering
    }
    
}
