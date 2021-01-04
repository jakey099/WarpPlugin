package me.jakey.warpgui.ui;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.jakey.warpgui.Main;
import me.jakey.warpgui.utils.Utils;

public class BuildWarpUI {
	public static Inventory inv;
	public static String inventoryName;
	public static int inv_rows = 6*9;

	private static String[] mapIDs = {"&5&lFort Town","&c&lFlinnyville","&a&lSims Tree","&6&lRed Sand Temple","&9&lAnimal Playpen","&4&lWendys","&8&lNoah Hole",
			"&1&lNormandy","&b&lCorrupted Village"};
	
	private static Main plugin;
	
	public BuildWarpUI(Main plugin)
	{
		this.plugin=plugin;
		initialize();
	}
	public static void initialize()
	{
		inventoryName = Utils.chat("&a&lFinished Builds");
		
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
