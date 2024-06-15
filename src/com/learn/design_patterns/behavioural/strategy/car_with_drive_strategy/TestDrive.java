package com.learn.design_patterns.behavioural.strategy.car_with_drive_strategy;

public class TestDrive {
    public static void main(String[] args) {
        Car car1 = new AutomaticCar();
        car1.drive();

        Car car2 = new ManualCar();
        car2.drive();

        Car car3 = new HybridCar();
        car3.drive();
    }
}
