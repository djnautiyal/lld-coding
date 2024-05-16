package com.learn.design_patterns.creational.abstract_factory.creating_kingdoms;

public class FactoryMaker {
    public enum KingdomType {
        ORC, ELF
    }

    static KingdomFactory makeFactory(KingdomType type) {
        return switch (type) {
            case ELF -> new ElvenKingdomFactory();
            case ORC -> new OrcishKingdomFactory();
        };
    }
}
