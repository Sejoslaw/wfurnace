package com.github.sejoslaw;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;

/**
 * Holds all the Recipies of the mod.
 * 
 * @author @author Sejoslaw - https://github.com/Sejoslaw
 */
public class WFurnaceRecipies {
	public static void registerRecipies() {
		CraftingHelper.register(new ResourceLocation(WFurnace.MODID, "wfurnace"), json -> () -> true);
	}
}
