package com.learn.design_patterns.behavioural.chain_of_responsibility.log_processor;

public interface LogProcessor {
    int getPriority();
    void process(LogType type, String message);
    boolean canHandle(LogType type);
}

class ErrorLogProcessor implements LogProcessor {

    @Override
    public int getPriority() {
        return LogType.ERROR.getPriority();
    }

    @Override
    public void process(LogType type, String message) {
        System.out.println("ErrorLogProcessor processing message " + type + ": " + message);
    }

    @Override
    public boolean canHandle(LogType type) {
        return type == LogType.ERROR;
    }
}

class DebugLogProcessor implements LogProcessor {
    @Override
    public int getPriority() {
        return LogType.DEBUG.getPriority();
    }

    @Override
    public void process(LogType type, String message) {
        System.out.println("DebugLogProcessor processing message " + type + ": " + message);
    }

    @Override
    public boolean canHandle(LogType type) {
        return type == LogType.DEBUG;
    }
}

class InfoLogProcessor implements LogProcessor {
    @Override
    public int getPriority() {
        return LogType.INFO.getPriority();
    }

    @Override
    public void process(LogType type, String message) {
        System.out.println("InfoLogProcessor processing message " + type + ": " + message);
    }

    @Override
    public boolean canHandle(LogType type) {
        return type == LogType.INFO;
    }
}