package com.learn.design_patterns.behavioural.template.stealing_template;

public class RobinHood {
    StealingMethod stealingMethod;

    public RobinHood(StealingMethod stealingMethod) {
        this.stealingMethod = stealingMethod;
    }

    public void steal() {
        stealingMethod.steal();
    }

    public void changeStealingMethod(StealingMethod stealingMethod) {
        this.stealingMethod = stealingMethod;
    }

    public static void main(String[] args) {
        RobinHood robinHood = new RobinHood(new SubtleMethod());
        robinHood.steal();
        System.out.println();
        robinHood.changeStealingMethod(new HitAndRunMethod());
        robinHood.steal();
    }
}
