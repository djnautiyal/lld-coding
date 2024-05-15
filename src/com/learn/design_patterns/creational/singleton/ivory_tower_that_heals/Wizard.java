package com.learn.design_patterns.creational.singleton.ivory_tower_that_heals;

public class Wizard {
    int hitPoints;

    Wizard(){
        hitPoints = 100;
    }
    void reduceHP(){
        hitPoints-=10;
        System.out.println("hp reduced to: " + hitPoints);
    }
    public void addHP(int i) {
        hitPoints+=i;
    }

    String getHP(){
        return Integer.toString(hitPoints);
    }


    public static void main(String[] args) {
        IvoryTower tower = IvoryTower.INSTANCE;

        Wizard wiz = new Wizard();
        wiz.reduceHP();
        wiz.reduceHP();
        wiz.reduceHP();
        wiz.reduceHP();
        wiz.reduceHP();

        tower.heal(wiz);
    }


}
