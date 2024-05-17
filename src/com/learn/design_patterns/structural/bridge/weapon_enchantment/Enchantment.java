package com.learn.design_patterns.structural.bridge.weapon_enchantment;

public interface Enchantment {
    void activate();
    void apply();
    void deactivate();
}

class FlyingEnchantment implements Enchantment {
    @Override
    public void activate() {
        System.out.println("The weapon begins to glow faintly");
    }
    @Override
    public void apply() {
        System.out.println("The weapon flies, strikes the enemies and returns back to owner's hand.");
    }
    @Override
    public void deactivate() {
        System.out.println("The weapon stops glowing");
    }
}

class SoulEatingEnchantment  implements Enchantment {
    @Override
    public void activate() {
        System.out.println("The weapon spreads Bloodlust.");
    }
    @Override
    public void apply() {
        System.out.println("The weapon drains the enemies soul.");
    }
    @Override
    public void deactivate() {
        System.out.println("Bloodlust slowly disappears.");
    }
}
