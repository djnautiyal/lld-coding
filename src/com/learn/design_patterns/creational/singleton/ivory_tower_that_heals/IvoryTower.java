package com.learn.design_patterns.creational.singleton.ivory_tower_that_heals;

public enum IvoryTower {

    INSTANCE;

    private final String name;

    IvoryTower() {
        this.name = "Ivory Tower";
    }

    public void heal(Wizard wizard){
        wizard.addHP(20);
        System.out.println(name + " has healed you for" + 20 + "HP! Your HP now is " + wizard.getHP());

    }
}
