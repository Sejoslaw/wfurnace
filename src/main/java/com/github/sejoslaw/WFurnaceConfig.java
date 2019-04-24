package com.github.sejoslaw;

import org.apache.commons.lang3.tuple.Pair;

import net.minecraftforge.common.ForgeConfigSpec;

/**
 * Holds the data about mod configuration file.
 * 
 * @author @author Sejoslaw - https://github.com/Sejoslaw
 */
public class WFurnaceConfig {
	public static class CommonConfig {

		// Angel Furnace state data

		// Devil Furnace state data

		CommonConfig(ForgeConfigSpec.Builder builder) {
			// TODO:
		}
	}

	public static final ForgeConfigSpec SPEC;
	public static final CommonConfig CONFIG;

	static {
		final Pair<CommonConfig, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(CommonConfig::new);
		SPEC = specPair.getRight();
		CONFIG = specPair.getLeft();
	}
}
