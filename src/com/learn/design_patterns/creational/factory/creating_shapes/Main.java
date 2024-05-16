package com.learn.design_patterns.creational.factory.creating_shapes;

public class Main {
    public static void main(String[] args) {
        ShapeType type = ShapeType.RECTANGLE;
        Shape shape = Factory.createShape(type);
        System.out.println(shape.getDescription());

        type = ShapeType.CIRCLE;
        shape = Factory.createShape(type);
        System.out.println(shape.getDescription());
    }
}
