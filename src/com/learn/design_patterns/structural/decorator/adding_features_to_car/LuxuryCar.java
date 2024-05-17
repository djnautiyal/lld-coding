package com.learn.design_patterns.structural.decorator.adding_features_to_car;

public class LuxuryCar implements Car{

    Car car;

    public LuxuryCar(Car car) {
        this.car = car;
    }
    @Override
    public void assemble() {
        car.assemble();
        System.out.print(" Adding features of Luxury Car.");
    }
}
