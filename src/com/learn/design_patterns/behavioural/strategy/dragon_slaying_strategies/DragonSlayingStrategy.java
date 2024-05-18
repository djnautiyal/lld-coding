package com.learn.design_patterns.behavioural.strategy.dragon_slaying_strategies;

public interface DragonSlayingStrategy {
    void execute();
}

class MeleeStrategy implements DragonSlayingStrategy {
    @Override
    public void execute() {
        System.out.println("Using Excalibur to sever the dragon's head and blood is everywhere.");
    }
}

class ProjectileStrategy implements DragonSlayingStrategy {
    @Override
    public void execute() {
        System.out.println("Shoot the dragon with magical crossbow and it falls dead.");
    }
}

class SpellStrategy implements DragonSlayingStrategy {
    @Override
    public void execute() {
        System.out.println("Cast Disintegration spell on the dragon and it vaporizes away.");
    }
}
