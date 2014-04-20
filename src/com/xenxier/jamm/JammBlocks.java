package com.xenxier.jamm;

import com.xenxier.jamm.JammID.BlockName;
import cpw.mods.fml.common.registry.GameRegistry;

public class JammBlocks {
	public static final JammBlockCommon test_block = new JammBlockTestBlock();
	public static final JammBlockCommon damp_wood = new JammBlockDampWood();
	public static final JammBlockCommon dried_wood = new JammBlockDriedWood();
	public static final JammBlockCommon compressed_wood = new JammBlockCompressedWood();
	public static final JammBlockCommon stone_wood = new JammBlockStoneWood();

	public static void loadJammBlocks() {
		JammLog.log('I', "Registering blocks...");
		GameRegistry.registerBlock(test_block, BlockName.TESTBLOCK);
		GameRegistry.registerBlock(damp_wood, BlockName.DAMPWOOD);
		GameRegistry.registerBlock(dried_wood, BlockName.DRIEDWOOD);
		GameRegistry.registerBlock(compressed_wood, BlockName.COMPRESSEDWOOD);
		GameRegistry.registerBlock(stone_wood, BlockName.STONEWOOD);
	}
}