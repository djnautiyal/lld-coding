package com.learn.design_patterns.behavioural.state.mammoth_mood_swings;

public interface State {
    void onEnterState();
    void observe();
}

class PeacefulState implements State {
    public final Mammoth mammoth;

    PeacefulState(Mammoth mammoth) {
        this.mammoth = mammoth;
    }
    @Override
    public void onEnterState() {
        System.out.println(mammoth + " calms down!");
    }

    @Override
    public void observe() {
        System.out.println(mammoth + " is calm and peaceful.");
    }
}

class ConfusedState implements State {
    public final Mammoth mammoth;

    ConfusedState(Mammoth mammoth) {
        this.mammoth = mammoth;
    }
    @Override
    public void onEnterState() {
        System.out.println(mammoth + " is confused!");
    }

    @Override
    public void observe() {
        System.out.println(mammoth + " is in deep thought.");
    }
}

class AngryState implements State {
    public final Mammoth mammoth;

    AngryState(Mammoth mammoth) {
        this.mammoth = mammoth;
    }
    @Override
    public void onEnterState() {
        System.out.println(mammoth + " gets angry!");
    }
    @Override
    public void observe() {
        System.out.println(mammoth + " is furious.");
    }
}