package com.learn.design_patterns.behavioural.command.ac_remote;

public class AirConditioner {

    public void turnOn() {
        System.out.println("AirConditioner is on");
    }

    public void turnOff() {
        System.out.println("AirConditioner is off");
    }

    public void setTemperature(int temperature) {
        System.out.println("AirConditioner temperature set to " + temperature);
    }
}
