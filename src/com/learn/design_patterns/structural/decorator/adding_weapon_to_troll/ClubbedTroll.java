package com.learn.design_patterns.structural.decorator.adding_weapon_to_troll;

public class ClubbedTroll implements Troll{
    private final Troll decoratedTroll;
    public ClubbedTroll(Troll decoratedTroll) {
        this.decoratedTroll = decoratedTroll;
    }
    @Override
    public void attack() {
        decoratedTroll.attack();
        System.out.println("The troll swings club at you!");
    }

    @Override
    public int getAttackPower() {
        return decoratedTroll.getAttackPower() + 5;
    }

    @Override
    public void flee() {
        decoratedTroll.flee();
        System.out.println("The horrified troll drops his club!");
    }
}
