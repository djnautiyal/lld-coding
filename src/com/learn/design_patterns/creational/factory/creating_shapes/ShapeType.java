package com.learn.design_patterns.creational.factory.creating_shapes;

import java.util.function.Supplier;

public enum ShapeType {
    CIRCLE(() -> new Circle()),
    RECTANGLE(() -> new Rectangle());

    private final Supplier<Shape> constructor;

    ShapeType(Supplier<Shape> constructor){
        this.constructor = constructor;
    }

    Supplier<Shape> getConstructor(){
        return constructor;
    }
}
