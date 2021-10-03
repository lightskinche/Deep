package net.lightskin.deep.chunk;

import java.util.List;
import java.util.Random;

import com.ibm.icu.util.BytesTrie.Result;
import com.jcraft.jorbis.Block;
import com.mojang.realmsclient.dto.McoServer.WorldType;

import net.minecraft.block.BlockFalling;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.util.MathHelper;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.MapGenBase;
import net.minecraft.world.gen.MapGenCaves;
import net.minecraft.world.gen.MapGenRavine;
import net.minecraft.world.gen.NoiseGenerator;
import net.minecraft.world.gen.NoiseGeneratorOctaves;
import net.minecraft.world.gen.NoiseGeneratorPerlin;
import net.minecraft.world.gen.structure.MapGenMineshaft;
import net.minecraft.world.gen.structure.MapGenScatteredFeature;
import net.minecraft.world.gen.structure.MapGenStronghold;
import net.minecraft.world.gen.structure.MapGenVillage;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.ChunkProviderEvent;
import net.minecraftforge.event.terraingen.TerrainGen;

public class PlatiumChunkProvider implements IChunkProvider {

	public PlatiumChunkProvider() {
		
	}
	@Override
	public boolean canSave() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean chunkExists(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ChunkPosition func_147416_a(World arg0, String arg1, int arg2, int arg3, int arg4) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getLoadedChunkCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List getPossibleCreatures(EnumCreatureType arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Chunk loadChunk(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String makeString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void populate(IChunkProvider arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Chunk provideChunk(int arg0, int arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void recreateStructures(int arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean saveChunks(boolean arg0, IProgressUpdate arg1) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void saveExtraData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean unloadQueuedChunks() {
		// TODO Auto-generated method stub
		return false;
	}


}
