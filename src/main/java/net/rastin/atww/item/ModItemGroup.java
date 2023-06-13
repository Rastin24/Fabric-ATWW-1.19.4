package net.rastin.atww.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
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
    public static ItemGroup ATWW_BUILDING = Registry.register(Registries.ITEM_GROUP, new Identifier(ATWWMod.MOD_ID, "atww_building"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.atww_building"))
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

                    }).build());

    public static void registerItemGroups() {
        // Example of adding to existing Item Group
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(ModItems.COPPER_NUGGET);
            entries.add(ModItems.RAW_IRON_NUGGET);
            entries.add(ModItems.RAW_COPPER_NUGGET);
            entries.add(ModItems.RAW_GOLD_NUGGET);

        });
    }


}
