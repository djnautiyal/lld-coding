package com.learn.design_patterns.behavioural.chain_of_responsibility.shipping_based_on_size;

import java.util.Arrays;
import java.util.List;

public class ShippingSystem {
    List<OrderHandler> handlers;

    ShippingSystem(){
        buildChain();
    }

    private void buildChain() {
        handlers = Arrays.asList(new BikeHandler(), new TruckHandler(), new VanHandler());
    }

    public void makeOrder(Order order){
        handlers.stream()
                .sorted((x,y) -> x.getPriority() - y.getPriority())
                .filter(handler -> handler.canHandle(order))
                .findFirst()
                .ifPresent(handler -> handler.handle(order));
    }

    public static void main(String[] args) {
        ShippingSystem system = new ShippingSystem();

        system.makeOrder(new Order(OrderSize.SMALL, "Laptop"));
        system.makeOrder(new Order(OrderSize.MEDIUM, "Chair"));
        system.makeOrder(new Order(OrderSize.HUGE, "Bed"));
    }
}
