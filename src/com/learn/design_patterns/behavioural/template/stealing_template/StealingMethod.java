package com.learn.design_patterns.behavioural.template.stealing_template;

public abstract class StealingMethod {

    abstract String pickTarget();

    abstract void confuseTarget(String target);

    abstract void stealFromTarget(String target);

    public final void steal(){
        var target = pickTarget();
        System.out.println("Target has been chosen: " + target);
        confuseTarget(target);
        stealFromTarget(target);
    }
}

class SubtleMethod extends StealingMethod{

    @Override
    String pickTarget() {
        return "Greedy Shop Keeper";
    }

    @Override
    void confuseTarget(String target) {
        System.out.printf("Walk upto %s crying and wailing.\n", target);
    }

    @Override
    void stealFromTarget(String target) {
        System.out.printf("While in close contact, steal %s's wallet\n", target);
    }
}

class HitAndRunMethod extends StealingMethod{
    @Override
    String pickTarget() {
        return "Super Rich Human Woman";
    }

    @Override
    void confuseTarget(String target) {
        System.out.printf("Walk to %s from behind.\n", target);
    }

    @Override
    void stealFromTarget(String target) {
        System.out.printf("Steal %s's purse and run away.\n", target);
    }
}