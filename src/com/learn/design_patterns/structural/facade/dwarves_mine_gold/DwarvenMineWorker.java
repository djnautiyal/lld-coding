package com.learn.design_patterns.structural.facade.dwarves_mine_gold;

import java.util.Arrays;

public abstract class DwarvenMineWorker {
    public void gotoSleep(){
        System.out.println(name() + " goes to sleep");
    }

    public void wakeUp(){
        System.out.println(name() + " wakes up.");
    }

    public void goToMine(){
        System.out.println(name() + " goes to mine.");
    }

    public void goHome(){
        System.out.println(name() + " goes home.");
    }

    private void action(Action action){
        switch (action) {
            case WAKE_UP -> wakeUp();
            case GO_TO_SLEEP -> gotoSleep();
            case GO_TO_MINE -> goToMine();
            case WORK -> work();
            case GO_HOME -> goHome();
        }
    }

    public void action(Action... actions){
        Arrays.stream(actions).forEach(this::action);
    }

    public abstract void work();

    public abstract String name();

    public enum Action {
        GO_HOME, GO_TO_MINE, GO_TO_SLEEP, WAKE_UP, WORK
    }
}
