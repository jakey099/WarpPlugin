package me.jakey.warpgui.ui;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.jakey.warpgui.utils.Utils;

public class GameWarpUI
{
	public static Inventory inv;
	public static String inventoryName;
	public static int inv_rows = 5*9;
	
	public static void initialize()
	{
		inventoryName = Utils.chat("&9&lGame Maps");
		
		inv = Bukkit.createInventory(null, inv_rows);
	}
	
	public static Inventory GUI (Player p)
	{
		Inventory toReturn = Bukkit.createInventory(null, inv_rows, inventoryName);
		
		for(int i=1; i<=9; i++)
		{
			Utils.createItemByte(inv, "stained_glass_pane", 1, 15, i, " ");
			Utils.createItemByte(inv, "stained_glass_pane", 1, 15, 18+i, " ");
			Utils.createItemByte(inv, "stained_glass_pane", 1, 15, 36+i, " ");
		}
		Utils.createItemByte(inv, "stained_glass_pane", 1, 15, 10, " ");
		Utils.createItemByte(inv, "stained_glass_pane", 1, 15, 18, " ");
		Utils.createItemByte(inv, "stained_glass_pane", 1, 15, 28, " ");
		Utils.createItemByte(inv, "stained_glass_pane", 1, 15, 36, " ");
		
		Utils.createItemByte(inv, "quartz_block", 1, 3, 11, "&e&lMansion", "&9&oHide and Seek");
		Utils.createItemByte(inv, "prismarine", 1, 1, 12, "&3&lMonument", "&9&oHide and Seek");
		Utils.createItemByte(inv, "concrete", 1, 5, 13, "&a&lSpaceship", "&9&oHide and Seek");
		Utils.createItemByte(inv, "sandstone", 1, 1, 14, "&e&lDesert Ruins", "&4&oMurder Mystery");
		Utils.createItem(inv, "mossy_cobblestone", 1, 15, "&8&lCaves", "&4&oMurder Mystery");
		Utils.createItem(inv, "diamond_ore", 1, 16, "&b&lThe Mines", "&4&oMurder Mystery");
		Utils.createItemByte(inv, "wool", 1, 14, 17, "&c&lPort Town", "&4&oMurder Mystery");
		
		Utils.createItem(inv, "netherrack", 1, 29, "&4&lNether Run", "&2&oDeath Run");
		Utils.createItem(inv, "grass", 1, 30, "&7&lCliffside Run", "&2&oDeath Run");
		Utils.createItem(inv, "diamond_spade", 1, 31, "&6&lSpleef");
		Utils.createItemByte(inv, "concrete", 1, 7, 32, "&1&lClassic Arena", "&5&oCapture the Flag");
		Utils.createItem(inv, "snow_block", 1, 33, "&f&lWinter Castle", "&5&oCapture the Flag");
		Utils.createItemByte(inv, "wood", 1, 4, 34, "&9&lSettlement", "&4&oMurder Mystery");
		Utils.createItem(inv, "smooth_stairs", 1,35, "&d&lCathedral", "&9&oHide and Seek", "&4&oMurder Mystery");

		toReturn.setContents(inv.getContents());
		return toReturn;
	}
	
	public static void clicked(Player p, int slot, ItemStack clicked, Inventory inv)
	{
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&e&lMansion")))
		{
			Location x = new Location(p.getWorld(), 1457, 64, -5);
			p.teleport(x);
		}
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&3&lMonument")))
		{
			Location x = new Location(p.getWorld(), 688, 40, 635);
			p.teleport(x);
		}
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&a&lSpaceship")))
		{
			Location x = new Location(p.getWorld(), 2266, 126, 927);
			p.teleport(x);
		}
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&e&lDesert Ruins")))
		{
			Location x = new Location(p.getWorld(), 3242, 77, -532);
			p.teleport(x);
		}
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&8&lCaves")))
		{
			Location x = new Location(p.getWorld(), 1425, 53, -83);
			p.teleport(x);
		}
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&b&lThe Mines")))
		{
			Location x = new Location(p.getWorld(), 10523, 93, 7045);
			p.teleport(x);
		}
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&c&lPort Town")))
		{
			Location x = new Location(p.getWorld(), 1617, 75, 211);
			p.teleport(x);
		}
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&4&lNether Run")))
		{
			Location x = new Location(p.getWorld(), 1271, 56, -148);
			p.teleport(x);
		}
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&7&lCliffside Run")))
		{
			Location x = new Location(p.getWorld(), 1210, 50, -158);
			p.teleport(x);
		}
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&6&lSpleef")))
		{
			Location x = new Location(p.getWorld(), 1623, 80, 160);
			p.teleport(x);
		}
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&1&lClassic Arena")))
		{
			Location x = new Location(p.getWorld(), 1197, 49, -55);
			p.teleport(x);
		}
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&f&lWinter Castle")))
		{
			Location x = new Location(p.getWorld(), 12245, 82, 12470);
			p.teleport(x);
		}
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&9&lSettlement")))
		{
			Location x = new Location(p.getWorld(), 7437, 52, 7200);
			p.teleport(x);
		}
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&d&lCathedral")))
		{
			Location x = new Location(p.getWorld(), 9149, 57, 10104);
			p.teleport(x);
		}
	}
}
