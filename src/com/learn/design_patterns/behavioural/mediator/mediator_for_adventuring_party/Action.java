package com.learn.design_patterns.behavioural.mediator.mediator_for_adventuring_party;

public enum Action {
    TELL_TALE("tells a tale"),
    SPOT_ENEMY("spots an enemy"),
    FIND_GOLD("finds gold"),
    HUNT_FOOD("hunts for food");

    private final String action;
    Action(String action){
        this.action = action;
    }

    public String getDescription(){
        return switch (this) {
            case TELL_TALE -> "sits down comfortably and listens";
            case SPOT_ENEMY -> "sets a trap and roll initiative";
            case FIND_GOLD -> " digs and take his share of gold";
            case HUNT_FOOD -> "helps in cooking the dinner";
        };
    }

    @Override
    public String toString() {
        return action;
    }
}
