package com.learn.design_patterns.behavioural.chain_of_responsibility.log_processor;

public enum LogType {
    INFO(2, "INFO"),
    ERROR(1, "ERROR"),
    DEBUG(3, "DEBUG");

    private final int priority;
    private final String name;

    LogType(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return name;
    }
}
