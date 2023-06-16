package net.rastin.atww.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.rastin.atww.ATWWMod;

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