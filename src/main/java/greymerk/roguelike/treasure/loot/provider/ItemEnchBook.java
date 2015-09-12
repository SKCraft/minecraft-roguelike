package greymerk.roguelike.treasure.loot.provider;

import greymerk.roguelike.treasure.loot.Loot;

import java.util.Random;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ItemEnchBook extends ItemBase{

	public ItemEnchBook(int weight, int level) {
		super(weight, level);
	}

	@Override
	public ItemStack getLootItem(Random rand, int level) {
		ItemStack override = getChestGenItem("enchBook", level, rand);
		if (override != null) {
			return override;
		}

		ItemStack book = new ItemStack(Items.book);
		Loot.enchantItem(book, rand, Loot.getEnchantLevel(rand, level));
		return book;
	}

}
