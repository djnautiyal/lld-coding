package com.learn.design_patterns.behavioural.command.ac_remote;

public class Client {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        ACRemote acRemote = new ACRemote(airConditioner);
        acRemote.executeCommand(new TurnOnCommand(airConditioner));
        acRemote.executeCommand(new TurnOffCommand(airConditioner));
        acRemote.undo();
        acRemote.undo();
    }
}
