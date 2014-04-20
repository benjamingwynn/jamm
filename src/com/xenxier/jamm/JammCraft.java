package com.xenxier.jamm;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class JammCraft {

	public static void loadCraftingRecipes() {
		JammLog.log('I', "Registering Crafting Recipes...");
		GameRegistry.addShapedRecipe(new ItemStack(JammBlocks.damp_wood), 8, new Object[] {
	    	"AAA",
	    	"ABA",
	    	"AAA",
	    	'A', Blocks.planks, 'B', Items.water_bucket });
	}

}
