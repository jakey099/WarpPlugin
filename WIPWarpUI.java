package me.jakey.warpgui.ui;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.jakey.warpgui.utils.Utils;

public class WIPWarpUI {
	public static Inventory inv;
	public static String inventoryName;
	public static int inv_rows = 3*9;
	
	public static void initialize()
	{
		inventoryName = Utils.chat("&4&lWork In Progress Builds");
		
		inv = Bukkit.createInventory(null, inv_rows);
	}
	
	public static Inventory GUI (Player p)
	{
		Inventory toReturn = Bukkit.createInventory(null, inv_rows, inventoryName);
		
		for(int i=1; i<=9; i++)
		{
			Utils.createItemByte(inv, "stained_glass_pane", 1, 15, i, " ");
			Utils.createItemByte(inv, "stained_glass_pane", 1, 15, i+18, " ");
		}
		Utils.createItemByte(inv, "stained_glass_pane", 1, 15, 10, " ");
		Utils.createItemByte(inv, "stained_glass_pane", 1, 15, 18, " ");
		Utils.createItemByte(inv, "stained_glass_pane", 1, 15, 14, " ");
		Utils.createItem(inv, "iron_fence", 1, 11, "&a&lThe Zoo");
		Utils.createItem(inv, "crops", 1, 12, "&2&lFarming Town");
		Utils.createItem(inv, "gold_ore", 1, 13, "&e&lMining Town");
		Utils.createItemByte(inv, "log", 1,3, 15, "&3&lObama Pagoda");
		Utils.createItem(inv, "iron_sword", 1, 16, "&4&lMurder Mystery Lobby");
		Utils.createItem(inv, "slime_ball", 1, 17, "&9&lTennis");
		
		toReturn.setContents(inv.getContents());
		return toReturn;
	}
	
	public static void clicked(Player p, int slot, ItemStack clicked, Inventory inv)
	{
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&a&lThe Zoo")))
		{
			Location x = new Location(p.getWorld(), 8210, 51, 10086);
			p.teleport(x);
		}

		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&2&lFarming Town")))
		{
			Location x = new Location(p.getWorld(), 9592, 50, 11377);
			p.teleport(x);
		}
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&e&lMining Town")))
		{
			Location x = new Location(p.getWorld(), 7234, 124, 8757);
			p.teleport(x);
		}

		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&3&lObama Pagoda")))
		{
			Location x = new Location(p.getWorld(), 2761, 98, 759);
			p.teleport(x);
		}
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&4&lMurder Mystery Lobby")))
		{
			Location x = new Location(p.getWorld(), 1645, 45, 237);
			p.teleport(x);
		}
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&9&lTennis")))
		{
			Location x = new Location(p.getWorld(), 1360, 86, -313);
			p.teleport(x);
		}
	}
}
