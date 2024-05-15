package com.learn.design_patterns.behavioural.chain_of_responsibility.orcs_kings_gives_loud_orders;

public class OrcCommander implements RequestHandler {
    @Override
    public boolean canHandleRequest(Request request) {
        return request.getRequestType() == RequestType.DEFEND_CASTLE;
    }

    @Override
    public int getPriority() {
        return 2;
    }

    @Override
    public void handle(Request request) {
        request.markHandled();
        System.out.format("%s is handling the request: %s\n", name(), request);
    }

    @Override
    public String name() {
        return "Orc Commander";
    }
}
