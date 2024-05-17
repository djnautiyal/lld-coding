package com.learn.design_patterns.structural.bridge.shapes_with_colours;

public class Drawing {
    public static void main(String[] args) {
        Shape circle = new Circle(new RedColour());
        circle.describe();
        Shape rectangle = new Rectangle(new BlueColour());
        rectangle.describe();

        circle = new Circle(new BlueColour());
        circle.describe();
        rectangle = new Rectangle(new RedColour());
        rectangle.describe();
    }
}
