package com.xenxier.jamm;

import com.xenxier.jamm.JammID.BlockName;
import cpw.mods.fml.common.registry.GameRegistry;

public class JammBlocks {
	public static final JammBlockCommon test_block = new JammBlockTestBlock();
	public static final JammBlockCommon damp_wood = new JammBlockDampWood();

	public static void loadJammBlocks() {
		JammLog.log('I', "Registering blocks...");
		GameRegistry.registerBlock(test_block, BlockName.TESTBLOCK);
		GameRegistry.registerBlock(damp_wood, BlockName.DAMPWOOD);
	}
}