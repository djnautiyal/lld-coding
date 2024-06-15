package com.learn.design_patterns.behavioural.strategy.car_with_drive_strategy;

public class Car {
    DrivingType drivingType;

    Car(DrivingType drivingType){
        this.drivingType = drivingType;
    }

    void drive(){
        drivingType.drive();
    }
}

class ManualCar extends Car{
    ManualCar(){ super(DrivingType.Manual);}
}

class AutomaticCar extends Car{
    AutomaticCar(){ super(DrivingType.Automatic);}
}

class HybridCar extends Car{
    HybridCar(){ super(DrivingType.Hybrid);}
}