package com.learn.design_patterns.structural.facade.dwarves_mine_gold;

public class DwarvenTunnelDigger extends DwarvenMineWorker {
    @Override
    public void work() {
        System.out.println(name() +" digs another tunnel.");
    }

    @Override
    public String name() {
        return "Dwarven tunnel digger";
    }
}