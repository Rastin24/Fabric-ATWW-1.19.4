package net.rastin.atww.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.rastin.atww.ATWWMod;

public class ModItems {
    public static final Item COPPER_NUGGET = registerItem("copper_nugget",
            new Item(new FabricItemSettings()));
    public static final Item RAW_IRON_NUGGET = registerItem("raw_iron_nugget",
            new Item(new FabricItemSettings()));
    public static final Item RAW_COPPER_NUGGET = registerItem("raw_copper_nugget",
            new Item(new FabricItemSettings()));
    public static final Item RAW_GOLD_NUGGET = registerItem("raw_gold_nugget",
            new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ATWWMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ATWWMod.LOGGER.info("Registering Mod Items for " + ATWWMod.MOD_ID);
    }
}