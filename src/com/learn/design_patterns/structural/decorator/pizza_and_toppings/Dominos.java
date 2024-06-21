package com.learn.design_patterns.structural.decorator.pizza_and_toppings;

public class Dominos {
    public static void main(String[] args) {
        Pizza order1 = new ExtraCheeseTopping(new Marghertia());
        System.out.println("Margherita with Extra Cheese topping: " + order1.cost());

        Pizza order2 = new MushroomTopping(new ExtraCheeseTopping(new Marghertia()));
        System.out.println("Margherita with Mushroom topping and Extra Cheese topping: " + order2.cost());

        Pizza order3 = new MushroomTopping(new ExtraCheeseTopping(new Cloud9()));
        System.out.println("Cloud9 with Mushroom topping and Extra Cheese topping: " + order3.cost());

        Pizza order4 = new ExtraCheeseTopping(new Cloud9());
        System.out.println("Cloud9 with Extra Cheese topping: " + order4.cost());

    }
}
