package com.learn.design_patterns.creational.factory.creating_coins;

public interface Coin {
    String getDescription();
}

class GoldCoin implements Coin {
    private final String description = "This is a gold coin";
    @Override
    public String getDescription() {
        return description;
    }
}

class CopperCoin implements Coin {
    private final String description = "This is a copper coin";
    @Override
    public String getDescription() {
        return description;
    }
}