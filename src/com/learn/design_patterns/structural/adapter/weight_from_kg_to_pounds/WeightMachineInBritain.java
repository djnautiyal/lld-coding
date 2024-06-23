package com.learn.design_patterns.structural.adapter.weight_from_kg_to_pounds;

public class WeightMachineInBritain {
    public static void main(String[] args) {
        WeightAdapter weightAdapter = new WeightMachineAdapter();
        System.out.println(weightAdapter.getWeightInPounds());
    }
}
