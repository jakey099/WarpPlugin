package me.jakey.warpgui;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.plugin.java.JavaPlugin;

import me.jakey.warpgui.commands.WarpCommand;
import me.jakey.warpgui.listeners.InventoryClick;
import me.jakey.warpgui.ui.BuildWarpUI;
import me.jakey.warpgui.ui.GameWarpUI;
import me.jakey.warpgui.ui.HomeWarpUI;
import me.jakey.warpgui.ui.WIPWarpUI;
import me.jakey.warpgui.utils.Builder;

public class Main extends JavaPlugin
{
	private static Map<String,Warp> warpMap = new HashMap<String,Warp>();
	@Override
	public void onEnable()
	{
		new WarpCommand(this);
		new InventoryClick(this);
		new HomeWarpUI(this);
		new Builder(this);
		new BuildWarpUI(this);
		new GameWarpUI(this);
		new WIPWarpUI(this);
	}
	public static void insert(String s, Warp w)
	{
		warpMap.put(s, w);
	}
	public static void print()
	{
		System.out.println(warpMap);
	}
	public static Warp get(String s)
	{
		Warp x = warpMap.get(s);
		return x;
	}
}
