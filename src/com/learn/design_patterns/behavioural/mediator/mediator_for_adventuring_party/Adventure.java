package com.learn.design_patterns.behavioural.mediator.mediator_for_adventuring_party;

public class Adventure {
    public static void main(String[] args) {
        Party party = new Party();
        Hobbit hobbit = new Hobbit();
        party.join(hobbit);
        Rogue rogue = new Rogue();
        party.join(rogue);
        Wizard wizard = new Wizard();
        party.join(wizard);
        Hunter hunter = new Hunter();
        party.join(hunter);

        rogue.act(Action.SPOT_ENEMY);
        System.out.println();

        hobbit.act(Action.FIND_GOLD);
        System.out.println();

        hunter.act(Action.HUNT_FOOD);
        System.out.println();

        wizard.act(Action.TELL_TALE);
    }
}
