package de.gamemode.commands;

import org.bukkit.Bukkit;
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
					
				}else if(player.hasPermission("gm.gm0.other")) {
					if(args.length == 1) {
						Player target = Bukkit.getPlayer(args[0]);
						if(target != null) {
							
							target.setGameMode(GameMode.SURVIVAL);
							target.sendMessage("ßcDu wurdest in den ßbßl‹berlebensmodus ßcgesetzt!");
							player.sendMessage("ßcDu hast den Spieler ß6" + target.getName() + " in den ßbßl‹berlebensmodus ßcgesetzt!");
						}else
							player.sendMessage("ßcDer Spieler ß6" + args[0] + "ßc ist nicht auf dem Server.");
					}
				}
					
				 
			} else
				player.sendMessage("ßcDazu hast du keine Rechte!");
		}

		return false;
	}

}

