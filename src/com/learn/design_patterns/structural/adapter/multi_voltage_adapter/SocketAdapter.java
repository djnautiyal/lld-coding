package com.learn.design_patterns.structural.adapter.multi_voltage_adapter;

public class SocketAdapter {
    Socket socket;

    public SocketAdapter(){
        socket = new Socket();
    }
    public Volt get120Volt(){
        System.out.println("Adapter returning original 120V.");
        return socket.getVolt();
    }
    public Volt get12Volt(){
        Volt v = socket.getVolt();
        return convertVolt(v, 10);
    }
    public Volt get3Volt(){
        Volt v = socket.getVolt();
        return convertVolt(v, 40);
    }

    private Volt convertVolt(Volt v, int i) {
        System.out.println("Adapter reducing the volt to "+(v.getVolts()/i) + "V.");
        return new Volt(v.getVolts()/i);
    }

    public static void main(String[] args) {
        SocketAdapter socketAdapter = new SocketAdapter();
        System.out.println("Voltage produced: " + socketAdapter.get120Volt().getVolts() + "V.");
        System.out.println("Voltage produced: " + socketAdapter.get12Volt().getVolts() + "V.");
        System.out.println("Voltage produced: " + socketAdapter.get3Volt().getVolts() + "V.");
    }
}
