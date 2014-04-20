package com.xenxier.jamm;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class JammBlockCommon extends Block { 
	
	public JammBlockCommon() {
        this(Material.rock);
    }

    public JammBlockCommon(Material material) {
        super(material);
        this.setCreativeTab(JammCreativeTab.JAMM_TAB);
    }
}
