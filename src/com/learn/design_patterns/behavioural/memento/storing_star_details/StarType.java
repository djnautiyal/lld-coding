package com.learn.design_patterns.behavioural.memento.storing_star_details;

public enum StarType {
    SUN("Sun"),
    RED_GIANT("Red giant"),
    WHITE_DWARF("White dwarf"),
    SUPERNOVA("Supernova"),
    DEAD_STAR("Dead star");

    private final String sun;

    StarType(String sun) {
        this.sun = sun;
    }
}
