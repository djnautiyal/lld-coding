package com.learn.design_patterns.behavioural.command.wizard_casts_spells_magic_on_goblin;

public class Goblin extends Target{
    public Goblin(){
        setSize(Size.NORMAL);
        setVisibility(Visibility.VISIBLE);
    }

    @Override
    public String toString() {
        return "Goblin";
    }

    public void changeSize(){
        var newSize = getSize() ==Size.NORMAL ? Size.SMALL : Size.NORMAL;
        setSize(newSize);
    }

    public void changeVisibility(){
        var newVis = getVisibility() == Visibility.INVISIBLE ? Visibility.VISIBLE : Visibility.INVISIBLE;
        setVisibility(newVis);
    }
}
