package com.athena.commands;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class Heal implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String [] strings) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use this command!");
            return true;
        }
        Player player = (Player) sender;
        player.setHealth(20.0d);
        return true;
    }
}
