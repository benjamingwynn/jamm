package com.xenxier.jamm;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = JammID.mod.MODID, version = JammID.mod.VERSION)

public class JammMain {
	
	@EventHandler
	public void init(FMLPreInitializationEvent event) {
		startLoad();
		JammBlocks.loadJammBlocks();
		JammCrafting.loadCraftingRecipes();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
	}
	
	@EventHandler
	public void init(FMLPostInitializationEvent event) {
		endLoad();
	}
	
	void startLoad() {
		JammLog.log('I', "Loading JAMM...");
	}
	
	void endLoad() {
		JammLog.log('I', "Just Another Minecraft Mod - Version " + JammID.mod.VERSION);
		JammLog.log('I', "Created by Benjamin Gwynn (Xenxier) - http://xenxier.tk");
	}
}
