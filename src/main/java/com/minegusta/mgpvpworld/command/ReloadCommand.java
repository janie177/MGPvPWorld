package com.minegusta.mgpvpworld.command;

import com.minegusta.mgpvpworld.config.MainConfig;
import com.minegusta.mgpvpworld.tasks.RandomLootTask;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ReloadCommand implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings)
    {
        if(commandSender.isOp())
        {
            MainConfig.reloadConfig();
            RandomLootTask.stop();
            RandomLootTask.start();
            commandSender.sendMessage(ChatColor.GREEN + " Reloaded MGPvPWorld.");

        }
        else
        {
            commandSender.sendMessage(ChatColor.RED + "You have to be op to do that you noob.");
        }
        return true;
    }
}
