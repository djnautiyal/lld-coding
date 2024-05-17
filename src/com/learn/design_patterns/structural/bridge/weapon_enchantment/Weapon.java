package com.learn.design_patterns.structural.bridge.weapon_enchantment;

public interface Weapon {
    void wield();
    void attack();
    void unwield();
    Enchantment getEnchantment();
}

class Hammer implements Weapon {
    private Enchantment enchantment;

    public Hammer(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void wield() {
        System.out.println("Wielding a hammer");
        this.enchantment.activate();
    }
    @Override
    public void attack() {
        System.out.println("Swinging a hammer");
        this.enchantment.apply();
    }
    @Override
    public void unwield() {
        System.out.println("Unwielding a hammer");
        this.enchantment.deactivate();
    }
    @Override
    public Enchantment getEnchantment() {
        return enchantment;
    }
}

class Sword implements Weapon {
    private Enchantment enchantment;

    public Sword(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    @Override
    public void wield() {
        System.out.println("Wielding a sword");
        this.enchantment.activate();
    }
    @Override
    public void attack() {
        System.out.println("Swinging a sword");
        this.enchantment.apply();
    }
    @Override
    public void unwield() {
        System.out.println("Unwielding a sword");
        this.enchantment.deactivate();
    }
    @Override
    public Enchantment getEnchantment() {
        return enchantment;
    }
}
