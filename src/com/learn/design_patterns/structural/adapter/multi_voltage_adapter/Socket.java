package com.learn.design_patterns.structural.adapter.multi_voltage_adapter;

public class Socket {
    public Volt getVolt(){
        return new Volt(120);
    }
}
