package greymerk.roguelike.treasure.loot.provider;

import java.util.Random;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class ItemBlock extends ItemBase{
	
	public ItemBlock(int weight, int level) {
		super(weight, level);
	}

	@Override
	public ItemStack getLootItem(Random rand, int level) {
		return getRandom(rand, level);
	}
	
	public static ItemStack getRandom(Random rand, int level){
		
		if(level > 0 && rand.nextInt(500) == 0){
			if(rand.nextBoolean()){
				return ItemNovelty.getItem(ItemNovelty.MMILLSS);
			} else {
				return ItemNovelty.getItem(ItemNovelty.QUANTUMLEAP);
			}
		}
		
		return pickBlocks(rand, level);
	}
	
	private static ItemStack pickBlocks(Random rand, int level) {
		ItemStack override = getChestGenItem("block", level, rand);
		if (override != null) {
			return override;
		}

		int size = rand.nextInt(24) + 8;
		
		switch(level){
		case 0:
		case 1:
			if(rand.nextInt(10) == 0) return new ItemStack(Blocks.wool, size / 2, rand.nextInt(16));
			if(rand.nextInt(10) == 0) return new ItemStack(Blocks.log, size / 2, rand.nextInt(4));
			
			switch(rand.nextInt(3)){
			case 0: return new ItemStack(Blocks.stonebrick, size, rand.nextInt(3));
			case 1: return new ItemStack(Blocks.planks, size, rand.nextInt(4));
			case 2: return new ItemStack(Blocks.dirt, size);
			}
		case 2:
			if(rand.nextInt(10) == 0) return new ItemStack(Blocks.brick_block, size, rand.nextInt(16));
			
			switch(rand.nextInt(3)){
			case 0: return new ItemStack(Blocks.stonebrick, size, rand.nextInt(3));
			case 1: return new ItemStack(Blocks.gravel, size, rand.nextInt(4));
			case 2: return new ItemStack(Blocks.stained_hardened_clay, size / 2, rand.nextInt(16));
			}
		case 3:
			switch(rand.nextInt(5)){
			case 0: return new ItemStack(Blocks.mossy_cobblestone, size);
			case 1: return new ItemStack(Blocks.cobblestone, size);
			case 2: return new ItemStack(Blocks.gravel, size / 2);
			case 3: return new ItemStack(Blocks.clay, size / 2);
			case 4: return new ItemStack(Blocks.stone, size);
			}
		case 4:
			if(rand.nextInt(10) == 0) return new ItemStack(Blocks.glowstone, size / 4);
			if(rand.nextInt(10) == 0) return new ItemStack(Blocks.quartz_block, size / 4);
			
			switch(rand.nextInt(4)){
			case 0: return new ItemStack(Blocks.netherrack, size);
			case 1: return new ItemStack(Blocks.nether_brick, size);
			case 2: return new ItemStack(Blocks.soul_sand, size / 2);
			case 3: return new ItemStack(Blocks.obsidian, size / 2);
			}
		default: return new ItemStack(Blocks.dirt, size);
		}
		
		
	}



}
