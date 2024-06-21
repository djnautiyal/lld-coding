package com.learn.design_patterns.structural.decorator.pizza_and_toppings;

public class MushroomTopping implements Pizza {
    Pizza pizza;

    public MushroomTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost() {
        return 15 + pizza.cost();
    }
}

class ExtraCheeseTopping implements Pizza {
    Pizza pizza;
    public ExtraCheeseTopping(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public int cost() {
        return 50+pizza.cost();
    }
}