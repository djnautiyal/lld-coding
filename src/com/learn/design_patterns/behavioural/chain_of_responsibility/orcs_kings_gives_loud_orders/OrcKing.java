package com.learn.design_patterns.behavioural.chain_of_responsibility.orcs_kings_gives_loud_orders;

import java.util.Arrays;
import java.util.List;

public class OrcKing {
    private List<RequestHandler> handlers;

    public OrcKing(){
        buildChain();
    }

    private void buildChain() {
        handlers = Arrays.asList(new OrcCommander(), new OrcOfficer(), new OrcSoldier());
    }

    public void makeRequest(Request req){
        handlers.stream()
                .sorted((x,y) -> x.getPriority() - y.getPriority())
                .filter(handler -> handler.canHandleRequest(req))
                .findFirst()
                .ifPresent(handler -> handler.handle(req));
    }

    public static void main(String[] args) {
        var king = new OrcKing();
        king.makeRequest(new Request(RequestType.ATTACK, "attack!"));
        king.makeRequest(new Request(RequestType.DEFEND_CASTLE, "defend castle!"));
        king.makeRequest(new Request(RequestType.TORTURE_PRISONER, "torture!"));
        king.makeRequest(new Request(RequestType.PLUNDER, "plunder!"));
        king.makeRequest(new Request(RequestType.COLLECT_TAX, "collect tax!"));
        king.makeRequest(new Request(RequestType.ATTACK, "to the battle!"));
    }
}
