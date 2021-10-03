package net.lightskin.deep.biome;

import java.util.Random;

import com.jcraft.jorbis.Block;

import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

public class PlatiumBiomeGen extends BiomeGenBase {
    private static final String __OBFID = "CL_00000179";

    public PlatiumBiomeGen(int id)
    {
        super(id);
        this.spawnableWaterCreatureList.clear();
    }

    @Override
    public BiomeGenBase.TempCategory getTempCategory()
    {
        return BiomeGenBase.TempCategory.OCEAN;
    }

    public void genTerrainBlocks(World p_150573_1_, Random p_150573_2_, net.minecraft.block.Block[] p_150573_3_, byte[] p_150573_4_, int p_150573_5_, int p_150573_6_, double p_150573_7_)
    {
        super.genTerrainBlocks(p_150573_1_, p_150573_2_, p_150573_3_, p_150573_4_, p_150573_5_, p_150573_6_, p_150573_7_);
    }
}
