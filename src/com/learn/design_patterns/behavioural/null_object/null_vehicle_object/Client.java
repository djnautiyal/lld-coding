package com.learn.design_patterns.behavioural.null_object.null_vehicle_object;

public class Client {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicle("Car");
        System.out.println(vehicle.getTankCapacity());
        System.out.println(vehicle.getSeatingCapacity());

        vehicle = VehicleFactory.getVehicle("Truck");
        System.out.println(vehicle.getTankCapacity());
        System.out.println(vehicle.getSeatingCapacity());
    }
}
