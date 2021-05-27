package com.shnupbups.oxidizelib.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.HoneycombItem;

import com.shnupbups.oxidizelib.OxidizeLib;

import java.util.Optional;

@Mixin(HoneycombItem.class)
public class HoneycombItemMixin {

	/**
	 * @author Shnupbups
	 */
	@Overwrite
	public static Optional<BlockState> getWaxedState(BlockState state) {
		return OxidizeLib.getWaxedState(state);
	}
}