package net.rastin.atww.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.rastin.atww.ATWWMod;
import net.rastin.atww.item.ModItemGroup;

public class ModBlocks {

        //STONE

    //POLISHED
    public static final Block POLISHED_STONE = registerBlock("polished_stone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f).requiresTool()), ModItemGroup.ATWW_BUILDING);
    public static final Block POLISHED_STONE_STAIRS = registerBlock("polished_stone_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(1.5f).requiresTool()), ModItemGroup.ATWW_BUILDING);
    public static final Block POLISHED_STONE_SLAB = registerBlock("polished_stone_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(1.5f).requiresTool()), ModItemGroup.ATWW_BUILDING);
    public static final Block POLISHED_STONE_WALL = registerBlock("polished_stone_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(1.5f).requiresTool()), ModItemGroup.ATWW_BUILDING);


    //MOSSY POLISHED
    public static final Block MOSSY_POLISHED_STONE = registerBlock("mossy_polished_stone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(1.5f).requiresTool()), ModItemGroup.ATWW_BUILDING);
    public static final Block MOSSY_POLISHED_STONE_STAIRS = registerBlock("mossy_polished_stone_stairs",
            new ModStairsBlock(ModBlocks.POLISHED_STONE.getDefaultState(), FabricBlockSettings.of(Material.STONE).strength(1.5f).requiresTool()), ModItemGroup.ATWW_BUILDING);
    public static final Block MOSSY_POLISHED_STONE_SLAB = registerBlock("mossy_polished_stone_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE).strength(1.5f).requiresTool()), ModItemGroup.ATWW_BUILDING);
    public static final Block MOSSY_POLISHED_STONE_WALL = registerBlock("mossy_polished_stone_wall",
            new WallBlock(FabricBlockSettings.of(Material.STONE).strength(1.5f).requiresTool()), ModItemGroup.ATWW_BUILDING);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(ATWWMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(ATWWMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks() {
        ATWWMod.LOGGER.info("Registering ModBlocks for " + ATWWMod.MOD_ID);
    }
}
