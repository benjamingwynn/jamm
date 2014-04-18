package com.xenxier.jamm;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = JammMain.MODID, version = JammMain.VERSION)

public class JammMain {
	public static final String MODID = "JAMM";
	public static final String VERSION = "0.1";
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		startLoad();
		endLoad();
	}
	
	void startLoad() {
		JammLog.log('I', "Loading JAMM...");
	}
	
	void endLoad() {
		JammLog.log('I', "Just Another Minecraft Mod - Version " + VERSION);
		JammLog.log('I', "Created by Benjamin Gwynn (Xenxier) - http://xenxier.tk");
	}
}
