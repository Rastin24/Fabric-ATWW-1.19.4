package net.rastin.atww.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.rastin.atww.ATWWMod;
import net.rastin.atww.block.ModBlocks;

public class ModItemGroup {
    public static ItemGroup ATWW_BUILDING;

    public static void registerItemGroups() {
        ATWW_BUILDING = FabricItemGroup.builder(new Identifier(ATWWMod.MOD_ID, "atww_building"))
                .displayName(Text.translatable("itemgroup.atww_building"))
                .icon(() -> new ItemStack(ModBlocks.POLISHED_STONE)).build();
    }


}
