package me.jakey.warpgui.ui;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.jakey.warpgui.utils.Utils;

public class BuildWarpUI {
	public static Inventory inv;
	public static String inventoryName;
	public static int inv_rows = 5*9;
	
	public static void initialize()
	{
		inventoryName = Utils.chat("&a&lFinished Builds");
		
		inv = Bukkit.createInventory(null, inv_rows);
	}
	
	public static Inventory GUI (Player p)
	{
		Inventory toReturn = Bukkit.createInventory(null, inv_rows, inventoryName);
		for(int i=1; i<=9; i++)
		{
			Utils.createItemByte(inv, "stained_glass_pane", 1, 15, i, " ");
			Utils.createItemByte(inv, "stained_glass_pane", 1, 15, i+18, " ");
			Utils.createItemByte(inv, "stained_glass_pane", 1, 15, i+36, " ");
		}
		for(int i=1; i<=9; i+=4)
		{
			Utils.createItemByte(inv, "stained_glass_pane", 1, 15, 9+i, " ");
		}
		for(int i=1; i<=3; i++)
		{
			Utils.createItemByte(inv, "stained_glass_pane", 1, 15, 27+i, " ");
			Utils.createItemByte(inv, "stained_glass_pane", 1, 15, 33+i, " ");
		}
		Utils.createItemByte(inv, "stone", 1, 5, 13, "&5&lFort Town");
		Utils.createItem(inv, "brick", 1, 12, "&c&lFlinnyville");
		Utils.createItemByte(inv, "stained_glass", 1, 5, 11, "&a&lSims Tree");
		Utils.createItemByte(inv, "red_sandstone", 1, 2, 15, "&6&lRed Sand Temple");
		Utils.createItem(inv, "light_blue_shulker_box", 1, 16, "&9&lAnimal Playpen");
		Utils.createItemByte(inv, "concrete", 1, 14, 17, "&4&lWendy's");
		Utils.createItem(inv, "lava_bucket", 1, 33, "&8&lNoah Hole");
		Utils.createItem(inv, "sand", 1, 32, "&1&lNormandy");
		Utils.createItem(inv, "red_nether_brick", 1, 31, "&b&lCorrupted Village");
		


		
		toReturn.setContents(inv.getContents());
		return toReturn;
	}
	
	public static void clicked(Player p, int slot, ItemStack clicked, Inventory inv)
	{
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&b&lCorrupted Village")))
		{
			Location x = new Location(p.getWorld(), 1226, 69, -315);
			p.teleport(x);
		}
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&1&lNormandy")))
		{
			Location x = new Location(p.getWorld(), 8685, 41, 6578);
			p.teleport(x);
		}
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&8&lNoah Hole")))
		{
			Location x = new Location(p.getWorld(), 7348, 96, 10323);
			p.teleport(x);
		}
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&4&lWendy's")))
		{
			Location x = new Location(p.getWorld(), 1790, 78, 29);
			p.teleport(x);
		}
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&9&lAnimal Playpen")))
		{
			Location x = new Location(p.getWorld(), 1480, 98, -193);
			p.teleport(x);
		}
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&6&lRed Sand Temple")))
		{
			Location x = new Location(p.getWorld(), 7260, 87, 9090);
			p.teleport(x);
		}
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&c&lFlinnyville")))
		{
			Location x = new Location(p.getWorld(), 1724, 81, -8);
			p.teleport(x);
		}
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&5&lFort Town")))
		{
			Location x = new Location(p.getWorld(), 3890, 67, 2209);
			p.teleport(x);
		}
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&a&lSims Tree")))
		{
			Location x = new Location(p.getWorld(), 882, 64, -238);
			p.teleport(x);
		}
	}
}
