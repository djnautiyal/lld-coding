package com.learn.design_patterns.structural.decorator.adding_features_to_car;

public class Mechanic {
    public static void main(String[] args) {
        Car car = new BasicCar();
        car = new SportsCar(car);
        car = new LuxuryCar(car);
        car.assemble();
        System.out.println();

        car = new BasicCar();
        car = new LuxuryCar(car);
        car.assemble();
        System.out.println();

        car = new BasicCar();
        car = new SportsCar(car);
        car.assemble();
    }
}
