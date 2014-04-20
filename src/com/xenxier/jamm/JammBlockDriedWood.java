package com.xenxier.jamm;

import net.minecraft.block.material.Material;

import com.xenxier.jamm.JammID.BlockName;
import com.xenxier.jamm.JammID.mod;

public class JammBlockDriedWood extends JammBlockCommon {
	public JammBlockDriedWood() {
		super(Material.wood);
		this.setHardness(0.8f);
		this.setBlockName(BlockName.DRIEDWOOD);
        this.setStepSound(soundTypeWood);
        setBlockTextureName(mod.MODID + ":" + BlockName.DRIEDWOOD);
	}
}
