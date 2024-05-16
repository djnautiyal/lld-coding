package com.learn.design_patterns.creational.factory.creating_coins;

import java.util.function.Supplier;

public enum CoinType {
    COPPER(CopperCoin::new), GOLD(GoldCoin::new);

    private final Supplier<Coin> constructor;
    CoinType(Supplier<Coin> constructor) {
        this.constructor = constructor;
    }

    public Supplier<Coin> getConstructor() {
        return constructor;
    }
}
