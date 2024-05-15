package com.learn.design_patterns.behavioural.chain_of_responsibility.orcs_kings_gives_loud_orders;

public interface RequestHandler {
    boolean canHandleRequest(Request request);
    int getPriority();

    void handle(Request request);
    String name();
}


