package com.learn.design_patterns.structural.facade.dwarves_mine_gold;

public class GreedyCorporation {
    public static void main(String[] args) {
        DwarvenGoldMineFacade goldMineFacade = new DwarvenGoldMineFacade();
        goldMineFacade.startNewDay();
        System.out.println();

        goldMineFacade.digOutGold();
        System.out.println();

        goldMineFacade.endDay();
        System.out.println();
    }
}
