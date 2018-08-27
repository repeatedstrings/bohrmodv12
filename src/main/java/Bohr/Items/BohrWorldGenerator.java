package Bohr.Items;

import Bohr.Handlers.BohrBlockHandler;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class BohrWorldGenerator implements IWorldGenerator {

  @Override
  public void generate(Random random, int chunkX, int chunkZ, World world,
                       IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
    // Dimension 0 is the overworld
    if (world.provider.getDimension() == 0){
      generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
    }
  }

  private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
    int deltaY = maxY - minY;

    for (int i = 0; i < chances; i++) {
      BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
      System.out.println("X="+pos.getX()+" Y="+pos.getY()+" Z="+pos.getZ());
      WorldGenMinable generator = new WorldGenMinable(ore, size);
      generator.generate(world, random, pos);
    }
  }

  private void generateOverworld(Random random, int chunkX, int chunkZ,
                                 World world, IChunkGenerator chunkGenerator,
                                 IChunkProvider chunkProvider) {
    generateOre(BohrBlockHandler.bohrBlock.getDefaultState(), world, random,
        chunkX * 16, chunkZ * 16, 16, 64,
        4 + random.nextInt(4), 6);
  }
}
