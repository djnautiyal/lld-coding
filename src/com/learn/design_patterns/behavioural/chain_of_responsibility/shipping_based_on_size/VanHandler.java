package com.learn.design_patterns.behavioural.chain_of_responsibility.shipping_based_on_size;

public class VanHandler implements OrderHandler {
    @Override
    public void handle(Order order) {
        System.out.printf("Order: %s has been delieverd by %s\n", order, name());
    }

    @Override
    public String name() {
        return "Van";
    }

    @Override
    public boolean canHandle(Order order) {
        return order.getSize() == OrderSize.MEDIUM;
    }

    @Override
    public int getPriority() {
        return 2;
    }
}
