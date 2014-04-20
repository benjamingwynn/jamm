package com.xenxier.jamm;

import com.xenxier.jamm.JammID.BlockName;
import com.xenxier.jamm.JammID.mod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class JammBlockDampWood extends JammBlockCommon {
	public JammBlockDampWood() {
		super(Material.wood);
		this.setHardness(1.2f);
		this.setBlockName(BlockName.DAMPWOOD);
        this.setStepSound(soundTypeWood);
	}
	
	@SideOnly(Side.CLIENT)
	protected IIcon blockIcon;
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister p_149651_1_) {
		blockIcon = p_149651_1_.registerIcon(mod.MODID + ":" + this.getUnlocalizedName().substring(5));
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
		return blockIcon;
	}
}