package com.learn.design_patterns.structural.facade.dwarves_mine_gold;

public class DwarvenCartOperator extends DwarvenMineWorker {
    @Override
    public void work() {
        System.out.println(name() +" moves cart filled with gold.");
    }

    @Override
    public String name() {
        return "Dwarven cart operator";
    }
}
