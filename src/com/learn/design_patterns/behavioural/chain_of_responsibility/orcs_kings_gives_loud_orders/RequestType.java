package com.learn.design_patterns.behavioural.chain_of_responsibility.orcs_kings_gives_loud_orders;

public enum RequestType {
    DEFEND_CASTLE("defend the castle"),  COLLECT_TAX("collect taxes"), TORTURE_PRISONER("torture the prisoner"),
    PLUNDER("plunder"), ATTACK("attack");

    private final String desc;
    RequestType(String s) {
        this.desc = s;
    }
    @Override
    public String toString(){
        return desc;
    }
}
