package me.jakey.warpgui.ui;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.jakey.warpgui.Main;
import me.jakey.warpgui.utils.Utils;

public class GameWarpUI
{
	public static Inventory inv;
	public static String inventoryName;
	public static int inv_rows = 6*9;
	
	private static String[] mapIDs = {"&e&lMansion","&3&lMonument","&a&lSpaceship","&e&lDesert Ruins","&8&lCaves","&b&lThe Mines","&c&lPort Town","&4&lNether Run",
			"&7&lCliffside Run","&6&lSpleef Arena","&1&lClassic Arena","&f&lWinter Castle","&9&lSettlement","&d&lCathedral"};
	
	public Main plugin;
	
	public GameWarpUI(Main plugin)
	{
		this.plugin=plugin;
		initialize();
	}
	public static void initialize()
	{
		inventoryName = Utils.chat("&9&lGame Maps");
		
		inv = Bukkit.createInventory(null, inv_rows);
	}
	
	public static Inventory GUI (Player p)
	{
		Inventory toReturn = Bukkit.createInventory(null, inv_rows, inventoryName);
		
		for(int i=1;i<=inv_rows; i++)
		{
			Utils.createItemByte(inv, "stained_glass_pane", 1, 15, i, " ");
		}
		
		for(String s:mapIDs)
		{
			if(Main.get(Utils.chat(s))!=null)
				Utils.addItem(inv, Main.get(Utils.chat(s)).getItem(), Main.get(Utils.chat(s)).getSlot());
		}
		
    	Utils.addBack(inv,50);
			
		toReturn.setContents(inv.getContents());
		return toReturn;
	}
	
	public static void clicked(Player p, int slot, ItemStack clicked, Inventory inv)
	{
		if(clicked!=null&&clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&7&lBack")))
		{
			p.openInventory(HomeWarpUI.GUI(p));
		}
		else if(clicked!=null&&clicked.getItemMeta().getDisplayName()!= " ")
		{
			p.teleport(Main.get(clicked.getItemMeta().getDisplayName()).getLocation());
		}
		return;
	}
}
