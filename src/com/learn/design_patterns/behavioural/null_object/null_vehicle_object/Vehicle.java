package com.learn.design_patterns.behavioural.null_object.null_vehicle_object;

public interface Vehicle {
    int getTankCapacity();
    int getSeatingCapacity();
}

class Car implements Vehicle {
    @Override
    public int getTankCapacity() {
        return 40;
    }

    @Override
    public int getSeatingCapacity() {
        return 5;
    }
}

class NullVehicle implements Vehicle {
    @Override
    public int getTankCapacity() {
        return 0;
    }

    @Override
    public int getSeatingCapacity() {
        return 0;
    }
}