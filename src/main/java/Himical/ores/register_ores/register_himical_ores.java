package Himical.ores.register_ores;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class register_himical_ores implements IWorldGenerator {
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        generateOverworld(random, chunkX, chunkZ, world);
        generateNether(random, chunkX, chunkZ, world);
        generateEnd(random, chunkX, chunkZ, world);
    }

    private void generateOverworld(Random rand, int chunkX, int chunkZ, World world) {

        generateOverworld(rand,chunkX * 16, chunkZ * 16, world);

    }

    private void generateNether(Random rand, int chunkX, int chunkZ, World world) {

        generateNether(world, rand, chunkX * 16, chunkZ * 16);
    }

    private void generateEnd(Random rand, int chunkX, int chunkZ, World world) {

        generateEnd(world, rand, chunkX * 16, chunkZ * 16);
    }

    public void generateNether(World world, Random rand, int blockXPos, int blockZPos) {

    }

    public void generateEnd(World world, Random rand, int blockXPos, int blockZPos) {

    }

    /**
  ������ �������������� ���� ������� ��� ����������� ������������ ���.
     * @param ore ����, ������� ������ ������������
     * @param replace ����, ����� � ������� ������ ������������
     * @param world ��� (�� ���������), � ������� ���� ���� ������ ��������������
     * @param rand ��������� ����� ��� ��������� ��������� ��������� �����
     * @param blockXPos ����� ��� ����, ����� ���� ������ ����� �� ����������� X ��� ������ ��������� (���������� ��������� ����)
     * @param blockZPos ����� ��� ����, ����� ���� ������ ����� �� ����������� Z ��� ������ ��������� (���������� ��������� ����)
     * @param maxX �����, ������� �������� ������������ X ���������� ��� ��������� ���� �� ��� X �� ����
     * @param maxZ �����, ������� �������� ������������ Z ���������� ��� ��������� ���� �� ��� Z �� ����
     * @param minVeinSize ����������� ����� ������ ���� � ����� ����
     * @param maxVeinSize ������������ ����� ������ ���� � ����� ����
     * @param minVeinsPerChunk ����������� ����� ��� � �����
     * @param maxVeinsPerChunk ������������ ����� ��� � �����
     * @param chanceToSpawn ���� ��������� ������ �� ���� � ���������
     * @param minY ����������� ���������� Y �� ������� ���� ����� ���������������
     * @param maxY ������������ ���������� Y �� ������� ���� ����� ���������������

     */
    public static void addOreSpawn(Block ore, Block replace, World world, Random rand, int blockXPos, int blockZPos, int maxX, int maxZ, int minVeinSize, int maxVeinSize, int minVeinsPerChunk, int maxVeinsPerChunk, int chanceToSpawn, int minY, int maxY) {
        if (rand.nextInt(101) < (100 - chanceToSpawn)) return;

        int veins = rand.nextInt(maxVeinsPerChunk - minVeinsPerChunk + 1) + minVeinsPerChunk;

        for (int i = 0; i < veins; i++) {

            int posX = blockXPos + rand.nextInt(maxX);
            int posY = minY + rand.nextInt(maxY - minY);
            int posZ = blockZPos + rand.nextInt(maxZ);

            (new WorldGenMinable(ore, minVeinSize + rand.nextInt(maxVeinSize - minVeinSize + 1), replace)).generate(world, rand, posX, posY, posZ);

        }
    }
}
