package com.learn.design_patterns.creational.abstract_factory.creating_kingdoms;

interface Army{
    String getDescription();
}

class ElfArmy implements Army {
    @Override
    public String getDescription() {
        return "This is an Elven army";
    }
}

class OrcishArmy implements Army {
    @Override
    public String getDescription() {
        return "This is an Orcish army";
    }
}
