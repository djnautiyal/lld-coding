package com.learn.design_patterns.behavioural.strategy.dragon_slaying_strategies;

public class DragonSlayer {
    private DragonSlayingStrategy strategy;

    public DragonSlayer(DragonSlayingStrategy strategy) {
        this.strategy = strategy;
    }

    public void changeStrategy(DragonSlayingStrategy strategy) {
        this.strategy = strategy;
    }
    public void execute() {
        strategy.execute();
    }

    public void gotoBattle() {
        strategy.execute();
    }
}
