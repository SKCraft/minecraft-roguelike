package greymerk.roguelike.treasure.loot.provider;


import greymerk.roguelike.treasure.loot.Loot;
import greymerk.roguelike.util.TextFormat;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public enum ItemNovelty {

	GREYMERK, ANDERZEL, NEBRISCROWN, NEBRISSWORD, ZISTEAUPANTS, ZISTEAUSIGN, AVIDYA, ASHLEA, KURT, AMLP,
	CLEO, ENIKOSWORD, ENIKOBOW, BDOUBLEO, GUUDE, RLEAHY, ETHO, BAJ, DOCM, GINGER, VECHS,
	NOTCH, JOHNNYRAGGOT, QUANTUMLEAP, MCGAMER, GENERIKB, PAUSE, PAULSOARESJR, FOURLES,
	DINNERBONE, GRIM, MMILLSS, MILLBEE, VINTAGEBEEF, VALANDRAH;

	private static final Random rand = new Random();
	public static final Map<String, ItemNovelty> names;
	static {
		names = new HashMap<String, ItemNovelty>();
		names.put("greymerk", ItemNovelty.GREYMERK);
		names.put("anderzel", ItemNovelty.ANDERZEL);
		names.put("nebriscrown", ItemNovelty.NEBRISCROWN);
		names.put("nebrissword", ItemNovelty.NEBRISSWORD);
		names.put("zisteaupants", ItemNovelty.ZISTEAUPANTS);
		names.put("zisteausign", ItemNovelty.ZISTEAUSIGN);
		names.put("avidya", ItemNovelty.AVIDYA);
		names.put("ashlea", ItemNovelty.ASHLEA);
		names.put("kurt", ItemNovelty.KURT);
		names.put("amlp", ItemNovelty.AMLP);
		names.put("cleo", ItemNovelty.CLEO);
		names.put("enikosword", ItemNovelty.ENIKOSWORD);
		names.put("enikobow", ItemNovelty.ENIKOBOW);
		names.put("bdoubleo", ItemNovelty.BDOUBLEO);
		names.put("guude", ItemNovelty.GUUDE);
		names.put("rleahy", ItemNovelty.RLEAHY);
		names.put("etho", ItemNovelty.ETHO);
		names.put("baj", ItemNovelty.BAJ);
		names.put("docm", ItemNovelty.DOCM);
		names.put("ginger", ItemNovelty.GINGER);
		names.put("vechs", ItemNovelty.VECHS);
		names.put("notch", ItemNovelty.NOTCH);
		names.put("johnnyraggot", ItemNovelty.JOHNNYRAGGOT);
		names.put("quantumleap", ItemNovelty.QUANTUMLEAP);
		names.put("mcgamer", ItemNovelty.MCGAMER);
		names.put("generikb", ItemNovelty.GENERIKB);
		names.put("pause", ItemNovelty.PAUSE);
		names.put("paulsoaresjr", ItemNovelty.PAULSOARESJR);
		names.put("fourles", ItemNovelty.FOURLES);
		names.put("dinnerbone", ItemNovelty.DINNERBONE);
		names.put("grim", ItemNovelty.GRIM);
		names.put("mmillss", ItemNovelty.MMILLSS);
		names.put("millbee", ItemNovelty.MILLBEE);
		names.put("vintagebeef", ItemNovelty.VINTAGEBEEF);
		names.put("valandrah", ItemNovelty.VALANDRAH);
	};
		
	public static ItemStack getItemByName(String name){
		return getItem(names.get(name));
	}
	
	public static ItemStack getItem(ItemNovelty choice){
		ItemStack override = ItemBase.getChestGenItem("novelty", 4, rand);
		if (override != null) {
			return override;
		}

		ItemStack item;
		
		switch(choice){
		
		case GREYMERK:
			item = new ItemStack(Items.iron_axe);
			Loot.setItemName(item, "Greymerk's Hatchet", null);
			Loot.setItemLore(item, "Pointlessly sharp", TextFormat.DARKGREEN);
			item.addEnchantment(Enchantment.sharpness, 3);
			item.addEnchantment(Enchantment.knockback, 1);
			item.addEnchantment(Enchantment.unbreaking, 2);
			return item;
		case ANDERZEL:
			item = new ItemStack(Items.chainmail_chestplate);
			Loot.setItemName(item, "AnderZEL's Viking Hauberk", null);
			Loot.setItemLore(item, "Protection against sneaky ninja", TextFormat.DARKGREEN);
			item.addEnchantment(Enchantment.projectileProtection, 4);
			item.addEnchantment(Enchantment.unbreaking, 3);
			return item;
		case NEBRISCROWN:
			item = new ItemStack(Items.golden_helmet);
			Loot.setItemName(item, "Nebrian Crown of Justice", null);
			Loot.setItemLore(item, "Adorned with precious gemstones", TextFormat.DARKGREEN);
			item.addEnchantment(Enchantment.protection, 4);
			item.addEnchantment(Enchantment.unbreaking, 3);
			return item;
		case NEBRISSWORD:
			item = new ItemStack(Items.diamond_sword);
			Loot.setItemName(item, "Nebrian Null Pointer", null);
			Loot.setItemLore(item, "Exceptional", TextFormat.DARKGREEN);
			item.addEnchantment(Enchantment.sharpness, 5);
			item.addEnchantment(Enchantment.knockback, 2);
			item.addEnchantment(Enchantment.unbreaking, 3);
			return item;
		case ZISTEAUPANTS:
			item = new ItemStack(Items.leather_leggings);
			Loot.setItemName(item, "Zisteau's Man Pants", null);
			Loot.setItemLore(item, "Yessss, Manpants!", TextFormat.DARKGREEN);
			item.addEnchantment(Enchantment.fireProtection, 4);
			item.addEnchantment(Enchantment.unbreaking, 3);
			ItemArmour.dyeArmor(item, 250, 128, 114);
			return item;
		case ZISTEAUSIGN:
			item = new ItemStack(Items.sign);
			Loot.setItemName(item, "Zistonian Battle Sign", TextFormat.DARKPURPLE);
			Loot.setItemLore(item, "\"That's what you get!\"", TextFormat.DARKGREEN);
			item.addEnchantment(Enchantment.sharpness, 1);
			item.addEnchantment(Enchantment.knockback, 2);
			item.addEnchantment(Enchantment.fireAspect, 1);
			return item;
		case AVIDYA:
			item = new ItemStack(Items.milk_bucket);
			Loot.setItemName(item, "Avidya's white russian", TextFormat.DARKPURPLE);
			Loot.setItemLore(item, "The dude's favourite", TextFormat.DARKGREEN);
			item.addEnchantment(Enchantment.baneOfArthropods, 4);
			item.addEnchantment(Enchantment.knockback, 1);
			item.addEnchantment(Enchantment.fireAspect, 1);
			return item;
		case ASHLEA:
			item = new ItemStack(Items.cookie);
			Loot.setItemName(item, "Ashlea's Oatmeal Cookie", TextFormat.DARKPURPLE);
			Loot.setItemLore(item, "Perfect for elevensies", TextFormat.DARKGREEN);
			item.addEnchantment(Enchantment.sharpness, 2);
			item.addEnchantment(Enchantment.knockback, 1);
			return item;
		case KURT:
			item = new ItemStack(Items.leather_boots);
			Loot.setItemName(item, "Kurt's Farland Travellers", null);
			Loot.setItemLore(item, "Indeed!", TextFormat.DARKGREEN);
			item.addEnchantment(Enchantment.protection, 3);
			item.addEnchantment(Enchantment.featherFalling, 2);
			item.addEnchantment(Enchantment.unbreaking, 3);
			ItemArmour.dyeArmor(item, 165, 42, 42);
			return item;
		case AMLP:
			item = new ItemStack(Items.shears);
			Loot.setItemName(item, "Amlpian Lascerator", null);
			Loot.setItemLore(item, "The wool collector", TextFormat.DARKGREEN);
			item.addEnchantment(Enchantment.sharpness, 3);
			item.addEnchantment(Enchantment.knockback, 2);
			item.addEnchantment(Enchantment.fireAspect, 1);
			return item;
		case CLEO:
			item = new ItemStack(Items.fish);
			Loot.setItemName(item, "Cleophian Digging Feesh", TextFormat.DARKPURPLE);
			Loot.setItemLore(item, "Feesh are not efeeshent for digging", TextFormat.DARKGREEN);
			item.addEnchantment(Enchantment.efficiency, 10);
			item.addEnchantment(Enchantment.knockback, 5);
			item.addEnchantment(Enchantment.fortune, 5);
			item.addEnchantment(Enchantment.unbreaking, 10);
			return item;
		case BDOUBLEO:
			item = new ItemStack(Items.diamond_shovel);
			Loot.setItemName(item, "Bdoublian Dig Job", null);
			Loot.setItemLore(item, "Recovered from hell's blazes", TextFormat.DARKGREEN);
			item.addEnchantment(Enchantment.efficiency, 5);
			item.addEnchantment(Enchantment.unbreaking, 3);
			return item;
		case GUUDE:
			item = new ItemStack(Items.record_13);
			Loot.setItemName(item, "Boulderfistian Golden Record", TextFormat.DARKPURPLE);
			Loot.setItemLore(item, "\"You're Watching Guude Boulderfist...\"", TextFormat.DARKGREEN);
			item.addEnchantment(Enchantment.sharpness, 3);
			item.addEnchantment(Enchantment.knockback, 1);
			item.addEnchantment(Enchantment.blastProtection, 3);
			return item;
		case RLEAHY:
			item = new ItemStack(Items.bread);
			Loot.setItemName(item, "Rleahian battle sub", TextFormat.DARKPURPLE);
			Loot.setItemLore(item, "With extra pastrami", TextFormat.DARKGREEN);
			item.addEnchantment(Enchantment.sharpness, 2);
			item.addEnchantment(Enchantment.knockback, 1);
			item.addEnchantment(Enchantment.fireAspect, 2);
			return item;
		case ETHO:
			item = new ItemStack(Items.wooden_pickaxe);
			Loot.setItemName(item, "Ethonian Pick", null);
			Loot.setItemLore(item, "The original", TextFormat.DARKGREEN);
			item.addEnchantment(Enchantment.efficiency, 5);
			item.addEnchantment(Enchantment.unbreaking, 3);
			return item;
		case ENIKOBOW:
			item = new ItemStack(Items.bow);
			Loot.setItemName(item, "Eniko's String Theory", null);
			Loot.setItemLore(item, "For Science!", TextFormat.DARKGREEN);
			item.addEnchantment(Enchantment.power, 5);
			item.addEnchantment(Enchantment.knockback, 2);
			item.addEnchantment(Enchantment.infinity, 1);
			item.addEnchantment(Enchantment.unbreaking, 3);
			return item;
		case ENIKOSWORD:
			item = new ItemStack(Items.diamond_sword);
			Loot.setItemName(item, "Eniko's Earring", null);
			Loot.setItemLore(item, "\"She do the loot take boogie\"", TextFormat.DARKGREEN);
			item.addEnchantment(Enchantment.sharpness, 5);
			item.addEnchantment(Enchantment.looting, 3);
			item.addEnchantment(Enchantment.unbreaking, 3);
			return item;
		case BAJ:
			item = new ItemStack(Items.golden_hoe);
			Loot.setItemName(item, "Baj's Last Resort", TextFormat.DARKPURPLE);
			Loot.setItemLore(item, "\"Starvation could be fatal\"", TextFormat.DARKGREEN);
			item.addEnchantment(Enchantment.sharpness, 2);
			item.addEnchantment(Enchantment.knockback, 1);
			item.addEnchantment(Enchantment.fortune, 5);
			return item;
		case DOCM:
			item = new ItemStack(Items.fishing_rod);
			Loot.setItemName(item, "DocM's Rod of Command", TextFormat.DARKPURPLE);
			Loot.setItemLore(item, "\"Get to the dang land!\"",  TextFormat.DARKGREEN);
			item.addEnchantment(Enchantment.sharpness, 3);
			item.addEnchantment(Enchantment.knockback, 1);
			return item;
		case GINGER:
			item = new ItemStack(Items.cooked_chicken);
			Loot.setItemName(item, "Gingerian Spice Chicken", TextFormat.DARKPURPLE);
			Loot.setItemLore(item, "\"Kung Pao!\"",  TextFormat.DARKGREEN);
			item.addEnchantment(Enchantment.knockback, 1);
			item.addEnchantment(Enchantment.fireAspect, 3);
			item.addEnchantment(Enchantment.sharpness, 1);
			return item;
		case VECHS:
			item = new ItemStack(Items.stick);
			Loot.setItemName(item, "Vechsing Stick", TextFormat.DARKPURPLE);
			Loot.setItemLore(item, "\"Really?!\"",  TextFormat.DARKGREEN);
			item.addEnchantment(Enchantment.unbreaking, 1);
			return item;
		case NOTCH:
			item = new ItemStack(Items.apple);
			Loot.setItemName(item, "Notch's apple", TextFormat.DARKPURPLE);
			Loot.setItemLore(item, "Imbued with the creator's power",  TextFormat.DARKGREEN);
			item.addEnchantment(Enchantment.sharpness, 10);
			item.addEnchantment(Enchantment.knockback, 10);
			return item;
		case JOHNNYRAGGOT:
			item = new ItemStack(Items.paper);
			Loot.setItemName(item, "Johnnyraggot's Loot Card", TextFormat.DARKPURPLE);
			Loot.setItemLore(item, "Depicts a facemelting zombie",  TextFormat.DARKGREEN);
			item.addEnchantment(Enchantment.sharpness, 2);
			item.addEnchantment(Enchantment.looting, 2);
			return item;
		case QUANTUMLEAP:
			item = new ItemStack(Blocks.sponge);
			Loot.setItemName(item, "QuantumLeap's Swiss Cheese", TextFormat.DARKPURPLE);
			Loot.setItemLore(item, "\"Oh boy\"",  TextFormat.DARKGREEN);
			item.addEnchantment(Enchantment.sharpness, 4);
			return item;
		case MCGAMER:
			item = new ItemStack(Items.dye, 1, 4);
			Loot.setItemName(item, "McGamer's Precious", TextFormat.DARKPURPLE);
			Loot.setItemLore(item, "\"The lapis\"",  TextFormat.DARKGREEN);
			item.addEnchantment(Enchantment.sharpness, 2);
			item.addEnchantment(Enchantment.fortune, 3);
			return item;
		case GENERIKB:
			item = new ItemStack(Items.baked_potato);
			Loot.setItemName(item, "GenerikB's Hot Potato", TextFormat.DARKPURPLE);
			Loot.setItemLore(item, "All a hermit needs",  TextFormat.DARKGREEN);
			item.addEnchantment(Enchantment.fireAspect, 3);
			item.addEnchantment(Enchantment.knockback, 1);
			return item;
		case PAUSE:
			item = new ItemStack(Items.bow);
			Loot.setItemName(item, "Pauseunpause endless repeater", null);
			Loot.setItemLore(item, "\"OMG WTF\"",  TextFormat.DARKGREEN);
			item.addEnchantment(Enchantment.power, 4);
			item.addEnchantment(Enchantment.flame, 2);
			item.addEnchantment(Enchantment.infinity, 1);
			item.addEnchantment(Enchantment.unbreaking, 3);
			return item;
		case PAULSOARESJR:
			item = new ItemStack(Items.feather);
			Loot.setItemName(item, "Soarian Bonker", TextFormat.DARKPURPLE);
			Loot.setItemLore(item, "\"Aaaaauuaahh!!\"",  TextFormat.DARKGREEN);
			item.addEnchantment(Enchantment.knockback, 4);
			return item;
		case FOURLES:
			item = new ItemStack(Items.dye, 1, 3);
			Loot.setItemName(item, "Fourles Darkroast Beans", TextFormat.DARKPURPLE);
			Loot.setItemLore(item, "\"Mmmm... Dark Roast\"",  TextFormat.DARKGREEN);
			item.addEnchantment(Enchantment.fireAspect, 2);
			item.addEnchantment(Enchantment.sharpness, 2);
			return item;
		case DINNERBONE:
			item = new ItemStack(Items.bone, 1);
			Loot.setItemName(item, "Old Dinnerbone", TextFormat.DARKPURPLE);
			Loot.setItemLore(item, "\"Dang Skellies!\"",  TextFormat.DARKGREEN);
			item.addEnchantment(Enchantment.sharpness, 3);
			item.addEnchantment(Enchantment.fireAspect, 2);
			return item;
		case GRIM:
			item = new ItemStack(Items.rotten_flesh);
			Loot.setItemName(item, "Grim chew-toy", TextFormat.DARKPURPLE);
			Loot.setItemLore(item, "\"Come on Grim, let's do this!\"",  TextFormat.DARKGREEN);
			item.addEnchantment(Enchantment.smite, 2);
			item.addEnchantment(Enchantment.looting, 1);
			return item;
		case MMILLSS:
			item = new ItemStack(Blocks.cactus);
			Loot.setItemName(item, "MMillssian spider bane", TextFormat.DARKPURPLE);
			Loot.setItemLore(item, "\"I really don't need anymore string...\"",  TextFormat.DARKGREEN);
			item.addEnchantment(Enchantment.baneOfArthropods, 4);
			item.addEnchantment(Enchantment.thorns, 2);
			item.addEnchantment(Enchantment.looting, 1);
			return item;
		case MILLBEE:
			item = new ItemStack(Items.leather_chestplate);
			Loot.setItemName(item, "Millbee's Cosy Fleece", null);
			Loot.setItemLore(item, "\"Warm and fuzzy\"",  TextFormat.DARKGREEN);
			item.addEnchantment(Enchantment.protection, 4);
			item.addEnchantment(Enchantment.unbreaking, 3);
			ItemArmour.dyeArmor(item, 250, 128, 114);
			return item;
		case VINTAGEBEEF:
			item = new ItemStack(Items.cooked_beef);
			Loot.setItemName(item, "Vintage Beef", TextFormat.DARKPURPLE);
			Loot.setItemLore(item, "It never seems to go bad...",  TextFormat.DARKGREEN);
			item.addEnchantment(Enchantment.fortune, 2);
			item.addEnchantment(Enchantment.looting, 2);
			return item;
		case VALANDRAH:
			item = new ItemStack(Items.iron_sword);
			Loot.setItemName(item, "Valandrah's Kiss", null);
			Loot.setItemLore(item, "\"Feel the kiss of my blade\"",  TextFormat.DARKGREEN);
			item.addEnchantment(Enchantment.sharpness, 4);
			item.addEnchantment(Enchantment.fireAspect, 1);
			item.addEnchantment(Enchantment.knockback, 1);
			item.addEnchantment(Enchantment.unbreaking, 2);
			return item;
		default:
			return null;
		
		}
	}
	
	
}
