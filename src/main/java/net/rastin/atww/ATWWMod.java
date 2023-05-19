package net.rastin.atww;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// omg
public class ATWWMod implements ModInitializer {
    public static final String MOD_ID = "atww";
    public static final Logger LOGGER = LoggerFactory.getLogger("atww");

    @Override
    public void onInitialize() {
        LOGGER.info("Hello Fabric world!");
    }
}