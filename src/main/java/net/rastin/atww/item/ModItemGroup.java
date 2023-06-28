package net.rastin.atww.item;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.rastin.atww.ATWWMod;
import net.rastin.atww.block.ModBlocks;


public class ModItemGroup {
    public static ItemGroup ATWW_BUILDING = Registry.register(Registries.ITEM_GROUP, new Identifier(ATWWMod.MOD_ID, "atww"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.atww"))
                    .icon(() -> new ItemStack(ModBlocks.POLISHED_STONE)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.POLISHED_STONE);
                        entries.add(ModBlocks.POLISHED_STONE_STAIRS);
                        entries.add(ModBlocks.POLISHED_STONE_SLAB);
                        entries.add(ModBlocks.POLISHED_STONE_WALL);
                        entries.add(ModBlocks.MOSSY_POLISHED_STONE);
                        entries.add(ModBlocks.MOSSY_POLISHED_STONE_STAIRS);
                        entries.add(ModBlocks.MOSSY_POLISHED_STONE_SLAB);
                        entries.add(ModBlocks.MOSSY_POLISHED_STONE_WALL);
                        entries.add(ModBlocks.CRACKED_POLISHED_STONE);
                        entries.add(ModBlocks.CRACKED_POLISHED_STONE_STAIRS);
                        entries.add(ModBlocks.CRACKED_POLISHED_STONE_SLAB);
                        entries.add(ModBlocks.CRACKED_POLISHED_STONE_WALL);

                        entries.add(ModBlocks.CRACKED_STONE_BRICKS_STAIRS);
                        entries.add(ModBlocks.CRACKED_STONE_BRICKS_SLAB);
                        entries.add(ModBlocks.CRACKED_STONE_BRICKS_WALL);

                        entries.add(ModBlocks.STONE_TINY_BRICKS);
                        entries.add(ModBlocks.STONE_TINY_BRICKS_STAIRS);
                        entries.add(ModBlocks.STONE_TINY_BRICKS_SLAB);
                        entries.add(ModBlocks.STONE_TINY_BRICKS_WALL);
                        entries.add(ModBlocks.MOSSY_STONE_TINY_BRICKS);
                        entries.add(ModBlocks.MOSSY_STONE_TINY_BRICKS_STAIRS);
                        entries.add(ModBlocks.MOSSY_STONE_TINY_BRICKS_SLAB);
                        entries.add(ModBlocks.MOSSY_STONE_TINY_BRICKS_WALL);
                        entries.add(ModBlocks.CRACKED_STONE_TINY_BRICKS);
                        entries.add(ModBlocks.CRACKED_STONE_TINY_BRICKS_STAIRS);
                        entries.add(ModBlocks.CRACKED_STONE_TINY_BRICKS_SLAB);
                        entries.add(ModBlocks.CRACKED_STONE_TINY_BRICKS_WALL);

                        entries.add(ModBlocks.STONE_TILES);
                        entries.add(ModBlocks.STONE_TILES_STAIRS);
                        entries.add(ModBlocks.STONE_TILES_SLAB);
                        entries.add(ModBlocks.STONE_TILES_WALL);
                        entries.add(ModBlocks.MOSSY_STONE_TILES);
                        entries.add(ModBlocks.MOSSY_STONE_TILES_STAIRS);
                        entries.add(ModBlocks.MOSSY_STONE_TILES_SLAB);
                        entries.add(ModBlocks.MOSSY_STONE_TILES_WALL);
                        entries.add(ModBlocks.CRACKED_STONE_TILES);
                        entries.add(ModBlocks.CRACKED_STONE_TILES_STAIRS);
                        entries.add(ModBlocks.CRACKED_STONE_TILES_SLAB);
                        entries.add(ModBlocks.CRACKED_STONE_TILES_WALL);

                        entries.add(ModBlocks.STONE_TINY_TILES);
                        entries.add(ModBlocks.STONE_TINY_TILES_STAIRS);
                        entries.add(ModBlocks.STONE_TINY_TILES_SLAB);
                        entries.add(ModBlocks.STONE_TINY_TILES_WALL);
                        entries.add(ModBlocks.MOSSY_STONE_TINY_TILES);
                        entries.add(ModBlocks.MOSSY_STONE_TINY_TILES_STAIRS);
                        entries.add(ModBlocks.MOSSY_STONE_TINY_TILES_SLAB);
                        entries.add(ModBlocks.MOSSY_STONE_TINY_TILES_WALL);
                        entries.add(ModBlocks.CRACKED_STONE_TINY_TILES);
                        entries.add(ModBlocks.CRACKED_STONE_TINY_TILES_STAIRS);
                        entries.add(ModBlocks.CRACKED_STONE_TINY_TILES_SLAB);
                        entries.add(ModBlocks.CRACKED_STONE_TINY_TILES_WALL);



                        entries.add(ModBlocks.ANDESITE_BRICKS);
                        entries.add(ModBlocks.ANDESITE_BRICKS_STAIRS);
                        entries.add(ModBlocks.ANDESITE_BRICKS_SLAB);
                        entries.add(ModBlocks.ANDESITE_BRICKS_WALL);

                        entries.add(ModBlocks.ANDESITE_TINY_BRICKS);
                        entries.add(ModBlocks.ANDESITE_TINY_BRICKS_STAIRS);
                        entries.add(ModBlocks.ANDESITE_TINY_BRICKS_SLAB);
                        entries.add(ModBlocks.ANDESITE_TINY_BRICKS_WALL);



                        entries.add(Blocks.TERRACOTTA);
                        entries.add(ModBlocks.TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.TERRACOTTA_SLAB);
                        entries.add(ModBlocks.TERRACOTTA_WALL);

                        entries.add(Blocks.WHITE_TERRACOTTA);
                        entries.add(ModBlocks.WHITE_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.WHITE_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.WHITE_TERRACOTTA_WALL);

                        entries.add(Blocks.LIGHT_GRAY_TERRACOTTA);
                        entries.add(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL);

                        entries.add(Blocks.GRAY_TERRACOTTA);
                        entries.add(ModBlocks.GRAY_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.GRAY_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.GRAY_TERRACOTTA_WALL);

                        entries.add(Blocks.BLACK_TERRACOTTA);
                        entries.add(ModBlocks.BLACK_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.BLACK_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.BLACK_TERRACOTTA_WALL);

                        entries.add(Blocks.BROWN_TERRACOTTA);
                        entries.add(ModBlocks.BROWN_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.BROWN_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.BROWN_TERRACOTTA_WALL);

                        entries.add(Blocks.RED_TERRACOTTA);
                        entries.add(ModBlocks.RED_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.RED_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.RED_TERRACOTTA_WALL);

                        entries.add(Blocks.ORANGE_TERRACOTTA);
                        entries.add(ModBlocks.ORANGE_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.ORANGE_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.ORANGE_TERRACOTTA_WALL);

                        entries.add(Blocks.YELLOW_TERRACOTTA);
                        entries.add(ModBlocks.YELLOW_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.YELLOW_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.YELLOW_TERRACOTTA_WALL);

                        entries.add(Blocks.LIME_TERRACOTTA);
                        entries.add(ModBlocks.LIME_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.LIME_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.LIME_TERRACOTTA_WALL);

                        entries.add(Blocks.GREEN_TERRACOTTA);
                        entries.add(ModBlocks.GREEN_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.GREEN_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.GREEN_TERRACOTTA_WALL);

                        entries.add(Blocks.CYAN_TERRACOTTA);
                        entries.add(ModBlocks.CYAN_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.CYAN_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.CYAN_TERRACOTTA_WALL);

                        entries.add(Blocks.LIGHT_BLUE_TERRACOTTA);
                        entries.add(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL);

                        entries.add(Blocks.BLUE_TERRACOTTA);
                        entries.add(ModBlocks.BLUE_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.BLUE_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.BLUE_TERRACOTTA_WALL);

                        entries.add(Blocks.PURPLE_TERRACOTTA);
                        entries.add(ModBlocks.PURPLE_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.PURPLE_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.PURPLE_TERRACOTTA_WALL);

                        entries.add(Blocks.MAGENTA_TERRACOTTA);
                        entries.add(ModBlocks.MAGENTA_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.MAGENTA_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.MAGENTA_TERRACOTTA_WALL);

                        entries.add(Blocks.PINK_TERRACOTTA);
                        entries.add(ModBlocks.PINK_TERRACOTTA_STAIRS);
                        entries.add(ModBlocks.PINK_TERRACOTTA_SLAB);
                        entries.add(ModBlocks.PINK_TERRACOTTA_WALL);



                    }).build());

    public static void registerItemGroups() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ModBlocks.BOWLDER);

            entries.add(ModItems.COPPER_NUGGET);

            entries.add(ModItems.RAW_IRON_NUGGET);
            entries.add(ModItems.RAW_COPPER_NUGGET);
            entries.add(ModItems.RAW_GOLD_NUGGET);

            entries.add(ModItems.OAK_PLANK);
            entries.add(ModItems.SPRUCE_PLANK);
            entries.add(ModItems.BIRCH_PLANK);
            entries.add(ModItems.JUNGLE_PLANK);
            entries.add(ModItems.ACACIA_PLANK);
            entries.add(ModItems.DARK_OAK_PLANK);
            entries.add(ModItems.MANGROVE_PLANK);
            entries.add(ModItems.CHERRY_PLANK);
            entries.add(ModItems.CRIMSON_PLANK);
            entries.add(ModItems.WARPED_PLANK);

        });

    }
}