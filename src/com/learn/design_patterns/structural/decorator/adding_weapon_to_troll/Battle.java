package com.learn.design_patterns.structural.decorator.adding_weapon_to_troll;

public class Battle {
    public static void main(String[] args) {
        var troll = new SimpleTroll();
        troll.attack();
        System.out.println("Troll hit you for: " + troll.getAttackPower());
        troll.flee();

        var clubbedTroll = new ClubbedTroll(troll);
        clubbedTroll.attack();
        System.out.println("Troll hit you for: " + clubbedTroll.getAttackPower());
        clubbedTroll.flee();

    }
}
