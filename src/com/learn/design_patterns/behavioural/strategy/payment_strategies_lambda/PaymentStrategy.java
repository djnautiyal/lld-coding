package com.learn.design_patterns.behavioural.strategy.payment_strategies_lambda;

public interface PaymentStrategy {
    void pay(int amount);
}

enum PaymentType implements PaymentStrategy {
    CREDIT_CARD((x) -> System.out.println("Paying ₹" + x + " with Credit Card")),
    UPI((x) -> System.out.println("Paying ₹" + x + " with UPI")),
    CASH((x) -> System.out.println("Paying ₹" + x + " with Cash"));

    private final PaymentStrategy paymentStrategy;
    PaymentType(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    @Override
    public void pay(int amount) {
        paymentStrategy.pay(amount);
    }
}
