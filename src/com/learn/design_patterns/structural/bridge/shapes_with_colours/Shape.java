package com.learn.design_patterns.structural.bridge.shapes_with_colours;

public interface Shape {
    void describe();
    Colour getColour();
}

class Circle implements Shape {
    private final Colour colour;

    public Circle(Colour colour){
        this.colour = colour;
    }

    @Override
    public void describe() {
        System.out.print("A Circle shape with ");
        getColour().apply();
        System.out.println();
    }

    @Override
    public Colour getColour() {
        return colour;
    }
}

class Rectangle implements Shape {
    private final Colour colour;

    public Rectangle(Colour colour){
        this.colour = colour;
    }

    @Override
    public void describe() {
        System.out.print("A Rectangle shape with ");
        getColour().apply();
        System.out.println();
    }

    @Override
    public Colour getColour() {
        return colour;
    }
}
