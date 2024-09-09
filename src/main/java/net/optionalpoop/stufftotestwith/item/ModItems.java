package net.optionalpoop.stufftotestwith.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.client.tutorial.TutorialManager;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.optionalpoop.stufftotestwith.StuffToTestWith;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item SONIC = registerItem("sonic", new Item(new FabricItemSettings()));
    public static final Item SIGMA_MODE_ACTIVATED = registerItem("sigma_mode_activated", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
        entries.add(SONIC);
        entries.add(SIGMA_MODE_ACTIVATED);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(StuffToTestWith.MOD_ID, name), item);
    }

    public static void registerModItem() {
        StuffToTestWith.LOGGER.info("Registering Mod Items for " + StuffToTestWith.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}