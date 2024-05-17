package com.learn.design_patterns.structural.bridge.shapes_with_colours;

public interface Colour {

    void apply();
}

class RedColour implements Colour {

    @Override
    public void apply() {
        System.out.print("Red Colour");
    }
}

class BlueColour implements Colour {

    @Override
    public void apply() {
        System.out.print("Blue Colour");

    }
}
