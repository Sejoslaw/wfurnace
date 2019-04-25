package com.github.sejoslaw.items;

import com.github.sejoslaw.items.tiers.GodTierTool;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
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
		this.efficiency = 10f;
	}

	public float getDestroySpeed(ItemStack stack, IBlockState state) {
		return 10f;
	}

	public boolean onBlockDestroyed(ItemStack stack, World world, IBlockState state, BlockPos pos,
			EntityLivingBase entity) {
		return true;
	}

	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
		return true;
	}

	public void onCreated(ItemStack stack, World world, EntityPlayer player) {
		stack.addEnchantment(Enchantments.EFFICIENCY, 5);
		stack.addEnchantment(Enchantments.FIRE_ASPECT, 2);
		stack.addEnchantment(Enchantments.FORTUNE, 3);
		stack.addEnchantment(Enchantments.INFINITY, 1);
		stack.addEnchantment(Enchantments.KNOCKBACK, 2);
		stack.addEnchantment(Enchantments.LOOTING, 3);
		stack.addEnchantment(Enchantments.POWER, 5);
		stack.addEnchantment(Enchantments.SHARPNESS, 5);
		stack.addEnchantment(Enchantments.SMITE, 5);
		stack.addEnchantment(Enchantments.UNBREAKING, 3);
		stack.addEnchantment(Enchantments.MENDING, 1);
	}
}
