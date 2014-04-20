package com.xenxier.jamm;

import net.minecraft.block.material.Material;

import com.xenxier.jamm.JammID.BlockName;
import com.xenxier.jamm.JammID.mod;

// Stone Wood is a work-in-progress.

public class JammBlockStoneWood extends JammBlockCommon {
	public JammBlockStoneWood() {
		super(Material.ground); // May need tweaking
		this.setHardness(6.0f); // May need tweaking
		this.setBlockName(BlockName.STONEWOOD);
        this.setStepSound(soundTypeWood);
        setBlockTextureName(mod.MODID + ":" + BlockName.STONEWOOD);
	}
}
