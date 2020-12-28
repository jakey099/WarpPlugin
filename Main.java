package me.jakey.warpgui;

import org.bukkit.plugin.java.JavaPlugin;

import me.jakey.warpgui.commands.WarpCommand;
import me.jakey.warpgui.listeners.InventoryClick;
import me.jakey.warpgui.ui.BuildWarpUI;
import me.jakey.warpgui.ui.GameWarpUI;
import me.jakey.warpgui.ui.HomeWarpUI;
import me.jakey.warpgui.ui.WIPWarpUI;

public class Main extends JavaPlugin
{
	@Override
	public void onEnable()
	{
		new WarpCommand(this);
		new InventoryClick(this);
		GameWarpUI.initialize();
		HomeWarpUI.initialize();
		BuildWarpUI.initialize();
		WIPWarpUI.initialize();
	}
}
