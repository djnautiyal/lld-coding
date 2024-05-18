package com.learn.design_patterns.behavioural.iterator.iterating_treasure_chest;

import java.util.Iterator;

public class WarSpoils {
    public static void main(String[] args) {

        var weaponIterator = new TreasureChest().iterator(ItemType.WEAPON);

        while(weaponIterator.hasNext()){
            System.out.println(weaponIterator.next());
        }
        System.out.println();

        var armorIterator = new TreasureChest().iterator(ItemType.ARMOR);

        while(armorIterator.hasNext()){
            System.out.println(armorIterator.next());
        }
        System.out.println();

        var potionIterator = new TreasureChest().iterator(ItemType.POTION);

        while(potionIterator.hasNext()){
            System.out.println(potionIterator.next());
        }
        System.out.println();

        var scrollIterator = new TreasureChest().iterator(ItemType.SCROLL);

        while(scrollIterator.hasNext()){
            System.out.println(scrollIterator.next());
        }
        System.out.println();

        var ringIterator = new TreasureChest().iterator(ItemType.RING);

        while(ringIterator.hasNext()){
            System.out.println(ringIterator.next());
        }
        System.out.println();

    }

}
