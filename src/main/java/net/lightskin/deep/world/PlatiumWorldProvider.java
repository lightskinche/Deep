package net.lightskin.deep.world;

import net.lightskin.deep.Main;
import net.lightskin.deep.chunk.PlatiumChunkProvider;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.*;

public class PlatiumWorldProvider extends WorldProvider{
	@Override
	public void registerWorldChunkManager(){
		this.worldChunkMgr = new WorldChunkManagerHell(Main.platbiomegen, 0.8f);
		this.dimensionId = Main.PlatiumDimId;
	}
	public IChunkProvider createChunkGenerator()
    {
        return new PlatiumChunkProvider();
    }
	
	@SideOnly(Side.CLIENT)
    public float getCloudHeight()
    {
        return 225;
    }
	
	@Override
	public String getDimensionName() {
		return "Platium World";
	}
	
	@Override
	public boolean canRespawnHere(){
		return true;
	}
}
