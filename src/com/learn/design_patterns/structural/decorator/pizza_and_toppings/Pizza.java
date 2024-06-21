package com.learn.design_patterns.structural.decorator.pizza_and_toppings;

public interface Pizza {
    int cost();
}
class Marghertia implements Pizza {
    @Override
    public int cost() {
        return 100;
    }
}
class Cloud9 implements Pizza {
    @Override
    public int cost() {
        return 200;
    }
}