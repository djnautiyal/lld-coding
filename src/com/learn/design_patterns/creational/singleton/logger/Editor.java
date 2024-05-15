package com.learn.design_patterns.creational.singleton.logger;

public class Editor {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.debug("Debug message");
        logger.info("Info message");
        logger.error("Error message");
        logger.warn("Warn message");
    }
}
