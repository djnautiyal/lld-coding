package com.learn.design_patterns.behavioural.command.wizard_casts_spells_magic_on_goblin;

public enum Visibility {
    VISIBLE("Visible"), INVISIBLE("Invisible");

    private final String name;

    Visibility(String name){ this.name = name; }
    @Override
    public String toString(){ return name; }
}
