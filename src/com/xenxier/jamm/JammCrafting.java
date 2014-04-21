package com.xenxier.jamm;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class JammCrafting {

	public static void loadCraftingRecipes() {
		
		JammLog.log('I', "Registering Crafting Recipes...");
		
		GameRegistry.addRecipe(new ItemStack(JammBlocks.damp_wood, 8), new Object[] {
	    	"AAA",
	    	"ABA",
	    	"AAA",
	    	'A', Blocks.planks, 'B', Items.water_bucket });
		
		GameRegistry.addRecipe(new ItemStack(JammBlocks.compressed_wood, 1), new Object[] {
	    	"AAA",
	    	"AAA",
	    	"AAA",
	    	'A', JammBlocks.dried_wood });
		
		GameRegistry.addRecipe(new ItemStack(JammBlocks.stone_wood, 3), new Object[] {
	    	"ABA",
	    	"ABA",
	    	"ABA",
	    	'A', JammBlocks.compressed_wood, 'B', Blocks.stone });
		
		JammLog.log('I', "Registering Furnace Recipes...");
		
		// TODO: Furnace recipe Damp Wood -> Dried Wood
	}
}
