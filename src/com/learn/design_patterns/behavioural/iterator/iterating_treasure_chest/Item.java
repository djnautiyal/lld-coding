package com.learn.design_patterns.behavioural.iterator.iterating_treasure_chest;

public class Item {
    private final ItemType itemType;
    private final String name;

    public Item(ItemType itemType, String name) {
        this.itemType = itemType;
        this.name = name;
    }

    public ItemType getItemType() {
        return itemType;
    }

    @Override
    public String toString() {
        return name;
    }
}


