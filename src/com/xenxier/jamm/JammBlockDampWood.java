package com.xenxier.jamm;

import com.xenxier.jamm.JammID.BlockName;
import com.xenxier.jamm.JammID.mod;

import net.minecraft.block.material.Material;

public class JammBlockDampWood extends JammBlockCommon {
	public JammBlockDampWood() {
		super(Material.wood);
		this.setHardness(1.2f);
		this.setBlockName(BlockName.DAMPWOOD);
        this.setStepSound(soundTypeWood);
        setBlockTextureName(mod.MODID + ":" + BlockName.DAMPWOOD);
	}
}