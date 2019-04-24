package com.github.sejoslaw.blocks;

import net.minecraft.block.BlockFurnace;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

/**
 * Angel / Devil Furnace.
 * 
 * @author @author Sejoslaw - https://github.com/Sejoslaw
 */
public class BlockWFurnace extends BlockFurnace {
	public BlockWFurnace(Properties builder) {
		super(builder);
	}

	@Override
	public TileEntity createNewTileEntity(IBlockReader worldIn) {
		return null;
	}
}
