package com.xenxier.jamm;

import com.xenxier.jamm.JammID.BlockName;
import com.xenxier.jamm.JammID.mod;

import net.minecraft.block.material.Material;

public class JammBlockTestBlock extends JammBlockCommon {
	public JammBlockTestBlock() {
		super(Material.wood);
		this.setHardness(2.0f);
		this.setBlockName(BlockName.TESTBLOCK);
        this.setStepSound(soundTypeWood);
        setBlockTextureName(mod.MODID + ":" + BlockName.TESTBLOCK);
	}
}