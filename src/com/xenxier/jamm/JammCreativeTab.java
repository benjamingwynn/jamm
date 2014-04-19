package com.xenxier.jamm;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class JammCreativeTab {
    public static final CreativeTabs JAMM_TAB = new CreativeTabs(JammID.mod.MODID) {
        @Override
        public Item getTabIconItem() {
        	return Items.diamond_sword;
        }

        @Override
        @SideOnly(Side.CLIENT)
        public String getTranslatedTabLabel()
        {
            return "Just Another Minecraft Mod";
        }
    };
}