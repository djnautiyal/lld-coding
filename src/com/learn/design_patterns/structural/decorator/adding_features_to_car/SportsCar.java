package com.learn.design_patterns.structural.decorator.adding_features_to_car;

public class SportsCar implements Car{
    Car car;
    public SportsCar(Car car) {
        this.car = car;
    }
    @Override
    public void assemble() {
        car.assemble();
        System.out.print(" Adding features to Sports Car.");
    }
}
