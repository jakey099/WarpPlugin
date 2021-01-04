package me.jakey.warpgui.utils;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.configuration.file.FileConfiguration;

import me.jakey.warpgui.Main;
import me.jakey.warpgui.Warp;

public class Builder
{
	private static Main plugin;
	
	public Builder(Main plugin)
	{
		Builder.plugin = plugin;
		createGUI();
	}
	private void createGUI()
	{
		FileConfiguration c=plugin.getConfig();
		Warp Games = new Warp(c.getInt("GameMaps.invSlot"),Utils.createItem(Utils.chat(c.getString("GameMaps.materialString")), c.getInt("GameMaps.amount"),
				Utils.chat(c.getString("GameMaps.displayName"))));
		Warp Builds = new Warp(c.getInt("FinishedBuilds.invSlot"),Utils.createItem(Utils.chat(c.getString("FinishedBuilds.materialString")), c.getInt("FinishedBuilds.amount"),
				Utils.chat(c.getString("FinishedBuilds.displayName"))));
		Warp WIP = new Warp(c.getInt("WIP.invSlot"), Utils.createItem(Utils.chat(c.getString("WIP.materialString")), c.getInt("WIP.amount"),
				Utils.chat(c.getString("WIP.displayName"))));
		
		Warp Mansion = new Warp(c.getInt("Mansion.invSlot"),Utils.createItemByte(Utils.chat(c.getString("Mansion.materialString")), c.getInt("Mansion.amount"),
				c.getInt("Mansion.byte"),Utils.chat(c.getString("Mansion.displayName")),Utils.chat(c.getString("Mansion.lore"))),
				new Location(Bukkit.getWorld(Utils.chat(c.getString("Mansion.world"))), c.getDouble("Mansion.x"),c.getDouble("Mansion.y"),c.getDouble("Mansion.z")));
		Warp Monument = new Warp(c.getInt("Monument.invSlot"),Utils.createItemByte(Utils.chat(c.getString("Monument.materialString")), c.getInt("Monument.amount"),
				c.getInt("Monument.byte"),Utils.chat(c.getString("Monument.displayName")),Utils.chat(c.getString("Monument.lore"))),
				new Location(Bukkit.getWorld(Utils.chat(c.getString("Monument.world"))), c.getDouble("Monument.x"),c.getDouble("Monument.y"),c.getDouble("Monument.z")));
		Warp Spaceship = new Warp(c.getInt("Spaceship.invSlot"),Utils.createItemByte(Utils.chat(c.getString("Spaceship.materialString")), c.getInt("Spaceship.amount"),
				c.getInt("Spaceship.byte"),Utils.chat(c.getString("Spaceship.displayName")),Utils.chat(c.getString("Spaceship.lore"))),
				new Location(Bukkit.getWorld(Utils.chat(c.getString("Spaceship.world"))), c.getDouble("Spaceship.x"),c.getDouble("Spaceship.y"),c.getDouble("Spaceship.z")));
		Warp DesertRuins = new Warp(c.getInt("DesertRuins.invSlot"),Utils.createItemByte(Utils.chat(c.getString("DesertRuins.materialString")), c.getInt("DesertRuins.amount"),
				c.getInt("DesertRuins.byte"),Utils.chat(c.getString("DesertRuins.displayName")),Utils.chat(c.getString("DesertRuins.lore"))),
				new Location(Bukkit.getWorld(Utils.chat(c.getString("DesertRuins.world"))), c.getDouble("DesertRuins.x"),c.getDouble("DesertRuins.y"),c.getDouble("DesertRuins.z")));
		Warp Caves = new Warp(c.getInt("Caves.invSlot"),Utils.createItem(Utils.chat(c.getString("Caves.materialString")), c.getInt("Caves.amount"),
				Utils.chat(c.getString("Caves.displayName")),Utils.chat(c.getString("Caves.lore"))),new Location(Bukkit.getWorld(Utils.chat(c.getString("Caves.world"))),
						c.getDouble("Caves.x"), c.getDouble("Caves.y"),c.getDouble("Caves.z")));
		Warp TheMines = new Warp(c.getInt("TheMines.invSlot"),Utils.createItem(Utils.chat(c.getString("TheMines.materialString")), c.getInt("TheMines.amount"),Utils.chat(c.getString("TheMines.displayName")),
				Utils.chat(c.getString("TheMines.lore"))),new Location(Bukkit.getWorld(Utils.chat(c.getString("TheMines.world"))), c.getDouble("TheMines.x"),c.getDouble("TheMines.y"),
						c.getDouble("TheMines.z")));
		Warp PortTown = new Warp(c.getInt("PortTown.invSlot"),Utils.createItemByte(Utils.chat(c.getString("PortTown.materialString")), c.getInt("PortTown.amount"),
				c.getInt("PortTown.byte"),Utils.chat(c.getString("PortTown.displayName")),Utils.chat(c.getString("PortTown.lore"))),
				new Location(Bukkit.getWorld(Utils.chat(c.getString("PortTown.world"))), c.getDouble("PortTown.x"),c.getDouble("PortTown.y"),c.getDouble("PortTown.z")));
		Warp NetherRun = new Warp(c.getInt("NetherRun.invSlot"),Utils.createItem(Utils.chat(c.getString("NetherRun.materialString")), c.getInt("NetherRun.amount"),
				Utils.chat(c.getString("NetherRun.displayName")),Utils.chat(c.getString("NetherRun.lore"))),
				new Location(Bukkit.getWorld(Utils.chat(c.getString("NetherRun.world"))), c.getDouble("NetherRun.x"),c.getDouble("NetherRun.y"),c.getDouble("NetherRun.z")));
		Warp CliffsideRun = new Warp(c.getInt("CliffsideRun.invSlot"),Utils.createItem(Utils.chat(c.getString("CliffsideRun.materialString")), c.getInt("CliffsideRun.amount"),
				Utils.chat(c.getString("CliffsideRun.displayName")),Utils.chat(c.getString("CliffsideRun.lore"))),
				new Location(Bukkit.getWorld(Utils.chat(c.getString("CliffsideRun.world"))), c.getDouble("CliffsideRun.x"),c.getDouble("CliffsideRun.y"),c.getDouble("CliffsideRun.z")));
		Warp SpleefArena = new Warp(c.getInt("SpleefArena.invSlot"),Utils.createItem(Utils.chat(c.getString("SpleefArena.materialString")), c.getInt("SpleefArena.amount"),
				Utils.chat(c.getString("SpleefArena.displayName")),Utils.chat(c.getString("SpleefArena.lore"))),
				new Location(Bukkit.getWorld(Utils.chat(c.getString("SpleefArena.world"))), c.getDouble("SpleefArena.x"),c.getDouble("SpleefArena.y"),c.getDouble("SpleefArena.z")));
		Warp ClassicArena = new Warp(c.getInt("ClassicArena.invSlot"),Utils.createItemByte(Utils.chat(c.getString("ClassicArena.materialString")), c.getInt("ClassicArena.amount"),
				c.getInt("ClassicArena.byte"),Utils.chat(c.getString("ClassicArena.displayName")),Utils.chat(c.getString("ClassicArena.lore"))),
				new Location(Bukkit.getWorld(Utils.chat(c.getString("ClassicArena.world"))), c.getDouble("ClassicArena.x"),c.getDouble("ClassicArena.y"),c.getDouble("ClassicArena.z")));
		Warp WinterCastle = new Warp(c.getInt("WinterCastle.invSlot"),Utils.createItem(Utils.chat(c.getString("WinterCastle.materialString")), c.getInt("WinterCastle.amount"),
				Utils.chat(c.getString("WinterCastle.displayName")),Utils.chat(c.getString("WinterCastle.lore"))),
				new Location(Bukkit.getWorld(Utils.chat(c.getString("WinterCastle.world"))), c.getDouble("WinterCastle.x"),c.getDouble("WinterCastle.y"),c.getDouble("WinterCastle.z")));
		Warp Settlement = new Warp(c.getInt("Settlement.invSlot"),Utils.createItemByte(Utils.chat(c.getString("Settlement.materialString")), c.getInt("Settlement.amount"),
				c.getInt("Settlement.byte"),Utils.chat(c.getString("Settlement.displayName")),Utils.chat(c.getString("Settlement.lore"))),
				new Location(Bukkit.getWorld(Utils.chat(c.getString("Settlement.world"))), c.getDouble("Settlement.x"),c.getDouble("Settlement.y"),c.getDouble("Settlement.z")));
		Warp Cathedral = new Warp(c.getInt("Cathedral.invSlot"),Utils.createItem(Utils.chat(c.getString("Cathedral.materialString")), c.getInt("Cathedral.amount"),
				Utils.chat(c.getString("Cathedral.displayName")),Utils.chat(c.getString("Cathedral.loreA")),Utils.chat(c.getString("Cathedral.loreB"))),
				new Location(Bukkit.getWorld(Utils.chat(c.getString("Cathedral.world"))), c.getDouble("Cathedral.x"),c.getDouble("Cathedral.y"),c.getDouble("Cathedral.z")));
		
		Warp FortTown = new Warp(c.getInt("FortTown.invSlot"),Utils.createItemByte(c.getString("FortTown.materialString"), c.getInt("FortTown.amount"),
				c.getInt("FortTown.byte"),c.getString("FortTown.displayName")),
				new Location(Bukkit.getWorld(c.getString("FortTown.world")), c.getDouble("FortTown.x"),c.getDouble("FortTown.y"),c.getDouble("FortTown.z")));
		Warp Flinnyville = new Warp(c.getInt("Flinnyville.invSlot"),Utils.createItem(c.getString("Flinnyville.materialString"), c.getInt("Flinnyville.amount"),
				c.getString("Flinnyville.displayName")),
				new Location(Bukkit.getWorld(c.getString("Flinnyville.world")), c.getDouble("Flinnyville.x"),c.getDouble("Flinnyville.y"),c.getDouble("Flinnyville.z")));
		Warp SimsTree = new Warp(c.getInt("SimsTree.invSlot"),Utils.createItemByte(c.getString("SimsTree.materialString"), c.getInt("SimsTree.amount"),
				c.getInt("SimsTree.byte"),c.getString("SimsTree.displayName")),
				new Location(Bukkit.getWorld(c.getString("SimsTree.world")), c.getDouble("SimsTree.x"),c.getDouble("SimsTree.y"),c.getDouble("SimsTree.z")));
		Warp RedSandTemple = new Warp(c.getInt("RedSandTemple.invSlot"),Utils.createItemByte(c.getString("RedSandTemple.materialString"), c.getInt("RedSandTemple.amount"),
				c.getInt("RedSandTemple.byte"),c.getString("RedSandTemple.displayName")),
				new Location(Bukkit.getWorld(c.getString("RedSandTemple.world")), c.getDouble("RedSandTemple.x"),c.getDouble("RedSandTemple.y"),c.getDouble("RedSandTemple.z")));
		Warp AnimalPen = new Warp(c.getInt("AnimalPen.invSlot"),Utils.createItem(c.getString("AnimalPen.materialString"), c.getInt("AnimalPen.amount"),
				c.getString("AnimalPen.displayName")),
				new Location(Bukkit.getWorld(c.getString("AnimalPen.world")), c.getDouble("AnimalPen.x"),c.getDouble("AnimalPen.y"),c.getDouble("AnimalPen.z")));
		Warp Wendys = new Warp(c.getInt("Wendys.invSlot"),Utils.createItemByte(c.getString("Wendys.materialString"), c.getInt("Wendys.amount"),
				c.getInt("Wendys.byte"),c.getString("Wendys.displayName")),
				new Location(Bukkit.getWorld(c.getString("Wendys.world")), c.getDouble("Wendys.x"),c.getDouble("Wendys.y"),c.getDouble("Wendys.z")));
		Warp NoahHole = new Warp(c.getInt("NoahHole.invSlot"),Utils.createItem(c.getString("NoahHole.materialString"), c.getInt("NoahHole.amount"),
				c.getString("NoahHole.displayName")),
				new Location(Bukkit.getWorld(c.getString("NoahHole.world")), c.getDouble("NoahHole.x"),c.getDouble("NoahHole.y"),c.getDouble("NoahHole.z")));
		Warp Normandy = new Warp(c.getInt("Normandy.invSlot"),Utils.createItem(c.getString("Normandy.materialString"), c.getInt("Normandy.amount"),
				c.getString("Normandy.displayName")),
				new Location(Bukkit.getWorld(c.getString("Normandy.world")), c.getDouble("Normandy.x"),c.getDouble("Normandy.y"),c.getDouble("Normandy.z")));
		Warp CorruptedVillage = new Warp(c.getInt("CorruptedVillage.invSlot"),Utils.createItem(c.getString("CorruptedVillage.materialString"), c.getInt("CorruptedVillage.amount"),
				c.getString("CorruptedVillage.displayName")),
				new Location(Bukkit.getWorld(c.getString("CorruptedVillage.world")), c.getDouble("CorruptedVillage.x"),c.getDouble("CorruptedVillage.y"),c.getDouble("CorruptedVillage.z")));
		
		Warp ObamaPagoda = new Warp(c.getInt("ObamaPagoda.invSlot"),Utils.createItemByte(c.getString("ObamaPagoda.materialString"), c.getInt("ObamaPagoda.amount"),
				c.getInt("ObamaPagoda.byte"),c.getString("ObamaPagoda.displayName")),
				new Location(Bukkit.getWorld(c.getString("ObamaPagoda.world")), c.getDouble("ObamaPagoda.x"),c.getDouble("ObamaPagoda.y"),c.getDouble("ObamaPagoda.z")));
		Warp Zoo = new Warp(c.getInt("Zoo.invSlot"),Utils.createItem(c.getString("Zoo.materialString"), c.getInt("Zoo.amount"),
				c.getString("Zoo.displayName")),
				new Location(Bukkit.getWorld(c.getString("Zoo.world")), c.getDouble("Zoo.x"),c.getDouble("Zoo.y"),c.getDouble("Zoo.z")));
		Warp FarmingTown = new Warp(c.getInt("FarmingTown.invSlot"),Utils.createItem(c.getString("FarmingTown.materialString"), c.getInt("FarmingTown.amount"),
				c.getString("FarmingTown.displayName")),
				new Location(Bukkit.getWorld(c.getString("FarmingTown.world")), c.getDouble("FarmingTown.x"),c.getDouble("FarmingTown.y"),c.getDouble("FarmingTown.z")));
		Warp MiningTown = new Warp(c.getInt("MiningTown.invSlot"),Utils.createItem(c.getString("MiningTown.materialString"), c.getInt("MiningTown.amount"),
				c.getString("MiningTown.displayName")),
				new Location(Bukkit.getWorld(c.getString("MiningTown.world")), c.getDouble("MiningTown.x"),c.getDouble("MiningTown.y"),c.getDouble("MiningTown.z")));
		Warp MurderLobby = new Warp(c.getInt("MurderLobby.invSlot"),Utils.createItem(c.getString("MurderLobby.materialString"), c.getInt("MurderLobby.amount"),
				c.getString("MurderLobby.displayName")),
				new Location(Bukkit.getWorld(c.getString("MurderLobby.world")), c.getDouble("MurderLobby.x"),c.getDouble("MurderLobby.y"),c.getDouble("MurderLobby.z")));
		Warp Tennis = new Warp(c.getInt("Tennis.invSlot"),Utils.createItem(c.getString("Tennis.materialString"), c.getInt("Tennis.amount"),
				c.getString("Tennis.displayName")),
				new Location(Bukkit.getWorld(c.getString("Tennis.world")), c.getDouble("Tennis.x"),c.getDouble("Tennis.y"),c.getDouble("Tennis.z")));
		
		Main.insert(Utils.chat(Games.getName()), Games);
		Main.insert(Utils.chat(Builds.getName()), Builds);
		Main.insert(Utils.chat(WIP.getName()), WIP);
		
		Main.insert(Utils.chat(Mansion.getName()), Mansion);
		Main.insert(Utils.chat(Monument.getName()), Monument);
		Main.insert(Utils.chat(Spaceship.getName()), Spaceship);
		Main.insert(Utils.chat(DesertRuins.getName()), DesertRuins);
		Main.insert(Utils.chat(Caves.getName()), Caves);
		Main.insert(Utils.chat(TheMines.getName()), TheMines);
		Main.insert(Utils.chat(PortTown.getName()), PortTown);
		Main.insert(Utils.chat(NetherRun.getName()), NetherRun);
		Main.insert(Utils.chat(CliffsideRun.getName()), CliffsideRun);
		Main.insert(Utils.chat(SpleefArena.getName()), SpleefArena);
		Main.insert(Utils.chat(ClassicArena.getName()), ClassicArena);
		Main.insert(Utils.chat(WinterCastle.getName()), WinterCastle);
		Main.insert(Utils.chat(Settlement.getName()), Settlement);
		Main.insert(Utils.chat(Cathedral.getName()), Cathedral);
		
		Main.insert(FortTown.getName(), FortTown);
		Main.insert(Flinnyville.getName(), Flinnyville);
		Main.insert(SimsTree.getName(), SimsTree);
		Main.insert(RedSandTemple.getName(), RedSandTemple);
		Main.insert(AnimalPen.getName(), AnimalPen);
		Main.insert(Wendys.getName(), Wendys);
		Main.insert(NoahHole.getName(), NoahHole);
		Main.insert(Normandy.getName(), Normandy);
		Main.insert(CorruptedVillage.getName(), CorruptedVillage);
		
		Main.insert(ObamaPagoda.getName(), ObamaPagoda);
		Main.insert(Zoo.getName(), Zoo);
		Main.insert(FarmingTown.getName(), FarmingTown);
		Main.insert(MiningTown.getName(), MiningTown);
		Main.insert(MurderLobby.getName(), MurderLobby);
		Main.insert(Tennis.getName(), Tennis);
	}
}
