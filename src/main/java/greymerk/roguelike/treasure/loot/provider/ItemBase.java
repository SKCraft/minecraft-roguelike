package greymerk.roguelike.treasure.loot.provider;

import greymerk.roguelike.util.IWeighted;

import java.util.Random;

import net.minecraft.item.ItemStack;
import net.minecraftforge.common.ChestGenHooks;

public abstract class ItemBase implements IWeighted<ItemStack> {

	private int weight;
	int level;
	
	public ItemBase(int weight, int level){
		this.weight = weight;
		this.level = level;
	}
	
	public abstract ItemStack getLootItem(Random rand, int level);

	@Override
	public int getWeight() {
		return weight;
	}
	
	@Override
	public ItemStack get(Random rand) {
		return getLootItem(rand, level);
	}

	public static ItemStack getChestGenItem(String category, int level, Random rand) {
		ChestGenHooks levelInfo = ChestGenHooks.getInfo("roguelike_" + category + "_" + level);
		ChestGenHooks defaultInfo = ChestGenHooks.getInfo("roguelike_" + category);

		if (levelInfo.contents.size() > 0) {
			return levelInfo.getOneItem(rand);
		} else if (defaultInfo.contents.size() > 0) {
			return defaultInfo.getOneItem(rand);
		} else {
			return null;
		}
	}
}
