package me.jakey.warpgui.ui;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.jakey.warpgui.Main;
import me.jakey.warpgui.utils.Utils;

public class WIPWarpUI {
	public static Inventory inv;
	public static String inventoryName;
	public static int inv_rows = 4*9;
	
	private static String[] mapIDs = {"&a&lThe Zoo","&2&lFarming Town","&e&lMining Town","&3&lObama Pagoda","&4&lMurder Mystery Lobby","&9&lTennis"};
	
	private Main plugin;
	
	public WIPWarpUI(Main plugin)
	{
		this.plugin=plugin;
		initialize();
	}
	
	public static void initialize()
	{
		inventoryName = Utils.chat("&4&lWork In Progress Builds");
		
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
			Utils.addItem(inv, Main.get(Utils.chat(s)).getItem(), Main.get(Utils.chat(s)).getSlot());
		}
    	Utils.addBack(inv,32);

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
