package com.learn.design_patterns.behavioural.iterator.iterating_treasure_chest;

import java.util.Iterator;

public class TreasureChestItemIterator implements Iterator<Item> {
    TreasureChest chest;
    ItemType itemType;
    private int idx;

    public TreasureChestItemIterator(TreasureChest chest, ItemType itemType) {
        this.chest = chest;
        this.itemType = itemType;
        this.idx = -1;
    }

    @Override
    public boolean hasNext() {
        return findNextIdx() != -1;
    }

    @Override
    public Item next() {
        int nextIdx = findNextIdx();
        if(nextIdx == -1){
            return null;
        }
        idx = nextIdx;
        return chest.getItems().get(idx);
    }

    private int findNextIdx(){
        var items = chest.getItems();
        var tempIdx = idx==-1? 0 : idx+1;

        while(tempIdx < items.size()){
            if(items.get(tempIdx).getItemType() == itemType){
                return tempIdx;
            }
            tempIdx++;
        }
        return -1;
    }
}
