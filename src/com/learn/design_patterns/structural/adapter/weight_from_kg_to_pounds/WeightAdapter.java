package com.learn.design_patterns.structural.adapter.weight_from_kg_to_pounds;

public interface WeightAdapter {
    int getWeightInPounds();
}

class WeightMachineAdapter implements WeightAdapter {
    private final WeightMachine weightMachine;
    public WeightMachineAdapter() {
        this.weightMachine = new WeightMachine();
    }
    @Override
    public int getWeightInPounds() {
        return (int)(weightMachine.getWeightInKg() * 2.20462);
    }
}
