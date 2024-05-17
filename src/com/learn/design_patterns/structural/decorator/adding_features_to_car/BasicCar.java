package com.learn.design_patterns.structural.decorator.adding_features_to_car;

public class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.print("Basic car is assembled.");
    }
}
