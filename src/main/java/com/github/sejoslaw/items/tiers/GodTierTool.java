package com.github.sejoslaw.items.tiers;

import net.minecraft.init.Items;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;

/**
 * God Tier Tool.
 * 
 * @author Sejoslaw - https://github.com/Sejoslaw
 */
public class GodTierTool implements IItemTier {
	public int getMaxUses() {
		return Integer.MAX_VALUE - 1;
	}

	public float getEfficiency() {
		return 1000000f;
	}

	public float getAttackDamage() {
		return 1000000f;
	}

	public int getHarvestLevel() {
		return 1000000;
	}

	public int getEnchantability() {
		return 1000000;
	}

	public Ingredient getRepairMaterial() {
		return Ingredient.fromStacks(new ItemStack(Items.DIAMOND));
	}
}
