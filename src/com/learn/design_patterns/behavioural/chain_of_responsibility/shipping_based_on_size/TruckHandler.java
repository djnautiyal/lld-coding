package com.learn.design_patterns.behavioural.chain_of_responsibility.shipping_based_on_size;

public class TruckHandler implements OrderHandler {
    @Override
    public void handle(Order order) {
        System.out.printf("Order: %s has been delieverd by %s\n", order, name());
    }

    @Override
    public String name() {
        return "Truck";
    }

    @Override
    public boolean canHandle(Order order) {
        return order.getSize() == OrderSize.HUGE;
    }

    @Override
    public int getPriority() {
        return 1;
    }
}
