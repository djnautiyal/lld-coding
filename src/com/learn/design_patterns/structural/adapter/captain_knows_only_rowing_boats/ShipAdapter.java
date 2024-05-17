package com.learn.design_patterns.structural.adapter.captain_knows_only_rowing_boats;

/*
This class adapts a Boat to be used as a Ship.
Captain knows only to sail a boat, but he's given charge of steam ship.

The ShipAdapter class adapts a Boat to be used as a Ship so that the Captain can sail the boat as if it were a ship.
The ShipAdapter class bridges the gap between the Boat interface (sailing) and the Ship interface (steaming)
allowing the Captain to interact with the boat as if it were a ship.
*/
public class ShipAdapter implements Ship {
    private final Boat boat;

    public ShipAdapter() {
        this.boat = new Boat();
    }

    @Override
    public void steam() {
        boat.sail();
    }

    public static void main(String[] args) {
        System.out.println("Pirates are coming! Steam the ship away!");
        var captain = new Captain(new ShipAdapter());
        captain.order();
    }
}
