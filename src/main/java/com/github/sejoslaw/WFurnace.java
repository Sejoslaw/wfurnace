package com.github.sejoslaw;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

// The value here should match an entry in the META-INF/mods.toml file
/**
 * Core mod class.
 * 
 * @author @author Sejoslaw - https://github.com/Sejoslaw
 */
@Mod(WFurnace.MODID)
public class WFurnace {
	public static final String MODID = "wfurnace";
	public static final ItemGroup TAB = new ItemGroup(MODID) {
		@Override
		public ItemStack createIcon() {
			return new ItemStack(WFurnaceRegistry.WFURNACE);
		}
	};

	private static final Logger LOGGER = LogManager.getLogger();

	public WFurnace() {
//		ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, WFurnaceConfig.SPEC, "WFurnace.toml");
		WFurnaceRecipies.registerRecipies();
		MinecraftForge.EVENT_BUS.register(this);
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class RegistryEvents {
		@SubscribeEvent
		public static void onItemRegistry(RegistryEvent.Register<Item> event) {
			LOGGER.info("Registering WFurnace items...");
			WFurnaceRegistry.registerItems(event);
			LOGGER.info("WFurnace items registered.");
		}

		@SubscribeEvent
		public static void onBlockRegistry(RegistryEvent.Register<Block> event) {
			LOGGER.info("Registering WFurnace blocks...");
			WFurnaceRegistry.registerBlocks(event);
			LOGGER.info("WFurnace blocks registered.");
		}
	}
}
