package com.learn.design_patterns.structural.adapter.multi_voltage_adapter;

public class SocketAdapter {
    Socket socket;

    public SocketAdapter(){
        socket = new Socket();
    }
    public Volt get120Volt(){
        System.out.println("Adapter returning original voltage " + socket.getVolt().getVolts() + "V.");
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
        socketAdapter.get120Volt();
        socketAdapter.get12Volt();
        socketAdapter.get3Volt();
    }
}
