package greymerk.roguelike.treasure.loot.provider;

import greymerk.roguelike.treasure.loot.Potion;
import greymerk.roguelike.treasure.loot.PotionMixture;

import java.util.Random;

import net.minecraft.item.ItemStack;

public class ItemPotion extends ItemBase{

	public ItemPotion(int weight, int level) {
		super(weight, level);
	}

	@Override
	public ItemStack getLootItem(Random rand, int level) {
		ItemStack override = getChestGenItem("potion", level, rand);
		if (override != null) {
			return override;
		}

		if(level > 2) return PotionMixture.getPotion(rand, PotionMixture.VILE);
		
		if(rand.nextInt(10) == 0) return PotionMixture.getBooze(rand);
		if(rand.nextBoolean()) return PotionMixture.getPotion(rand, PotionMixture.LAUDANUM);
		return Potion.getRandom(rand);

	}

}
