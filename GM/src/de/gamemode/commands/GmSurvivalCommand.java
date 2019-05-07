package de.gamemode.commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import org.bukkit.entity.Player;

public class GmSurvivalCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			if(player.hasPermission("gm.gm0")) {
				if(args.length == 0) {
					
					player.setGameMode(GameMode.SURVIVAL);
					
					player.sendMessage("ßcDu befindest dich jetzt im ßbßl‹berlebensmodusßc!");
					
				} else
					player.sendMessage("ßcBitte benutze ß6/gm0 ßc!");
			} else
				player.sendMessage("ßcDazu hast du keine Rechte!");
		}

		return false;
	}


}
