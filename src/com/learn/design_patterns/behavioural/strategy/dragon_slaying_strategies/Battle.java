package com.learn.design_patterns.behavioural.strategy.dragon_slaying_strategies;

public class Battle {
    public static void main(String[] args) {
        System.out.println("Green Dragon is spotted in the forest and needs to be slayed!");
        DragonSlayer dragonSlayer = new DragonSlayer(new ProjectileStrategy());
        dragonSlayer.gotoBattle();


        System.out.println("Blue Dragon is emerges from the swamp and needs to be slayed!");
        dragonSlayer = new DragonSlayer(new ProjectileStrategy());
        dragonSlayer.changeStrategy(new SpellStrategy());
        dragonSlayer.gotoBattle();

        System.out.println("Red Dragon is crash lands from the sky and needs to be slayed!");
        dragonSlayer = new DragonSlayer(new MeleeStrategy());
        dragonSlayer.gotoBattle();
    }
}
