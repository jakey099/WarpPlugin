package me.jakey.warpgui.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Utils
{
	public static String chat(String s)
	{
		return ChatColor.translateAlternateColorCodes('&', s);
	}            
	public static ItemStack createItem(Inventory inv, String materialString, int amount, int invSlot, String displayName, String... loreString)
	{
		ItemStack item;
		List<String> lore = new ArrayList<String>();
		
		item = new ItemStack(Material.matchMaterial(materialString),amount);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Utils.chat(displayName));
		for(String s:loreString)
		{
			lore.add(Utils.chat(s));
		}
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		inv.setItem(invSlot-1, item);
		return item;
	}
	public static ItemStack createItem(Inventory inv, String materialString, int amount, int invSlot, String displayName)
	{
		ItemStack item;
		
		item = new ItemStack(Material.matchMaterial(materialString),amount);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Utils.chat(displayName));
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(meta);
		inv.setItem(invSlot-1, item);
		return item;
	}
	@SuppressWarnings("deprecation")
	public static ItemStack createItemByte(Inventory inv, String materialString, int amount, int byteID, int invSlot, String displayName, String... loreString)
	{
		ItemStack item;
		List<String> lore = new ArrayList<String>();
		
		item = new ItemStack(Material.matchMaterial(materialString),amount,(short) byteID);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Utils.chat(displayName));
		for(String s:loreString)
		{
			lore.add(Utils.chat(s));
		}
		meta.setLore(lore);
		
		item.setItemMeta(meta);
		inv.setItem(invSlot-1, item);
		return item;
	}
	public static ItemStack createItemByte(Inventory inv, String materialString, int amount, int byteID, int invSlot, String displayName)
	{
		ItemStack item;
		
		item = new ItemStack(Material.matchMaterial(materialString),amount,(short) byteID);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Utils.chat(displayName));
		
		item.setItemMeta(meta);
		inv.setItem(invSlot-1, item);
		return item;
	}
}
