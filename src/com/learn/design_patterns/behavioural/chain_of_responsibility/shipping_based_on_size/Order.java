package com.learn.design_patterns.behavioural.chain_of_responsibility.shipping_based_on_size;

public class Order {

    private final OrderSize size;
    private final String OrderDescription;

    public Order(OrderSize size, String desc){
        this.size = size;
        this.OrderDescription = desc;
    }

    public OrderSize getSize(){
        return size;
    }

    public String getOrderDescription(){
        return OrderDescription;
    }

    @Override
    public String toString(){
        return getOrderDescription();
    }
}
