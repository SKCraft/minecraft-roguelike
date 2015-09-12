package greymerk.roguelike.treasure.loot.provider;

import greymerk.roguelike.treasure.loot.Record;
import net.minecraft.item.ItemStack;

import java.util.Random;

import net.minecraft.item.ItemStack;

public class ItemRecord extends ItemBase{

	public ItemRecord(int weight, int level) {
		super(weight, level);
	}

	@Override
	public ItemStack getLootItem(Random rand, int level) {
		ItemStack override = getChestGenItem("record", level, rand);
		if (override != null) {
			return override;
		}
		return Record.getRandomRecord(rand);
	}
	
	

}
