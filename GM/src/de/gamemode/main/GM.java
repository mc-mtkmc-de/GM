package de.gamemode.main;

import org.bukkit.plugin.java.JavaPlugin;

import de.gamemode.commands.GmAdventureCommand;
import de.gamemode.commands.GmCreativCommand;
import de.gamemode.commands.GmSpectatorCommand;
import de.gamemode.commands.GmSurvivalCommand;

public class GM extends JavaPlugin {
	
	private static GM plugin;
	
	public void onEnable() {
		plugin = this;
		
		getCommand("gm0").setExecutor(new GmSurvivalCommand());
		getCommand("gm1").setExecutor(new GmCreativCommand());
		getCommand("gm2").setExecutor(new GmAdventureCommand());
		getCommand("gm3").setExecutor(new GmSpectatorCommand());
		
	}
	
	public static GM getplugin() {
		return plugin;
	}

}
