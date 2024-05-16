package com.learn.design_patterns.creational.abstract_factory.creating_kingdoms;

interface Castle {
    String getDescription();
}

class ElfCastle implements Castle {
    @Override
    public String getDescription() {
        return "This is an Elven castle";
    }
}

class OrcishCastle implements Castle {
    @Override
    public String getDescription() {
        return "This is an Orcish castle";
    }
}
