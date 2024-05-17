package com.learn.design_patterns.creational.builder.character_creator;

public class Hero {
    private final String name;
    private final Weapon weapon;
    private final Armour armour;
    private final HairType hairType;
    private final HairColour hairColour;

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", weapon=" + weapon +
                ", armour=" + armour +
                ", hairType=" + hairType +
                ", hairColour=" + hairColour +
                '}';
    }
    private Hero(Builder builder){
        this.name = builder.name;
        this.weapon = builder.weapon;
        this.armour = builder.armour;
        this.hairType = builder.hairType;
        this.hairColour = builder.hairColour;
    }

    static class Builder{
        private String name;
        private Weapon weapon;
        private Armour armour;
        private HairType hairType;
        private HairColour hairColour;

        public Builder name(String name){
            if(name == null || name.isEmpty()){
                throw new IllegalArgumentException("Name cannot be null or empty");
            }
            this.name = name;
            return this;
        }
        public Builder weapon(Weapon weapon){
            this.weapon = weapon;
            return this;
        }
        public Builder armour(Armour armour){
            this.armour = armour;
            return this;
        }
        public Builder hairType(HairType hairType){
            this.hairType = hairType;
            return this;
        }
        public Builder hairColour(HairColour hairColour){
            this.hairColour = hairColour;
            return this;
        }
        public Hero build(){
            return new Hero(this);
        }
    }
}


