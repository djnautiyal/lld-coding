package com.learn.design_patterns.creational.abstract_factory.creating_kingdoms;

import java.util.function.Supplier;

public enum KingdomType {
    ORC(() -> new OrcishKingdomFactory()),
    ELF(() -> new ElvenKingdomFactory());

    private final Supplier<KingdomFactory> constructor;

    KingdomType(Supplier<KingdomFactory> constructor) {
        this.constructor = constructor;
    }

    public Supplier<KingdomFactory> getConstructor() {
        return constructor;
    }
}
