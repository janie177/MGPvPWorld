package com.minegusta.mgpvpworld.tasks;

import com.minegusta.mgpvpworld.Util.Randoms;
import com.minegusta.mgpvpworld.config.MainConfig;
import com.minegusta.mgpvpworld.drops.DropList;
import com.minegusta.mgpvpworld.main.Main;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;

public class RandomLootTask
{
    private static int ID = -1;
    private final static int radius = MainConfig.getRadius();
    private static final int seconds = MainConfig.getSeconds();
    private final static Location center = Bukkit.getWorld(MainConfig.getWorld()).getSpawnLocation();

    public static void start()
    {
        ID = Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.getPlugin(), new Runnable() {
            @Override
            public void run()
            {
                runTask();
            }
        },20 * seconds, 20 * seconds);
    }

    public static void stop()
    {
        if(ID != -1)Bukkit.getScheduler().cancelTask(ID);
    }

    //Randomly spawning loot
    private static void runTask()
    {
        int x = Randoms.randomNumber(2*radius)-radius;
        int z = Randoms.randomNumber(2*radius)-radius;

        Location dropSpot = new Location(center.getWorld(), center.getX() + (double) x, 200, center.getZ() + (double) z);

        if(Bukkit.getWorld(MainConfig.getWorld()).getPlayers().size() < 1)return;

        if(!dropSpot.getChunk().isLoaded())return;

        ItemStack dropped = DropList.valueOf("I" + Integer.toString(Randoms.randomNumber(DropList.values().length))).get();

        center.getWorld().dropItemNaturally(dropSpot, dropped);
    }
}
