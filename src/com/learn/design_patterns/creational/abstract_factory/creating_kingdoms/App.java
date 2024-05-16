package com.learn.design_patterns.creational.abstract_factory.creating_kingdoms;

public class App {

    public static void main(String[] args) {
        KingdomFactory factory = FactoryMaker.makeFactory(FactoryMaker.KingdomType.ELF);
        Castle castle = factory.createCastle();
        King king = factory.createKing();
        Army army = factory.createArmy();
        System.out.println(castle.getDescription());
        System.out.println(king.getDescription());
        System.out.println(army.getDescription());

        System.out.println();
        factory = FactoryMaker.makeFactory(FactoryMaker.KingdomType.ORC);
        castle = factory.createCastle();
        king = factory.createKing();
        army = factory.createArmy();
        System.out.println(castle.getDescription());
        System.out.println(king.getDescription());
        System.out.println(army.getDescription());
    }
}
