package me.jakey.warpgui.ui;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.jakey.warpgui.Main;
import me.jakey.warpgui.utils.Utils;

public class HomeWarpUI {
	public static Inventory inv;
	public static String inventoryName;
	public static int inv_rows = 3*9;
	private Main plugin;
	
	public HomeWarpUI(Main plugin)
	{
		this.plugin = plugin;
		initialize();
	}
	public static void initialize()
	{
		inventoryName = Utils.chat("&a&lWarp");
		inv = Bukkit.createInventory(null, inv_rows);
	}
	
	public static Inventory GUI (Player p)
	{
		Inventory toReturn = Bukkit.createInventory(p, inv_rows, inventoryName);
		
		for(int i=0;i<inv_rows; i++)
		{
			if(i%9<3)
				Utils.createItemByte(inv, "stained_glass_pane", 1, 3, i+1, " ");
			else if (i%9<6)
				Utils.createItemByte(inv, "stained_glass_pane", 1, 5, i+1, " ");
			else
				Utils.createItemByte(inv, "stained_glass_pane", 1, 14, i+1, " ");				
		}
		inv = Utils.addItem(inv, Main.get(Utils.chat("&9&lGame Maps")).getItem(), Main.get(Utils.chat("&9&lGame Maps")).getSlot());
		inv = Utils.addItem(inv, Main.get(Utils.chat("&a&lFinished Builds")).getItem(), Main.get(Utils.chat("&a&lFinished Builds")).getSlot());
		inv = Utils.addItem(inv, Main.get(Utils.chat("&4&lW.I.P.")).getItem(), Main.get(Utils.chat("&4&lW.I.P.")).getSlot());
		
		toReturn.setContents(inv.getContents());
		return toReturn;
	}
	
	public static void clicked(Player p, int slot, ItemStack clicked, Inventory inv)
	{
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&9&lGame Maps")))
		{
			p.openInventory(GameWarpUI.GUI(p));
		}
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&a&lFinished Builds")))
		{
			p.openInventory(BuildWarpUI.GUI(p));
		}
		if(clicked.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.chat("&4&lW.I.P.")))
		{
			p.openInventory(WIPWarpUI.GUI(p));
		}
		
	}
}
