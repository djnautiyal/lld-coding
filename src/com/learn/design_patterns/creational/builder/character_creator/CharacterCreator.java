package com.learn.design_patterns.creational.builder.character_creator;

public class CharacterCreator {
    public static void main(String[] args) {

        Hero hero = new Hero.Builder()
                .name("Gimli")
                .weapon(Weapon.SWORD)
                .armour(Armour.CLOTHES)
                .hairType(HairType.SHORT)
                .hairColour(HairColour.BROWN)
                .build();
        System.out.println(hero);

        hero = new Hero.Builder()
                .name("Frodo")
                .build();
        System.out.println(hero);

        hero = new Hero.Builder()
                .name("Gandalf")
                .weapon(Weapon.MACE)
                .build();
        System.out.println(hero);

        hero = new Hero.Builder()
                .name("Legolas")
                .weapon(Weapon.BOW)
                .build();
        System.out.println(hero);
    }
}
