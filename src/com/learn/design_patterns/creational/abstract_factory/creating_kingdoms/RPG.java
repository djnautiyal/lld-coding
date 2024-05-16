package com.learn.design_patterns.creational.abstract_factory.creating_kingdoms;

public class RPG {
    public static void main(String[] args) {
        KingdomType type = KingdomType.ELF;
        KingdomFactory factory = type.getConstructor().get();

        Castle castle = factory.createCastle();
        King king = factory.createKing();
        Army army = factory.createArmy();

        System.out.println(castle.getDescription());
        System.out.println(king.getDescription());
        System.out.println(army.getDescription());

        type = KingdomType.ORC;
        factory = type.getConstructor().get();

        castle = factory.createCastle();
        king = factory.createKing();
        army = factory.createArmy();

        System.out.println(castle.getDescription());
        System.out.println(king.getDescription());
        System.out.println(army.getDescription());
    }
}
