package com.minegusta.mgpvpworld.main;

import com.minegusta.mgpvpworld.command.ReloadCommand;
import com.minegusta.mgpvpworld.config.MainConfig;
import com.minegusta.mgpvpworld.listener.PvpListener;
import com.minegusta.mgpvpworld.tasks.RandomLootTask;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{

    private static Plugin PLUGIN;
    @Override
    public void onEnable()
    {
        PLUGIN = this;

        //Load config
        MainConfig.loadDefaultConfig();

        //Load listeners
        Bukkit.getPluginManager().registerEvents(new PvpListener(), this);

        //Start tasks
        RandomLootTask.start();

        //Commands
        getCommand("pvpreload").setExecutor(new ReloadCommand());
    }

    @Override
    public void onDisable()
    {
        //Stop tasks
        RandomLootTask.stop();

    }

    public static Plugin getPlugin()
    {
        return PLUGIN;
    }
}
