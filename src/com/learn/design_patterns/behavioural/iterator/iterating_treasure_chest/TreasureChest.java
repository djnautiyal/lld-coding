package com.learn.design_patterns.behavioural.iterator.iterating_treasure_chest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TreasureChest {
    private final List<Item> items;

    public TreasureChest() {
        this.items = List.of(
            new Item(ItemType.WEAPON, "Excalibur Sword"),
            new Item(ItemType.ARMOR, "SteelShield"),
            new Item(ItemType.POTION, "Blood Potion"),
            new Item(ItemType.SCROLL, "Scroll"),
            new Item(ItemType.RING, "Elden Ring"),
            new Item(ItemType.WEAPON, "Necromancy Sword"),
            new Item(ItemType.ARMOR, "Leather Shield"),
            new Item(ItemType.POTION, "Healing Potion"),
            new Item(ItemType.SCROLL, "Revivify Scroll"),
            new Item(ItemType.RING, "Armor Ring")
        );
    }

    public Iterator<Item> iterator(ItemType itemType) {
        return new TreasureChestItemIterator(this, itemType);
    }

    public List<Item> getItems() {
        return new ArrayList<>(items);
    }
}
