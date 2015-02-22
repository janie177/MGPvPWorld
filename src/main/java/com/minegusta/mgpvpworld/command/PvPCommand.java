package com.minegusta.mgpvpworld.command;

import com.minegusta.mgpvpworld.config.MainConfig;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class PvPCommand implements CommandExecutor
{

    @Override
    public boolean onCommand(CommandSender s, Command cmd, String label, String[] args)
    {
        if(!s.hasPermission("minegusta.pvptele") || s instanceof ConsoleCommandSender)
        {
            s.sendMessage(ChatColor.RED + "You do not have permission to teleport to the pvp world.");
            return true;
        }

        if(s instanceof Player)
        {
            Player p = (Player) s;
            p.teleport(Bukkit.getWorld(MainConfig.getWorld()).getSpawnLocation());
            p.sendMessage(ChatColor.YELLOW + "You teleported to the PVP world.");
        }

        return true;
    }
}
