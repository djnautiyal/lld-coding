package com.learn.design_patterns.behavioural.chain_of_responsibility.shipping_based_on_size;

public interface OrderHandler {

    void handle(Order order);

    String name();

    boolean canHandle(Order order);

    int getPriority();
}
