package net.jannik.herbslightsabers;

import net.fabricmc.api.ModInitializer;

import net.jannik.herbslightsabers.block.ModBlocks;
import net.jannik.herbslightsabers.item.ModItemGroups;
import net.jannik.herbslightsabers.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HerbsLightsabersSTARWARS implements ModInitializer {
	public static final String MOD_ID = "herbslightsabers";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}