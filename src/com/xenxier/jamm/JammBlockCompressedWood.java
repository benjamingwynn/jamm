package com.xenxier.jamm;

import net.minecraft.block.material.Material;

import com.xenxier.jamm.JammID.BlockName;
import com.xenxier.jamm.JammID.mod;

public class JammBlockCompressedWood extends JammBlockCommon {
	public JammBlockCompressedWood() {
		super(Material.wood);
		this.setHardness(5.0f); // May need tweaking
		this.setBlockName(BlockName.COMPRESSEDWOOD);
        this.setStepSound(soundTypeWood);
        setBlockTextureName(mod.MODID + ":" + BlockName.COMPRESSEDWOOD);
	}
}
