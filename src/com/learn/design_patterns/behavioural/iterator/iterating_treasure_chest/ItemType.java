package com.learn.design_patterns.behavioural.iterator.iterating_treasure_chest;

public enum ItemType{
    WEAPON("Weapon"),
    ARMOR("Armor"),
    POTION("Potion"),
    SCROLL("Scroll"),
    RING("Ring");

    private final String name;

    ItemType(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}
