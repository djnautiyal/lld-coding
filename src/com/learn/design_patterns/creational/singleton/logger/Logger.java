package com.learn.design_patterns.creational.singleton.logger;

public class Logger {

    private static Logger instance;
    public static Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }
    private Logger(){}

    public void debug(String message){
        System.out.println("DEBUG: " + message);
    }
    public void info(String message){
        System.out.println("INFO: " + message);
    }

    public void error(String message){
        System.out.println("ERROR: " + message);
    }

    public void warn(String message){
        System.out.println("WARN: " + message);
    }
}
