package com.learn.design_patterns.behavioural.command.wizard_casts_spells_magic_on_goblin;

public enum Size{
    NORMAL("Normal"), SMALL("Small");

    private final String name;

    Size(String name){ this.name = name; }
    @Override
    public String toString(){ return name; }
}
