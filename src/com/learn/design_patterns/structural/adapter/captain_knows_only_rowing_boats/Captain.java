package com.learn.design_patterns.structural.adapter.captain_knows_only_rowing_boats;

public class Captain {
    private final Ship ship;

    public Captain(Ship ship) {
        this.ship = ship;
    }

    public void order() {
        System.out.println("Captain is giving order.");
        ship.steam();
    }
}
