package greymerk.roguelike.treasure.loot.provider;

import greymerk.roguelike.treasure.loot.Equipment;
import greymerk.roguelike.treasure.loot.Quality;
import net.minecraft.item.ItemStack;

import java.util.Random;

import net.minecraft.item.ItemStack;

public class ItemSmithy extends ItemBase{

	public ItemSmithy(int weight, int level) {
		super(weight, level);
	}

	@Override
	public ItemStack getLootItem(Random rand, int level) {
		ItemStack override = getChestGenItem("smithy", level, rand);
		if (override != null) {
			return override;
		}
		
		return ItemSpecialty.getRandomItem(Equipment.SWORD, rand, Quality.IRON);
	}
	
	

}
