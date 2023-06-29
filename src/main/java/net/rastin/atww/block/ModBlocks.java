package net.rastin.atww.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.rastin.atww.ATWWMod;
import net.rastin.atww.block.custom.BowlderBlock;

public class ModBlocks {

        //STONE

    //POLISHED
    public static final Block POLISHED_STONE = registerBlock("polished_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool()));
    public static final Block POLISHED_STONE_STAIRS = registerBlock("polished_stone_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool()));
    public static final Block POLISHED_STONE_SLAB = registerBlock("polished_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool()));
    public static final Block POLISHED_STONE_WALL = registerBlock("polished_stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool()));


    //MOSSY POLISHED
    public static final Block MOSSY_POLISHED_STONE = registerBlock("mossy_polished_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool()));
    public static final Block MOSSY_POLISHED_STONE_STAIRS = registerBlock("mossy_polished_stone_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool()));
    public static final Block MOSSY_POLISHED_STONE_SLAB = registerBlock("mossy_polished_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool()));
    public static final Block MOSSY_POLISHED_STONE_WALL = registerBlock("mossy_polished_stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool()));

    //CRACKED POLISHED
    public static final Block CRACKED_POLISHED_STONE = registerBlock("cracked_polished_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool()));
    public static final Block CRACKED_POLISHED_STONE_STAIRS = registerBlock("cracked_polished_stone_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool()));
    public static final Block CRACKED_POLISHED_STONE_SLAB = registerBlock("cracked_polished_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool()));
    public static final Block CRACKED_POLISHED_STONE_WALL = registerBlock("cracked_polished_stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool()));

    //BRICKS
    public static final Block CRACKED_STONE_BRICKS_STAIRS = registerBlock("cracked_stone_bricks_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool()));
    public static final Block CRACKED_STONE_BRICKS_SLAB = registerBlock("cracked_stone_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool()));
    public static final Block CRACKED_STONE_BRICKS_WALL = registerBlock("cracked_stone_bricks_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool()));

    //TINY BRICKS
    public static final Block STONE_TINY_BRICKS = registerBlock("stone_tiny_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).requiresTool()));
    public static final Block STONE_TINY_BRICKS_STAIRS = registerBlock("stone_tiny_bricks_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).requiresTool()));
    public static final Block STONE_TINY_BRICKS_SLAB = registerBlock("stone_tiny_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).requiresTool()));
    public static final Block STONE_TINY_BRICKS_WALL = registerBlock("stone_tiny_bricks_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).requiresTool()));

    //MOSSY TINY BRICKS
    public static final Block MOSSY_STONE_TINY_BRICKS = registerBlock("mossy_stone_tiny_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).requiresTool()));
    public static final Block MOSSY_STONE_TINY_BRICKS_STAIRS = registerBlock("mossy_stone_tiny_bricks_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).requiresTool()));
    public static final Block MOSSY_STONE_TINY_BRICKS_SLAB = registerBlock("mossy_stone_tiny_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).requiresTool()));
    public static final Block MOSSY_STONE_TINY_BRICKS_WALL = registerBlock("mossy_stone_tiny_bricks_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).requiresTool()));

    //CRACKED TINY BRICKS
    public static final Block CRACKED_STONE_TINY_BRICKS = registerBlock("cracked_stone_tiny_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).requiresTool()));
    public static final Block CRACKED_STONE_TINY_BRICKS_STAIRS = registerBlock("cracked_stone_tiny_bricks_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).requiresTool()));
    public static final Block CRACKED_STONE_TINY_BRICKS_SLAB = registerBlock("cracked_stone_tiny_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).requiresTool()));
    public static final Block CRACKED_STONE_TINY_BRICKS_WALL = registerBlock("cracked_stone_tiny_bricks_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).requiresTool()));

    //TILES
    public static final Block STONE_TILES = registerBlock("stone_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool()));
    public static final Block STONE_TILES_STAIRS = registerBlock("stone_tiles_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool()));
    public static final Block STONE_TILES_SLAB = registerBlock("stone_tiles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool()));
    public static final Block STONE_TILES_WALL = registerBlock("stone_tiles_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool()));

    //MOSSY TILES
    public static final Block MOSSY_STONE_TILES = registerBlock("mossy_stone_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool()));
    public static final Block MOSSY_STONE_TILES_STAIRS = registerBlock("mossy_stone_tiles_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool()));
    public static final Block MOSSY_STONE_TILES_SLAB = registerBlock("mossy_stone_tiles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool()));
    public static final Block MOSSY_STONE_TILES_WALL = registerBlock("mossy_stone_tiles_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool()));

    //CRACKED TILES
    public static final Block CRACKED_STONE_TILES = registerBlock("cracked_stone_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool()));
    public static final Block CRACKED_STONE_TILES_STAIRS = registerBlock("cracked_stone_tiles_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool()));
    public static final Block CRACKED_STONE_TILES_SLAB = registerBlock("cracked_stone_tiles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool()));
    public static final Block CRACKED_STONE_TILES_WALL = registerBlock("cracked_stone_tiles_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).requiresTool()));

    //TINY TILES
    public static final Block STONE_TINY_TILES = registerBlock("stone_tiny_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).requiresTool()));
    public static final Block STONE_TINY_TILES_STAIRS = registerBlock("stone_tiny_tiles_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).requiresTool()));
    public static final Block STONE_TINY_TILES_SLAB = registerBlock("stone_tiny_tiles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).requiresTool()));
    public static final Block STONE_TINY_TILES_WALL = registerBlock("stone_tiny_tiles_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).requiresTool()));

    //MOSSY TINY TILES
    public static final Block MOSSY_STONE_TINY_TILES = registerBlock("mossy_stone_tiny_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).requiresTool()));
    public static final Block MOSSY_STONE_TINY_TILES_STAIRS = registerBlock("mossy_stone_tiny_tiles_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).requiresTool()));
    public static final Block MOSSY_STONE_TINY_TILES_SLAB = registerBlock("mossy_stone_tiny_tiles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).requiresTool()));
    public static final Block MOSSY_STONE_TINY_TILES_WALL = registerBlock("mossy_stone_tiny_tiles_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).requiresTool()));

    //CRACKED TINY TILES
    public static final Block CRACKED_STONE_TINY_TILES = registerBlock("cracked_stone_tiny_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).requiresTool()));
    public static final Block CRACKED_STONE_TINY_TILES_STAIRS = registerBlock("cracked_stone_tiny_tiles_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).requiresTool()));
    public static final Block CRACKED_STONE_TINY_TILES_SLAB = registerBlock("cracked_stone_tiny_tiles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).requiresTool()));
    public static final Block CRACKED_STONE_TINY_TILES_WALL = registerBlock("cracked_stone_tiny_tiles_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).requiresTool()));

        //ANDESITE

    //BRICKS
    public static final Block ANDESITE_BRICKS = registerBlock("andesite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).requiresTool()));
    public static final Block ANDESITE_BRICKS_STAIRS = registerBlock("andesite_bricks_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).requiresTool()));
    public static final Block ANDESITE_BRICKS_SLAB = registerBlock("andesite_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).requiresTool()));
    public static final Block ANDESITE_BRICKS_WALL = registerBlock("andesite_bricks_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).requiresTool()));

    //TINY BRICKS
    public static final Block ANDESITE_TINY_BRICKS = registerBlock("andesite_tiny_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).requiresTool()));
    public static final Block ANDESITE_TINY_BRICKS_STAIRS = registerBlock("andesite_tiny_bricks_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).requiresTool()));
    public static final Block ANDESITE_TINY_BRICKS_SLAB = registerBlock("andesite_tiny_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).requiresTool()));
    public static final Block ANDESITE_TINY_BRICKS_WALL = registerBlock("andesite_tiny_bricks_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).requiresTool()));









            //MISSING FROM VANILLA

        //COLORED BLOCKS

    public static final Block TERRACOTTA_STAIRS = registerBlock("terracotta_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block TERRACOTTA_SLAB = registerBlock("terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block TERRACOTTA_WALL = registerBlock("terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    //WHITE
    public static final Block WHITE_TERRACOTTA_STAIRS = registerBlock("white_terracotta_stairs",
                new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block WHITE_TERRACOTTA_WALL = registerBlock("white_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    public static final Block WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block WHITE_CONCRETE_WALL = registerBlock("white_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    public static final Block WHITE_WOOL_STAIRS = registerBlock("white_wool_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block WHITE_WOOL_SLAB = registerBlock("white_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block WHITE_WOOL_WALL = registerBlock("white_wool_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    //LIGHT_GRAY
    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlock("light_gray_terracotta_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block LIGHT_GRAY_TERRACOTTA_WALL = registerBlock("light_gray_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block LIGHT_GRAY_CONCRETE_WALL = registerBlock("light_gray_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    public static final Block LIGHT_GRAY_WOOL_STAIRS = registerBlock("light_gray_wool_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block LIGHT_GRAY_WOOL_SLAB = registerBlock("light_gray_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block LIGHT_GRAY_WOOL_WALL = registerBlock("light_gray_wool_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    //GRAY
    public static final Block GRAY_TERRACOTTA_STAIRS = registerBlock("gray_terracotta_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block GRAY_TERRACOTTA_WALL = registerBlock("gray_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    public static final Block GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block GRAY_CONCRETE_WALL = registerBlock("gray_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    public static final Block GRAY_WOOL_STAIRS = registerBlock("gray_wool_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block GRAY_WOOL_SLAB = registerBlock("gray_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block GRAY_WOOL_WALL = registerBlock("gray_wool_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    //BLACK
    public static final Block BLACK_TERRACOTTA_STAIRS = registerBlock("black_terracotta_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block BLACK_TERRACOTTA_WALL = registerBlock("black_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    public static final Block BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block BLACK_CONCRETE_WALL = registerBlock("black_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    public static final Block BLACK_WOOL_STAIRS = registerBlock("black_wool_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block BLACK_WOOL_SLAB = registerBlock("black_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block BLACK_WOOL_WALL = registerBlock("black_wool_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    //BROWN
    public static final Block BROWN_TERRACOTTA_STAIRS = registerBlock("brown_terracotta_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block BROWN_TERRACOTTA_WALL = registerBlock("brown_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    public static final Block BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block BROWN_CONCRETE_WALL = registerBlock("brown_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    public static final Block BROWN_WOOL_STAIRS = registerBlock("brown_wool_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block BROWN_WOOL_SLAB = registerBlock("brown_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block BROWN_WOOL_WALL = registerBlock("brown_wool_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    //RED
    public static final Block RED_TERRACOTTA_STAIRS = registerBlock("red_terracotta_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block RED_TERRACOTTA_WALL = registerBlock("red_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    public static final Block RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block RED_CONCRETE_WALL = registerBlock("red_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    public static final Block RED_WOOL_STAIRS = registerBlock("red_wool_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block RED_WOOL_SLAB = registerBlock("red_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block RED_WOOL_WALL = registerBlock("red_wool_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    //ORANGE
    public static final Block ORANGE_TERRACOTTA_STAIRS = registerBlock("orange_terracotta_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block ORANGE_TERRACOTTA_WALL = registerBlock("orange_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    public static final Block ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block ORANGE_CONCRETE_WALL = registerBlock("orange_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    public static final Block ORANGE_WOOL_STAIRS = registerBlock("orange_wool_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block ORANGE_WOOL_SLAB = registerBlock("orange_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block ORANGE_WOOL_WALL = registerBlock("orange_wool_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    //YELLOW
    public static final Block YELLOW_TERRACOTTA_STAIRS = registerBlock("yellow_terracotta_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block YELLOW_TERRACOTTA_WALL = registerBlock("yellow_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    public static final Block YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block YELLOW_CONCRETE_WALL = registerBlock("yellow_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    public static final Block YELLOW_WOOL_STAIRS = registerBlock("yellow_wool_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block YELLOW_WOOL_SLAB = registerBlock("yellow_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block YELLOW_WOOL_WALL = registerBlock("yellow_wool_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    //LIME
    public static final Block LIME_TERRACOTTA_STAIRS = registerBlock("lime_terracotta_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block LIME_TERRACOTTA_WALL = registerBlock("lime_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    public static final Block LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block LIME_CONCRETE_WALL = registerBlock("lime_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    public static final Block LIME_WOOL_STAIRS = registerBlock("lime_wool_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block LIME_WOOL_SLAB = registerBlock("lime_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block LIME_WOOL_WALL = registerBlock("lime_wool_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    //GREEN
    public static final Block GREEN_TERRACOTTA_STAIRS = registerBlock("green_terracotta_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block GREEN_TERRACOTTA_WALL = registerBlock("green_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    public static final Block GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block GREEN_CONCRETE_WALL = registerBlock("green_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    public static final Block GREEN_WOOL_STAIRS = registerBlock("green_wool_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block GREEN_WOOL_SLAB = registerBlock("green_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block GREEN_WOOL_WALL = registerBlock("green_wool_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    //CYAN
    public static final Block CYAN_TERRACOTTA_STAIRS = registerBlock("cyan_terracotta_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block CYAN_TERRACOTTA_WALL = registerBlock("cyan_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    public static final Block CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block CYAN_CONCRETE_WALL = registerBlock("cyan_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    public static final Block CYAN_WOOL_STAIRS = registerBlock("cyan_wool_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block CYAN_WOOL_SLAB = registerBlock("cyan_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block CYAN_WOOL_WALL = registerBlock("cyan_wool_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    //LIGHT_BLUE
    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlock("light_blue_terracotta_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block LIGHT_BLUE_TERRACOTTA_WALL = registerBlock("light_blue_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block LIGHT_BLUE_CONCRETE_WALL = registerBlock("light_blue_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    public static final Block LIGHT_BLUE_WOOL_STAIRS = registerBlock("light_blue_wool_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block LIGHT_BLUE_WOOL_SLAB = registerBlock("light_blue_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block LIGHT_BLUE_WOOL_WALL = registerBlock("light_blue_wool_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    //BLUE
    public static final Block BLUE_TERRACOTTA_STAIRS = registerBlock("blue_terracotta_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block BLUE_TERRACOTTA_WALL = registerBlock("blue_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    public static final Block BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block BLUE_CONCRETE_WALL = registerBlock("blue_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    public static final Block BLUE_WOOL_STAIRS = registerBlock("blue_wool_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block BLUE_WOOL_SLAB = registerBlock("blue_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block BLUE_WOOL_WALL = registerBlock("blue_wool_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    //PURPLE
    public static final Block PURPLE_TERRACOTTA_STAIRS = registerBlock("purple_terracotta_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block PURPLE_TERRACOTTA_WALL = registerBlock("purple_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    public static final Block PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block PURPLE_CONCRETE_WALL = registerBlock("purple_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    public static final Block PURPLE_WOOL_STAIRS = registerBlock("purple_wool_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block PURPLE_WOOL_SLAB = registerBlock("purple_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block PURPLE_WOOL_WALL = registerBlock("purple_wool_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    //MAGENTA
    public static final Block MAGENTA_TERRACOTTA_STAIRS = registerBlock("magenta_terracotta_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block MAGENTA_TERRACOTTA_WALL = registerBlock("magenta_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    public static final Block MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block MAGENTA_CONCRETE_WALL = registerBlock("magenta_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    public static final Block MAGENTA_WOOL_STAIRS = registerBlock("magenta_wool_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block MAGENTA_WOOL_SLAB = registerBlock("magenta_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block MAGENTA_WOOL_WALL = registerBlock("magenta_wool_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    //PINK
    public static final Block PINK_TERRACOTTA_STAIRS = registerBlock("pink_terracotta_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block PINK_TERRACOTTA_WALL = registerBlock("pink_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    public static final Block PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block PINK_CONCRETE_WALL = registerBlock("pink_concrete_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));

    public static final Block PINK_WOOL_STAIRS = registerBlock("pink_wool_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block PINK_WOOL_SLAB = registerBlock("pink_wool_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));
    public static final Block PINK_WOOL_WALL = registerBlock("pink_wool_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).requiresTool()));




    //PACKED MUD

    public static final Block PACKED_MUD_STAIRS = registerBlock("packed_mud_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.PACKED_MUD).requiresTool()));
    public static final Block PACKED_MUD_SLAB = registerBlock("packed_mud_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PACKED_MUD).requiresTool()));
    public static final Block PACKED_MUD_WALL = registerBlock("packed_mud_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PACKED_MUD).requiresTool()));

    //NETHERRACK
    public static final Block NETHERRACK_STAIRS = registerBlock("netherrack_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.NETHERRACK).requiresTool()));
    public static final Block NETHERRACK_SLAB = registerBlock("netherrack_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK).requiresTool()));
    public static final Block NETHERRACK_WALL = registerBlock("netherrack_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.NETHERRACK).requiresTool()));

    //SMOOTH BASALT
    public static final Block SMOOTH_BASALT_STAIRS = registerBlock("smooth_basalt_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SMOOTH_BASALT).requiresTool()));
    public static final Block SMOOTH_BASALT_SLAB = registerBlock("smooth_basalt_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_BASALT).requiresTool()));
    public static final Block SMOOTH_BASALT_WALL = registerBlock("smooth_basalt_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SMOOTH_BASALT).requiresTool()));

    //ENDSTONE
    public static final Block ENDSTONE_STAIRS = registerBlock("endstone_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.END_STONE).requiresTool()));
    public static final Block ENDSTONE_SLAB = registerBlock("endstone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.END_STONE).requiresTool()));
    public static final Block ENDSTONE_WALL = registerBlock("endstone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.END_STONE).requiresTool()));

    //PACKED_ICE
    public static final Block PACKED_ICE_STAIRS = registerBlock("packed_ice_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.PACKED_ICE).requiresTool()));
    public static final Block PACKED_ICE_SLAB = registerBlock("packed_ice_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PACKED_ICE).requiresTool()));
    public static final Block PACKED_ICE_WALL = registerBlock("packed_ice_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PACKED_ICE).requiresTool()));

    //SNOW
    public static final Block SNOW_STAIRS = registerBlock("snow_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.SNOW_BLOCK).requiresTool()));
    public static final Block SNOW_SLAB = registerBlock("snow_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.SNOW_BLOCK).requiresTool()));
    public static final Block SNOW_WALL = registerBlock("snow_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.SNOW_BLOCK).requiresTool()));

    //MOSS
    public static final Block MOSS_STAIRS = registerBlock("moss_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MOSS_BLOCK).requiresTool()));
    public static final Block MOSS_SLAB = registerBlock("moss_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.MOSS_BLOCK).requiresTool()));
    public static final Block MOSS_WALL = registerBlock("moss_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.MOSS_BLOCK).requiresTool()));

    //OBSIDIAN
    public static final Block OBSIDIAN_STAIRS = registerBlock("obsidian_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OBSIDIAN).requiresTool()));
    public static final Block OBSIDIAN_SLAB = registerBlock("obsidian_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).requiresTool()));
    public static final Block OBSIDIAN_WALL = registerBlock("obsidian_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).requiresTool()));

    //HONEYCOMB_BLOCK
    public static final Block HONEYCOMB_BLOCK_STAIRS = registerBlock("honeycomb_block_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.HONEYCOMB_BLOCK).requiresTool()));
    public static final Block HONEYCOMB_BLOCK_SLAB = registerBlock("honeycomb_block_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.HONEYCOMB_BLOCK).requiresTool()));
    public static final Block HONEYCOMB_BLOCK_WALL = registerBlock("honeycomb_block_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.HONEYCOMB_BLOCK).requiresTool()));





    public static final Block BOWLDER = registerBlock("bowlder",
            new BowlderBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.DEEPSLATE).strength(0.5f)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(ATWWMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(ATWWMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        return item;
    }

    public static void registerModBlocks() {
        ATWWMod.LOGGER.info("Registering ModBlocks for " + ATWWMod.MOD_ID);
    }
}