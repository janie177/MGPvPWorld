package com.minegusta.mgpvpworld.drops;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

public enum DropList
{
    //Material, Amount, Datavalue
    I1(Material.ANVIL, 1, 0),
    I2(Material.DIAMOND_SWORD, 1, 0, Enchantment.DAMAGE_ALL, 1),
    I3(Material.ENDER_CHEST, 1, 0),
    I4(Material.EMERALD, 3, 0),
    I5(Material.EMERALD_BLOCK, 1, 0),
    I6(Material.DIAMOND, 1, 0),
    I7(Material.GOLDEN_APPLE, 1, 0),
    I8(Material.GOLDEN_APPLE, 1, 1),
    I9(Material.CAULDRON_ITEM, 1, 0),
    I10(Material.IRON_INGOT, 4, 0),
    I11(Material.IRON_INGOT, 2, 0),
    I12(Material.STICK, 3, 0),
    I13(Material.DIRT, 5, 0),
    I14(Material.QUARTZ, 3, 0),
    I15(Material.GOLD_INGOT, 3, 0),
    I16(Material.GOLD_BLOCK, 1, 0),
    I17(Material.DIAMOND_BLOCK, 1, 0),
    I18(Material.ARMOR_STAND, 1, 0),
    I19(Material.POTATO_ITEM, 3, 0),
    I20(Material.COOKIE, 3, 0),
    I21(Material.POTION, 1, 8233),
    I22(Material.POTION, 1, 8290),
    I23(Material.POTION, 1, 8235),
    I24(Material.POTION, 1, 16462),
    I25(Material.POTION, 1, 8229),
    I26(Material.COAL, 4, 0),
    I27(Material.WOOD, 15, 0),
    I28(Material.SIGN, 1, 0),
    I29(Material.ENCHANTMENT_TABLE, 1, 0),
    I30(Material.LOG, 15, 0),
    I31(Material.SUGAR_CANE, 4, 0),
    I32(Material.SUGAR, 5, 0),
    I33(Material.SPIDER_EYE, 2, 0),
    I34(Material.BONE, 3, 0),
    I35(Material.GOLD_NUGGET, 3, 0),
    I36(Material.BLAZE_ROD, 1, 0),
    I37(Material.GHAST_TEAR, 2, 0),
    I38(Material.ARROW, 10, 0),
    I39(Material.BOW, 1, 0, Enchantment.ARROW_INFINITE, 1),
    I40(Material.DIAMOND_PICKAXE, 1, 0, Enchantment.DIG_SPEED, 2),
    I41(Material.IRON_BLOCK, 1, 0),
    I42(Material.DIAMOND_AXE, 1, 0),
    I43(Material.DIAMOND_SPADE, 1, 0),
    I44(Material.DIAMOND_BARDING, 1, 0),
    I45(Material.DIAMOND_HOE, 1, 0),
    I46(Material.DIAMOND_PICKAXE, 1, 0),
    I47(Material.IRON_PICKAXE, 1, 0),
    I48(Material.IRON_SWORD, 1 , 0),
    I49(Material.IRON_AXE, 1, 0),
    I50(Material.IRON_SPADE, 1, 0),
    I51(Material.IRON_HELMET, 1, 0),
    I52(Material.IRON_LEGGINGS, 1, 0),
    I53(Material.IRON_CHESTPLATE, 1, 0),
    I54(Material.IRON_DOOR, 1, 0),
    I55(Material.ENDER_PEARL, 1, 0),
    I56(Material.MELON, 1, 0),
    I57(Material.WOOL, 5, 0),
    I58(Material.BREWING_STAND_ITEM, 1, 0),
    I59(Material.BOWL, 1, 0),
    I60(Material.BREAD, 1, 0),
    I61(Material.WOOD_SWORD, 1, 0),
    I62(Material.WOOD_HOE, 1, 0, Enchantment.DAMAGE_ALL, 4),
    I63(Material.DARK_OAK_FENCE_GATE, 1, 0);






    private Material mat;
    private int amount;
    private int datavalue;
    private int enchantmentLevel = 0;
    private Enchantment ench = null;

    private DropList(Material mat, int amount, int datavalue)
    {
        this.mat = mat;
        this.amount = amount;
        this.datavalue = datavalue;
    }

    private DropList(Material mat, int amount, int datavalue, Enchantment ench, int enchantmentLevel)
    {
        this.mat = mat;
        this.amount = amount;
        this.datavalue = datavalue;
        this.ench = ench;
        this.enchantmentLevel = enchantmentLevel;
    }

    public ItemStack get()
    {
        ItemStack stack = new ItemStack(mat, amount, (byte)datavalue);
        if(ench != null)
        {
            stack.addUnsafeEnchantment(ench, enchantmentLevel);
        }
        return stack;
    }
}
