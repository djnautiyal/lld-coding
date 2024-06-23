package com.learn.design_patterns.structural.adapter.weight_from_kg_to_pounds;

import com.learn.design_patterns.behavioural.interpreter.binary_expression_interpreter.Interpreter;

import java.util.function.Supplier;

public class WeightMachine {
    int weight = 93;

    int getWeightInKg(){
        return weight;
    }
}