package com.learn.design_patterns.structural.decorator.adding_weapon_to_troll;

class SimpleTroll implements Troll {

    @Override
    public void attack() {
        System.out.println("The Troll tries to grab you!");
    }

    @Override
    public int getAttackPower() {
        return 10;
    }

    @Override
    public void flee() {
        System.out.println("The Troll shrieks in horror and runs away!");
    }
}
