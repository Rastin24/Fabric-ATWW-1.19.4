package net.rastin.atww;

import net.fabricmc.api.ModInitializer;

import net.rastin.atww.block.ModBlocks;
import net.rastin.atww.item.ModItemGroup;
import net.rastin.atww.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ATWWMod implements ModInitializer {
    public static final String MOD_ID = "atww";
    public static final Logger LOGGER = LoggerFactory.getLogger("atww");

    @Override
    public void onInitialize() {
        ModItemGroup.registerItemGroups();
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}