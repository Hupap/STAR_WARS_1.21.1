package net.jannik.herbslightsabers.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.jannik.herbslightsabers.HerbsLightsabersSTARWARS;
import net.jannik.herbslightsabers.item.custom.ChiselItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // Uses the custom method "registerItem" on the listet items
    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));

    public static final Item CHISEL = registerItem("chisel", new ChiselItem(new Item.Settings().maxDamage(32)));

    // Custom method that registers new items with parameters "name" and "item"
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(HerbsLightsabersSTARWARS.MOD_ID, name), item);
    }

    // Custom method, called on initialization
    public static void registerModItems() {

        // Adds items to their item groups
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(PINK_GARNET);
        });
    }
}
