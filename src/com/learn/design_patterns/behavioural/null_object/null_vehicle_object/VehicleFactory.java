package com.learn.design_patterns.behavioural.null_object.null_vehicle_object;

public class VehicleFactory {

    public static Vehicle getVehicle(String vehicleType) {
        if(vehicleType.equals("Car")) {
            return new Car();
        }
        return new NullVehicle();
    }
}
