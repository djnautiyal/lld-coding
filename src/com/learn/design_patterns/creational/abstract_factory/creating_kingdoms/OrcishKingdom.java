package com.learn.design_patterns.creational.abstract_factory.creating_kingdoms;

class OrcishCastle implements Castle {
    @Override
    public String getDescription() {
        return "This is an Orcish castle";
    }
}

class OrcishKing implements King {
    @Override
    public String getDescription() {
        return "This is an Orcish king";
    }
}

class OrcishArmy implements Army {
    @Override
    public String getDescription() {
        return "This is an Orcish army";
    }
}
