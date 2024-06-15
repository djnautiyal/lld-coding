package com.learn.design_patterns.behavioural.strategy.car_with_drive_strategy;

public interface DrivingStrategy {
    void drive();
}

enum DrivingType implements DrivingStrategy {
    Manual(() -> System.out.println("Driving the car in Manual")),
    Automatic(() -> System.out.println("Driving the car on Automatic")),
    Hybrid(() -> System.out.println("Driving the car on Hybrid"));


    private final DrivingStrategy drivingStrategy;

    DrivingType(DrivingStrategy drivingStrategy){
        this.drivingStrategy = drivingStrategy;
    }

    @Override
    public void drive() {
        drivingStrategy.drive();
    }

}
