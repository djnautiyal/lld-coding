package com.learn.design_patterns.structural.bridge.weapon_enchantment;

public class TreasureChest {
    public static void main(String[] args) {
        System.out.println("The knight receives an enchanted sword!");
        Weapon sword = new Sword(new FlyingEnchantment());
        sword.wield();
        sword.attack();
        sword.unwield();

        System.out.println("\nThe valkyrie receives an enchanted hammer!");
        Weapon hammer = new Hammer(new FlyingEnchantment());
        hammer.wield();
        hammer.attack();
        hammer.unwield();

        System.out.println("\nThe rougue receives an enchanted sword!");
        sword = new Sword(new SoulEatingEnchantment());
        sword.wield();
        sword.attack();
        sword.unwield();

        System.out.println("\nThe dwarf receives an enchanted hammer!");
        hammer = new Hammer(new SoulEatingEnchantment());
        hammer.wield();
        hammer.attack();
        hammer.unwield();
    }
}
