package com.learn.design_patterns.creational.abstract_factory.creating_kingdoms;

interface King{
    String getDescription();
}

class ElfKing implements King {
    @Override
    public String getDescription() {
        return "This is an Elven king";
    }
}

class OrcishKing implements King {
    @Override
    public String getDescription() {
        return "This is an Orcish king";
    }
}

