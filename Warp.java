package me.jakey.warpgui;

import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;

public class Warp
{
	private ItemStack item;
	private Location loc;
	private int invSlot;
	
	public Warp(int invSlot, ItemStack item, Location location)
	{
		this.item = item;
		this.loc = location;
		this.invSlot = invSlot;
	}
	public Warp(int invSlot, ItemStack item)
	{
		this.item=item;
		this.invSlot = invSlot;
		loc = null;
	}
	public int getSlot()
	{
		return invSlot;
	}
	public String getName()
	{
		return item.getItemMeta().getDisplayName();
	}
	public ItemStack getItem()
	{
		return item;
	}
	public Location getLocation()
	{
		return loc;
	}
	public void print()
	{
		System.out.println("Item: ");
		System.out.println(item);
		System.out.println("Location: ");
		System.out.println(loc);
		System.out.println("Inventory Slot:");
		System.out.println(invSlot);
	}
}