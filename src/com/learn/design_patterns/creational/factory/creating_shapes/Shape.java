package com.learn.design_patterns.creational.factory.creating_shapes;

public interface Shape {

    String getDescription();
}

class Circle implements Shape {
    @Override
    public String getDescription() {
        return "This is a circle";
    }
}

class Rectangle implements Shape {
    @Override
    public String getDescription() {
        return "This is a rectangle";
    }
}
