package me.jakey.warpgui.ui;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.jakey.warpgui.utils.Utils;

public class HomeWarpUI {
	public static Inventory inv;
	public static String inventoryName;
	public static int inv_rows = 3*9;
	
	public static void initialize()
	{
		inventoryName = Utils.chat("&a&lWarp");
		
		inv = Bukkit.createInventory(null, inv_rows);
	}
	
	public static Inventory GUI (Player p)
	{
		Inventory toReturn = Bukkit.createInventory(null, inv_rows, inventoryName);
		
		for(int i=1; i<=3; i++)
		{
			Utils.createItemByte(inv, "stained_glass_pane", 1, 3, i, " ");
			Utils.createItemByte(inv, "stained_glass_pane", 1, 5, 3+i, " ");
			Utils.createItemByte(inv, "stained_glass_pane", 1, 14, 6+i, " ");
			Utils.createItemByte(inv, "stained_glass_pane", 1, 3, 18+i, " ");
			Utils.createItemByte(inv, "stained_glass_pane", 1, 5, 18+3+i, " ");
			Utils.createItemByte(inv, "stained_glass_pane", 1, 14, 18+6+i, " ");
		}
		Utils.createItemByte(inv, "stained_glass_pane", 1, 3, 10, " ");
		Utils.createItemByte(inv, "stained_glass_pane", 1, 3, 12, " ");
		Utils.createItemByte(inv, "stained_glass_pane", 1, 5, 13, " ");
		Utils.createItemByte(inv, "stained_glass_pane", 1, 5, 15, " ");
		Utils.createItemByte(inv, "stained_glass_pane", 1, 14, 18, " ");
		Utils.createItemByte(inv, "stained_glass_pane", 1, 14, 16, " ");
		
		
		
		
		Utils.createItem(inv, "note_block", 1, 11, "&9&lGame Maps");
		Utils.createItem(inv, "workbench", 1, 14, "&a&lFinished Builds");
		Utils.createItem(inv, "dead_bush", 1, 17, "&4&lW.I.P.");

		
		
		
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
