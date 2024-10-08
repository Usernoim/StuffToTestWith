package net.optionalpoop.stufftotestwith;

import net.fabricmc.api.ModInitializer;

import net.optionalpoop.stufftotestwith.item.ModItemGroups;
import net.optionalpoop.stufftotestwith.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StuffToTestWith implements ModInitializer {
	public static final String MOD_ID = "stufftotestwith";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItem();
	}
}