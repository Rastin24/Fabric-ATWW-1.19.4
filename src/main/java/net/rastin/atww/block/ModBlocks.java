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
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).strength(1.5f).requiresTool()));
    public static final Block POLISHED_STONE_STAIRS = registerBlock("polished_stone_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).strength(1.5f).requiresTool()));
    public static final Block POLISHED_STONE_SLAB = registerBlock("polished_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).strength(1.5f).requiresTool()));
    public static final Block POLISHED_STONE_WALL = registerBlock("polished_stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).strength(1.5f).requiresTool()));


    //MOSSY POLISHED
    public static final Block MOSSY_POLISHED_STONE = registerBlock("mossy_polished_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).strength(1.5f).requiresTool()));
    public static final Block MOSSY_POLISHED_STONE_STAIRS = registerBlock("mossy_polished_stone_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).strength(1.5f).requiresTool()));
    public static final Block MOSSY_POLISHED_STONE_SLAB = registerBlock("mossy_polished_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).strength(1.5f).requiresTool()));
    public static final Block MOSSY_POLISHED_STONE_WALL = registerBlock("mossy_polished_stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).strength(1.5f).requiresTool()));

    //CRACKED POLISHED
    public static final Block CRACKED_POLISHED_STONE = registerBlock("cracked_polished_stone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).strength(1.5f).requiresTool()));
    public static final Block CRACKED_POLISHED_STONE_STAIRS = registerBlock("cracked_polished_stone_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).strength(1.5f).requiresTool()));
    public static final Block CRACKED_POLISHED_STONE_SLAB = registerBlock("cracked_polished_stone_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).strength(1.5f).requiresTool()));
    public static final Block CRACKED_POLISHED_STONE_WALL = registerBlock("cracked_polished_stone_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).strength(1.5f).requiresTool()));

    //BRICKS
    public static final Block CRACKED_STONE_BRICKS_STAIRS = registerBlock("cracked_stone_bricks_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).strength(1.5f).requiresTool()));
    public static final Block CRACKED_STONE_BRICKS_SLAB = registerBlock("cracked_stone_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).strength(1.5f).requiresTool()));
    public static final Block CRACKED_STONE_BRICKS_WALL = registerBlock("cracked_stone_bricks_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).strength(1.5f).requiresTool()));

    //TINY BRICKS
    public static final Block STONE_TINY_BRICKS = registerBlock("stone_tiny_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).strength(1.5f).requiresTool()));
    public static final Block STONE_TINY_BRICKS_STAIRS = registerBlock("stone_tiny_bricks_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).strength(1.5f).requiresTool()));
    public static final Block STONE_TINY_BRICKS_SLAB = registerBlock("stone_tiny_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).strength(1.5f).requiresTool()));
    public static final Block STONE_TINY_BRICKS_WALL = registerBlock("stone_tiny_bricks_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).strength(1.5f).requiresTool()));

    //MOSSY TINY BRICKS
    public static final Block MOSSY_STONE_TINY_BRICKS = registerBlock("mossy_stone_tiny_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).strength(1.5f).requiresTool()));
    public static final Block MOSSY_STONE_TINY_BRICKS_STAIRS = registerBlock("mossy_stone_tiny_bricks_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).strength(1.5f).requiresTool()));
    public static final Block MOSSY_STONE_TINY_BRICKS_SLAB = registerBlock("mossy_stone_tiny_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).strength(1.5f).requiresTool()));
    public static final Block MOSSY_STONE_TINY_BRICKS_WALL = registerBlock("mossy_stone_tiny_bricks_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).strength(1.5f).requiresTool()));

    //CRACKED TINY BRICKS
    public static final Block CRACKED_STONE_TINY_BRICKS = registerBlock("cracked_stone_tiny_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).strength(1.5f).requiresTool()));
    public static final Block CRACKED_STONE_TINY_BRICKS_STAIRS = registerBlock("cracked_stone_tiny_bricks_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).strength(1.5f).requiresTool()));
    public static final Block CRACKED_STONE_TINY_BRICKS_SLAB = registerBlock("cracked_stone_tiny_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).strength(1.5f).requiresTool()));
    public static final Block CRACKED_STONE_TINY_BRICKS_WALL = registerBlock("cracked_stone_tiny_bricks_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).strength(1.5f).requiresTool()));

    //TILES
    public static final Block STONE_TILES = registerBlock("stone_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).strength(1.5f).requiresTool()));
    public static final Block STONE_TILES_STAIRS = registerBlock("stone_tiles_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).strength(1.5f).requiresTool()));
    public static final Block STONE_TILES_SLAB = registerBlock("stone_tiles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).strength(1.5f).requiresTool()));
    public static final Block STONE_TILES_WALL = registerBlock("stone_tiles_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).strength(1.5f).requiresTool()));

    //MOSSY TILES
    public static final Block MOSSY_STONE_TILES = registerBlock("mossy_stone_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).strength(1.5f).requiresTool()));
    public static final Block MOSSY_STONE_TILES_STAIRS = registerBlock("mossy_stone_tiles_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).strength(1.5f).requiresTool()));
    public static final Block MOSSY_STONE_TILES_SLAB = registerBlock("mossy_stone_tiles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).strength(1.5f).requiresTool()));
    public static final Block MOSSY_STONE_TILES_WALL = registerBlock("mossy_stone_tiles_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).strength(1.5f).requiresTool()));

    //CRACKED TILES
    public static final Block CRACKED_STONE_TILES = registerBlock("cracked_stone_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).strength(1.5f).requiresTool()));
    public static final Block CRACKED_STONE_TILES_STAIRS = registerBlock("cracked_stone_tiles_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).strength(1.5f).requiresTool()));
    public static final Block CRACKED_STONE_TILES_SLAB = registerBlock("cracked_stone_tiles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).strength(1.5f).requiresTool()));
    public static final Block CRACKED_STONE_TILES_WALL = registerBlock("cracked_stone_tiles_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).strength(1.5f).requiresTool()));

    //TINY TILES
    public static final Block STONE_TINY_TILES = registerBlock("stone_tiny_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).strength(1.5f).requiresTool()));
    public static final Block STONE_TINY_TILES_STAIRS = registerBlock("stone_tiny_tiles_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).strength(1.5f).requiresTool()));
    public static final Block STONE_TINY_TILES_SLAB = registerBlock("stone_tiny_tiles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).strength(1.5f).requiresTool()));
    public static final Block STONE_TINY_TILES_WALL = registerBlock("stone_tiny_tiles_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).strength(1.5f).requiresTool()));

    //MOSSY TINY TILES
    public static final Block MOSSY_STONE_TINY_TILES = registerBlock("mossy_stone_tiny_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).strength(1.5f).requiresTool()));
    public static final Block MOSSY_STONE_TINY_TILES_STAIRS = registerBlock("mossy_stone_tiny_tiles_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).strength(1.5f).requiresTool()));
    public static final Block MOSSY_STONE_TINY_TILES_SLAB = registerBlock("mossy_stone_tiny_tiles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).strength(1.5f).requiresTool()));
    public static final Block MOSSY_STONE_TINY_TILES_WALL = registerBlock("mossy_stone_tiny_tiles_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).strength(1.5f).requiresTool()));

    //CRACKED TINY TILES
    public static final Block CRACKED_STONE_TINY_TILES = registerBlock("cracked_stone_tiny_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).strength(1.5f).requiresTool()));
    public static final Block CRACKED_STONE_TINY_TILES_STAIRS = registerBlock("cracked_stone_tiny_tiles_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).strength(1.5f).requiresTool()));
    public static final Block CRACKED_STONE_TINY_TILES_SLAB = registerBlock("cracked_stone_tiny_tiles_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).strength(1.5f).requiresTool()));
    public static final Block CRACKED_STONE_TINY_TILES_WALL = registerBlock("cracked_stone_tiny_tiles_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).strength(1.5f).requiresTool()));

        //ANDESITE

    //BRICKS
    public static final Block ANDESITE_BRICKS = registerBlock("andesite_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).strength(1.5f).requiresTool()));
    public static final Block ANDESITE_BRICKS_STAIRS = registerBlock("andesite_bricks_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).strength(1.5f).requiresTool()));
    public static final Block ANDESITE_BRICKS_SLAB = registerBlock("andesite_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).strength(1.5f).requiresTool()));
    public static final Block ANDESITE_BRICKS_WALL = registerBlock("andesite_bricks_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).strength(1.5f).requiresTool()));

    //TINY BRICKS
    public static final Block ANDESITE_TINY_BRICKS = registerBlock("andesite_tiny_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).strength(1.5f).requiresTool()));
    public static final Block ANDESITE_TINY_BRICKS_STAIRS = registerBlock("andesite_tiny_bricks_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).strength(1.5f).requiresTool()));
    public static final Block ANDESITE_TINY_BRICKS_SLAB = registerBlock("andesite_tiny_bricks_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).strength(1.5f).requiresTool()));
    public static final Block ANDESITE_TINY_BRICKS_WALL = registerBlock("andesite_tiny_bricks_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS).sounds(BlockSoundGroup.NETHER_BRICKS).strength(1.5f).requiresTool()));



            //MISSING FROM VANILLA

        //COLORED BLOCKS

    public static final Block TERRACOTTA_STAIRS = registerBlock("terracotta_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));
    public static final Block TERRACOTTA_SLAB = registerBlock("terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));
    public static final Block TERRACOTTA_WALL = registerBlock("terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));

    //WHITE
    public static final Block WHITE_TERRACOTTA_STAIRS = registerBlock("white_terracotta_stairs",
                new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));
    public static final Block WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));
    public static final Block WHITE_TERRACOTTA_WALL = registerBlock("white_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));



    //LIGHT_GRAY
    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlock("light_gray_terracotta_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));
    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));
    public static final Block LIGHT_GRAY_TERRACOTTA_WALL = registerBlock("light_gray_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));

    //GRAY
    public static final Block GRAY_TERRACOTTA_STAIRS = registerBlock("gray_terracotta_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));
    public static final Block GRAY_TERRACOTTA_SLAB = registerBlock("gray_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));
    public static final Block GRAY_TERRACOTTA_WALL = registerBlock("gray_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));

    //BLACK
    public static final Block BLACK_TERRACOTTA_STAIRS = registerBlock("black_terracotta_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));
    public static final Block BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));
    public static final Block BLACK_TERRACOTTA_WALL = registerBlock("black_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));

    //BROWN
    public static final Block BROWN_TERRACOTTA_STAIRS = registerBlock("brown_terracotta_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));
    public static final Block BROWN_TERRACOTTA_SLAB = registerBlock("brown_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));
    public static final Block BROWN_TERRACOTTA_WALL = registerBlock("brown_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));

    //RED
    public static final Block RED_TERRACOTTA_STAIRS = registerBlock("red_terracotta_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));
    public static final Block RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));
    public static final Block RED_TERRACOTTA_WALL = registerBlock("red_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));

    //ORANGE
    public static final Block ORANGE_TERRACOTTA_STAIRS = registerBlock("orange_terracotta_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));
    public static final Block ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));
    public static final Block ORANGE_TERRACOTTA_WALL = registerBlock("orange_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));

    //YELLOW
    public static final Block YELLOW_TERRACOTTA_STAIRS = registerBlock("yellow_terracotta_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));
    public static final Block YELLOW_TERRACOTTA_SLAB = registerBlock("yellow_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));
    public static final Block YELLOW_TERRACOTTA_WALL = registerBlock("yellow_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));

    //LIME
    public static final Block LIME_TERRACOTTA_STAIRS = registerBlock("lime_terracotta_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));
    public static final Block LIME_TERRACOTTA_SLAB = registerBlock("lime_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));
    public static final Block LIME_TERRACOTTA_WALL = registerBlock("lime_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));

    //GREEN
    public static final Block GREEN_TERRACOTTA_STAIRS = registerBlock("green_terracotta_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));
    public static final Block GREEN_TERRACOTTA_SLAB = registerBlock("green_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));
    public static final Block GREEN_TERRACOTTA_WALL = registerBlock("green_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));

    //CYAN
    public static final Block CYAN_TERRACOTTA_STAIRS = registerBlock("cyan_terracotta_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));
    public static final Block CYAN_TERRACOTTA_SLAB = registerBlock("cyan_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));
    public static final Block CYAN_TERRACOTTA_WALL = registerBlock("cyan_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));

    //LIGHT_BLUE
    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlock("light_blue_terracotta_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));
    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));
    public static final Block LIGHT_BLUE_TERRACOTTA_WALL = registerBlock("light_blue_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));

    //BLUE
    public static final Block BLUE_TERRACOTTA_STAIRS = registerBlock("blue_terracotta_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));
    public static final Block BLUE_TERRACOTTA_SLAB = registerBlock("blue_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));
    public static final Block BLUE_TERRACOTTA_WALL = registerBlock("blue_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));

    //PURPLE
    public static final Block PURPLE_TERRACOTTA_STAIRS = registerBlock("purple_terracotta_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));
    public static final Block PURPLE_TERRACOTTA_SLAB = registerBlock("purple_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));
    public static final Block PURPLE_TERRACOTTA_WALL = registerBlock("purple_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));

    //MAGENTA
    public static final Block MAGENTA_TERRACOTTA_STAIRS = registerBlock("magenta_terracotta_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));
    public static final Block MAGENTA_TERRACOTTA_SLAB = registerBlock("magenta_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));
    public static final Block MAGENTA_TERRACOTTA_WALL = registerBlock("magenta_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));

    //PINK
    public static final Block PINK_TERRACOTTA_STAIRS = registerBlock("pink_terracotta_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));
    public static final Block PINK_TERRACOTTA_SLAB = registerBlock("pink_terracotta_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));
    public static final Block PINK_TERRACOTTA_WALL = registerBlock("pink_terracotta_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.TERRACOTTA).strength(1.5f).requiresTool()));

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