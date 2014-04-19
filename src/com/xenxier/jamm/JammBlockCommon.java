package com.xenxier.jamm;

import com.xenxier.jamm.JammID.BlockName;

import cpw.mods.fml.common.registry.GameRegistry;
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

	public static void loadJammBlocks() {
		JammLog.log('I', "Registering blocks...");
		GameRegistry.registerBlock(new JammBlockTestBlock(), BlockName.TESTBLOCK);
	}
}