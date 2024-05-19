package com.learn.design_patterns.structural.facade.dwarves_mine_gold;

public class DwarvenGoldDigger extends DwarvenMineWorker {
    @Override
    public void work() {
        System.out.println(name() +" digs gold.");
    }

    @Override
    public String name() {
        return "Dwarven gold digger";
    }
}
