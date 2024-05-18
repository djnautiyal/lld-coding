package com.learn.design_patterns.behavioural.state.mammoth_mood_swings;

public class Mammoth {

    private State state;

    public Mammoth() {
        state = new PeacefulState(this);
    }

    public void setState(State state) {
        this.state = state;
        state.onEnterState();
    }

    public void observe() {
        state.observe();
    }

    public void timePasses() {
        if (state.getClass().equals(PeacefulState.class)) {
            setState(new AngryState(this));
        } else if (state.getClass().equals(AngryState.class)) {
            setState(new ConfusedState(this));
        } else {
            setState(new PeacefulState(this));
        }
    }


    @Override
    public String toString() {
        return "The Mammoth";
    }

    public static void main(String[] args) {
        Mammoth mammoth = new Mammoth();
        for (int i = 0; i < 5; i++) {
            mammoth.timePasses();
            mammoth.observe();
        }
    }
}
