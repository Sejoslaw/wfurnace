package com.github.sejoslaw;

import com.github.sejoslaw.blocks.BlockWFurnace;
import com.github.sejoslaw.items.ItemWPickaxe;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;

/**
 * Holds all the Blocks of the mod.
 * 
 * @author Sejoslaw - https://github.com/Sejoslaw
 */
public class WFurnaceRegistry {
	// Blocks
	public static final Block WFURNACE;

	// Items
	public static final Item WPICKAXE;

	static {
		// Blocks
		WFURNACE = new BlockWFurnace(Block.Properties.create(Material.ANVIL));
		WFURNACE.setRegistryName(WFurnace.MODID, WFurnace.MODID);

		// Items
		WPICKAXE = new ItemWPickaxe(new Item.Properties().group(WFurnace.TAB));
		WPICKAXE.setRegistryName(WFurnace.MODID, "wpickaxe");
	}

	public static void registerBlocks(Register<Block> event) {
		event.getRegistry().registerAll(WFURNACE);
	}

	public static void registerItems(Register<Item> event) {
		// ItemBlocks
		event.getRegistry().register(new ItemBlock(WFURNACE, new Item.Properties().group(WFurnace.TAB))
				.setRegistryName(WFurnace.MODID, WFurnace.MODID));

		// Items
		event.getRegistry().registerAll(WPICKAXE);
	}
}
