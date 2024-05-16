package com.learn.design_patterns.creational.abstract_factory.creating_kingdoms;

class ElfCastle implements Castle {
    @Override
    public String getDescription() {
        return "This is an Elven castle";
    }
}

class ElfKing implements King {
    @Override
    public String getDescription() {
        return "This is an Elven king";
    }
}

class ElfArmy implements Army {
    @Override
    public String getDescription() {
        return "This is an Elven army";
    }
}
