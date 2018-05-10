//package com.repeatedstrings.mods.Bohr.Handlers;
////watch the import, needs to be google common base
//import com.google.common.base.Predicate;
//import com.repeatedstrings.mods.Bohr.Handlers.BohrBlockHandler;
//import net.minecraft.block.state.IBlockState;
//import net.minecraft.block.state.pattern.BlockMatcher;
//import net.minecraft.init.Blocks;
//import net.minecraft.util.math.BlockPos;
//import net.minecraft.world.World;
//import net.minecraft.world.gen.feature.WorldGenMinable;
//import net.minecraftforge.fml.common.IWorldGenerator;
//
//import java.util.Random;
//
///**
// * Created by james on 5/13/17.
// */
//public class BohrBlockinatorHandler implements IWorldGenerator {
//
//    @Override
//    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
//        switch (world.provider.getDimension()) {
//            case -1:
//                genNether(world,random,chunkX, chunkZ);
//            case 1:
//                genEnd(world,random, chunkX, chunkZ);
//                break;
//            default:
////                System.out.println("\n generating bohr ore for surface!");
//                genSurface(world, random, chunkX, chunkZ);
//                break;
//        }
//    }
//
//    private void genSurface(World world, Random random, int chunkX, int chunkZ) {
//        addOreSpawn(BohrBlockHandler.bohrBlock.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,
//                50, 20, 10, 1000, BlockMatcher.forBlock(Blocks.STONE));
//    }
//    private void genNether(World world, Random random, int chunkX, int chunkZ) {
//        addOreSpawn(BohrBlockHandler.bohrBlock.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,
//                50, 95, 10, 100, BlockMatcher.forBlock(Blocks.NETHERRACK));
//    }
//    private void genEnd(World world, Random random, int chunkX, int chunkZ) {
//        addOreSpawn(BohrBlockHandler.bohrBlock.getDefaultState(), world, random, chunkX, chunkZ, 16, 16,
//                50, 95, 10, 100, BlockMatcher.forBlock(Blocks.END_STONE));
//    }
//
//
////    TODO Needs to be a builder patterm, but do that after this works
//    private void addOreSpawn(IBlockState blockState, World world, Random random, int blockXpos,
//                             int blockZpos, int maxX, int maxZ, int maxVeinSize, int chance, int minY, int maxY, Predicate<IBlockState> blockToSpawnIn) {
//        int diffMinMaxY = maxY - minY;
//        for(int x = 0; x<chance; x++) {
//            int posX = blockXpos + random.nextInt(maxX);
//            int posy = minY + random.nextInt(maxY);
//            int posz = blockZpos+random.nextInt(maxZ);
////            System.out.println("\n x,y,z position: "+posX+", "+posy+", "+posz);
//            (new WorldGenMinable(blockState, maxVeinSize, blockToSpawnIn)).generate(world, random, new BlockPos(posX, posy, posz));
//        }
//    }
//}
