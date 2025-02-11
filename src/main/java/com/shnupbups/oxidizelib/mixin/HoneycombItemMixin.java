package com.shnupbups.oxidizelib.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import net.minecraft.block.BlockState;
import net.minecraft.item.HoneycombItem;

import com.shnupbups.oxidizelib.OxidizeLib;

import java.util.Optional;

@Mixin(HoneycombItem.class)
public class HoneycombItemMixin {

	/**
	 * @author Shnupbups
	 * @reason thonkjang
	 */
	@Overwrite
	public static Optional<BlockState> getWaxedState(BlockState state) {
		return OxidizeLib.getWaxedState(state);
	}
}
