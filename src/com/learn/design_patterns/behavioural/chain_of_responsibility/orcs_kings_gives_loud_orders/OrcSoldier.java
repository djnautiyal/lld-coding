package com.learn.design_patterns.behavioural.chain_of_responsibility.orcs_kings_gives_loud_orders;

import java.util.Set;

public class OrcSoldier implements RequestHandler {
    @Override
    public boolean canHandleRequest(Request request) {
        return Set.of(RequestType.TORTURE_PRISONER, RequestType.ATTACK, RequestType.PLUNDER).contains(request.getRequestType());
    }

    @Override
    public int getPriority() {
        return 4;
    }

    @Override
    public void handle(Request request) {
        request.markHandled();
        System.out.format("%s is handling the request: %s\n", name(), request);
    }

    @Override
    public String name() {
        return "Orc Soldier";
    }
}
