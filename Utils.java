package me.jakey.warpgui.utils;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Utils
{
	public static String chat(String s)
	{
		return ChatColor.translateAlternateColorCodes('&', s);
	}    
    public static ItemStack addBack(Inventory inv, int invSlot)
    {
    	ItemStack item;
    	item = new ItemStack(Material.NETHER_STAR,1);
    	ItemMeta meta = item.getItemMeta();
    	meta.setDisplayName(Utils.chat("&7&lBack"));
    	item.setItemMeta(meta);
		inv.setItem(invSlot-1, item);
    	return item;
    }
	public static ItemStack createItem(String materialString, int amount, String displayName, String... loreString)
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
		return item;
	}
	public static ItemStack createItem(String materialString, int amount, String displayName)
	{
		ItemStack item;		
		item = new ItemStack(Material.matchMaterial(materialString),amount);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Utils.chat(displayName));
		item.setItemMeta(meta);
		return item;
	}
	@SuppressWarnings("deprecation")
	public static ItemStack createItemByte(String materialString, int amount, int byteID, String displayName, String... loreString)
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
		return item;
	}
	
	@SuppressWarnings("deprecation")
	public static ItemStack createItemByte(String materialString, int amount, int byteID, String displayName)
	{
		ItemStack item;
		
		item = new ItemStack(Material.matchMaterial(materialString),amount,(short) byteID);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(Utils.chat(displayName));
		
		item.setItemMeta(meta);
		return item;
	}
	
	public static Inventory addItem(Inventory inv, ItemStack item, int invSlot)
	{
		ItemStack x;
		x = item;
		
		inv.setItem(invSlot-1, x);
		return inv;
	}
	
	@SuppressWarnings("deprecation")
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
	/*public static ItemStack createItem(Inventory inv, String materialString, int amount, int invSlot, String displayName, String... loreString)
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
	}*/
}
