package com.learn.design_patterns.behavioural.strategy.payment_strategies_lambda;

import java.util.List;

public class ShoppingCart {
    public static void main(String[] args) {

        List<Item> cart = List.of(new Item(10), new Item(20), new Item(30));

        cart.forEach(item -> PaymentType.CASH.pay(item.getPrice()));

        cart = List.of(new Item(40), new Item(50), new Item(60));

        cart.forEach(item -> PaymentType.CREDIT_CARD.pay(item.getPrice()));

        cart = List.of(new Item(70), new Item(80), new Item(90));

        cart.forEach(item -> PaymentType.UPI.pay(item.getPrice()));
    }
}
