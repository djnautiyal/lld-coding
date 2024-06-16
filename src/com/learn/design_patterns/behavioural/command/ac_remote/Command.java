package com.learn.design_patterns.behavioural.command.ac_remote;

public interface Command {
    public void execute();
    public void undo();
}

class TurnOnCommand implements Command {
    AirConditioner airConditioner;
    TurnOnCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }
    @Override
    public void execute() {
        airConditioner.turnOn();
    }

    @Override
    public void undo() {
        airConditioner.turnOff();
    }
}

class TurnOffCommand implements Command {
    AirConditioner airConditioner;
    TurnOffCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }
    @Override
    public void execute() {
        airConditioner.turnOff();
    }

    @Override
    public void undo() {
        airConditioner.turnOn();
    }
}