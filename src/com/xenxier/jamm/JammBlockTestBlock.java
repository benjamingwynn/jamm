package com.xenxier.jamm;

import com.xenxier.jamm.JammID.BlockName;
import com.xenxier.jamm.JammID.mod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class JammBlockTestBlock extends JammBlockCommon {
	public JammBlockTestBlock() {
		super(Material.wood);
		this.setHardness(2.0f);
		this.setBlockName(BlockName.TESTBLOCK);
        this.setStepSound(soundTypeWood);
        setBlockTextureName(mod.MODID + ":" + BlockName.TESTBLOCK);
	}
}