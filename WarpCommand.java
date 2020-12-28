package me.jakey.warpgui.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.jakey.warpgui.Main;
import me.jakey.warpgui.ui.HomeWarpUI;

public class WarpCommand implements CommandExecutor{
	
	@SuppressWarnings("unused")
	private Main plugin;
	public WarpCommand(Main plugin)
	{
		this.plugin = plugin;
		plugin.getCommand("warp").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player))
		{
			sender.sendMessage("Only Players may execute this command!");
			return true;
		}
		Player p = (Player) sender;
		p.openInventory(HomeWarpUI.GUI(p));
		return true;
	}
}
