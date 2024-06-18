package com.learn.design_patterns.behavioural.interpreter.binary_expression_interpreter;

import java.util.HashMap;

public class Context {
    HashMap<String, Integer> context;

    public Context() {
        context = new HashMap<>();
    }

    public void setValue(String key, int value) {
        context.put(key, value);
    }

    public int getValue(String key) {
        return context.get(key);
    }
}
