package me.jakey.warpgui.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import me.jakey.warpgui.Main;
import me.jakey.warpgui.ui.BuildWarpUI;
import me.jakey.warpgui.ui.GameWarpUI;
import me.jakey.warpgui.ui.HomeWarpUI;
import me.jakey.warpgui.ui.WIPWarpUI;

public class InventoryClick implements Listener
{
	public Main plugin;
	
	public InventoryClick(Main plugin)
	{
		this.plugin=plugin;
		
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onClick(InventoryClickEvent e)
	{
		String title = e.getView().getTitle();
		if (title.equals(GameWarpUI.inventoryName))
		{
			e.setCancelled(true);
			if(e.getCurrentItem()==null)
			{
				return;
			}
			GameWarpUI.clicked((Player) e.getWhoClicked(), e.getSlot(),e.getCurrentItem(), e.getInventory());
		}
		if (title.equals(HomeWarpUI.inventoryName))
		{
			e.setCancelled(true);
			if(e.getCurrentItem()==null)
			{
				return;
			}
			HomeWarpUI.clicked((Player) e.getWhoClicked(), e.getSlot(),e.getCurrentItem(), e.getInventory());
		}
		if (title.equals(BuildWarpUI.inventoryName))
		{
			e.setCancelled(true);
			if(e.getCurrentItem()==null)
			{
				return;
			}
			BuildWarpUI.clicked((Player) e.getWhoClicked(), e.getSlot(),e.getCurrentItem(), e.getInventory());
		}
		if (title.equals(WIPWarpUI.inventoryName))
		{
			e.setCancelled(true);
			if(e.getCurrentItem()==null)
			{
				return;
			}
			WIPWarpUI.clicked((Player) e.getWhoClicked(), e.getSlot(),e.getCurrentItem(), e.getInventory());
		}
	}
}
