package com.shnupbups.oxidizelib.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import net.minecraft.block.Block;
import net.minecraft.block.Oxidizable;

import com.shnupbups.oxidizelib.OxidizeLib;

import java.util.Optional;

@Mixin(Oxidizable.class)
public interface OxidizableMixin {
	/**
	 * @author Shnupbups
	 * @reason thonkjang
	 */
	@Overwrite
	static Optional<Block> getDecreasedOxidationBlock(Block block) {
		return OxidizeLib.getDecreasedOxidizationBlock(block);
	}

	/**
	 * @author Shnupbups
	 * @reason thonkjang
	 */
	@Overwrite
	static Optional<Block> getIncreasedOxidationBlock(Block block) {
		return OxidizeLib.getIncreasedOxidizationBlock(block);
	}

	/**
	 * @author Shnupbups
	 * @reason thonkjang
	 */
	@Overwrite
	static Block getUnaffectedOxidationBlock(Block block) {
		return OxidizeLib.getUnaffectedOxidizationBlock(block);
	}
}
