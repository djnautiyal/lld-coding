package com.learn.design_patterns.creational.factory.creating_shapes;

public class Factory {
    static Shape createShape(ShapeType type){
        return type.getConstructor().get();
    }
}
