package com.github.sejoslaw.items;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * WPickaxe
 * 
 * @author Sejoslaw - https://github.com/Sejoslaw
 */
public class ItemWPickaxe extends ItemPickaxe {
	public ItemWPickaxe(Properties builder) {
		super(new GodTierTool(), Integer.MAX_VALUE / 2, Integer.MAX_VALUE / 2, builder);
		this.efficiency = 1000f;
	}

	public float getDestroySpeed(ItemStack stack, IBlockState state) {
		return 1000f;
	}

	public boolean onBlockDestroyed(ItemStack stack, World world, IBlockState state, BlockPos pos,
			EntityLivingBase entity) {
		return true;
	}

	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
		return true;
	}

	public void onCreated(ItemStack stack, World world, EntityPlayer player) {
		stack.addEnchantment(Enchantments.EFFICIENCY, Byte.MAX_VALUE);
		stack.addEnchantment(Enchantments.FIRE_ASPECT, Byte.MAX_VALUE);
		stack.addEnchantment(Enchantments.FORTUNE, Byte.MAX_VALUE);
		stack.addEnchantment(Enchantments.INFINITY, Byte.MAX_VALUE);
		stack.addEnchantment(Enchantments.KNOCKBACK, Byte.MAX_VALUE);
		stack.addEnchantment(Enchantments.LOOTING, Byte.MAX_VALUE);
		stack.addEnchantment(Enchantments.POWER, Byte.MAX_VALUE);
		stack.addEnchantment(Enchantments.SHARPNESS, Byte.MAX_VALUE);
		stack.addEnchantment(Enchantments.SMITE, Byte.MAX_VALUE);
		stack.addEnchantment(Enchantments.UNBREAKING, Byte.MAX_VALUE);
		stack.addEnchantment(Enchantments.MENDING, Byte.MAX_VALUE);
	}

	public static class GodTierTool implements IItemTier {
		public int getMaxUses() {
			return Integer.MAX_VALUE / 2;
		}

		public float getEfficiency() {
			return 1000f;
		}

		public float getAttackDamage() {
			return 1000f;
		}

		public int getHarvestLevel() {
			return Integer.MAX_VALUE / 2;
		}

		public int getEnchantability() {
			return Integer.MAX_VALUE / 2;
		}

		public Ingredient getRepairMaterial() {
			return Ingredient.fromStacks(new ItemStack(Items.DIAMOND));
		}
	}
}
