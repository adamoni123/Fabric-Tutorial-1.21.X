package net.adamoni.tutorialmod.block;

import net.adamoni.tutorialmod.TutorialMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModBlocks {

    private static Item registerBlockItem(String name, Block block) {
        Block.Settings blockSettings = new Block.Settings();
        Identifier id = Identifier.of(TutorialMod.MOD_ID, name);
        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, id);
        Block.Settings settings = blockSettings.registryKey(key);
        return Registry.register(Registries.BLOCK, Identifier.of(TutorialMod.MOD_ID, name), new block(settings));

    }

    public static void registerModBlocks() {
        TutorialMod.LOGGER.info("Registering Mod Blocks for " + TutorialMod.MOD_ID);
    }
}
