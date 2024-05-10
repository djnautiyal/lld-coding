package com.learn.design_patterns.behavioural.command.wizard_casts_spells_magic_on_goblin;

public abstract class Target {
    private Size size;
    private Visibility visibility;

    public Size getSize(){ return size; }
    public void setSize(Size size){ this.size = size; }

    public Visibility getVisibility(){ return visibility; }
    public void setVisibility(Visibility visibility){ this.visibility=visibility; }

    @Override
    public abstract String toString();

    public void printStatus(){
        System.out.format("%s : [size=%s] [visibility=%s]\n", this, getSize(), getVisibility());
    }
}
