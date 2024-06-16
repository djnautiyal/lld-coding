package com.learn.design_patterns.behavioural.command.ac_remote;

import com.learn.design_patterns.behavioural.command.ac_remote.Command;
import com.learn.design_patterns.behavioural.command.ac_remote.AirConditioner;

import java.util.ArrayDeque;
import java.util.Deque;

public class ACRemote {
    Deque<Command> stack = new ArrayDeque<>();
    AirConditioner airConditioner;

    ACRemote(AirConditioner airConditioner){
        this.airConditioner = airConditioner;
    }

    public void executeCommand(Command command){
        command.execute();
        stack.push(command);
    }

    public void undo(){
        if(!stack.isEmpty()){
            Command command = stack.pop();
            command.undo();
        }
    }
}
