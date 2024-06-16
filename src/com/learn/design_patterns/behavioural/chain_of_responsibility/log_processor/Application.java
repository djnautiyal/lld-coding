package com.learn.design_patterns.behavioural.chain_of_responsibility.log_processor;

import java.util.ArrayList;
import java.util.Arrays;

public class Application {
    ArrayList<LogProcessor> loggers;
    Application(){
         loggers = new ArrayList<>(Arrays.asList(new ErrorLogProcessor(), new DebugLogProcessor(), new InfoLogProcessor()));
    }

    public void processLogs(LogType type, String message){
        loggers.stream()
                .sorted((x,y) -> x.getPriority() - y.getPriority())
                .filter(logProcessor -> logProcessor.canHandle(type))
                .findFirst()
                .ifPresent(logProcessor -> logProcessor.process(type, message));
    }
    public static void main(String[] args) {
        Application app = new Application();
        app.processLogs(LogType.DEBUG, "System has started running.");
        app.processLogs(LogType.INFO, "System has high CPU usage.");
        app.processLogs(LogType.ERROR, "The System has come crashing down!");
    }
}
