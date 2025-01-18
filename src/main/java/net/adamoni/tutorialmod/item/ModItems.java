package net.adamoni.tutorialmod.item;

import net.adamoni.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item PINK_GARNET = registerItem("pink_garnet");
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet");


    private static Item registerItem(String name) {
        Item.Settings itemSettings = new Item.Settings();
        Identifier id = Identifier.of(TutorialMod.MOD_ID, name);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);
        Item.Settings settings = itemSettings.registryKey(key);
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.MOD_ID, name), new Item(settings));
    }

    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering Mod Items for" + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
           fabricItemGroupEntries.add(PINK_GARNET);
           fabricItemGroupEntries.add(RAW_PINK_GARNET);
        });
    }
}