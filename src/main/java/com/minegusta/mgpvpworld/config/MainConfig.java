package com.minegusta.mgpvpworld.config;

import com.minegusta.mgpvpworld.main.Main;
import org.bukkit.configuration.file.FileConfiguration;

public class MainConfig
{
    public static FileConfiguration getConfig()
    {
        return Main.getPlugin().getConfig();
    }

    public static void loadDefaultConfig()
    {
        Main.getPlugin().saveDefaultConfig();
        radius = getConfig().getInt("radius", 200);
        world = getConfig().getString("world", "pvpworld");
        seconds = getConfig().getInt("seconds-per-item", 10);
    }

    public static void saveConfig()
    {
        Main.getPlugin().saveConfig();
    }

    public static void reloadConfig()
    {
        Main.getPlugin().reloadConfig();
        radius = getConfig().getInt("radius", 200);
        world = getConfig().getString("world", "pvpworld");
        seconds = getConfig().getInt("seconds-per-item", 10);
    }

    //-- Methods --//

    private static int radius;
    private static int seconds;
    private static String world;

    public static int getRadius()
    {
        return radius;
    }

    public static int getSeconds()
    {
        return seconds;
    }

    public static String getWorld()
    {
        return world;
    }

}
