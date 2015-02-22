package com.minegusta.mgpvpworld.Util;

import java.util.Random;

public class Randoms
{
    private static Random rand = new Random();

    public static boolean chance(int percentage)
    {
        return rand.nextInt(100) + 1 <= percentage;
    }

    public static boolean fiftyfifty()
    {
        return rand.nextBoolean();
    }

    public static int randomNumber(int max)
    {
        return rand.nextInt(max) + 1;
    }
}
