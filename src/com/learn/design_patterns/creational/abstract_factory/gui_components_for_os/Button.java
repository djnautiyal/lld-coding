package com.learn.design_patterns.creational.abstract_factory.gui_components_for_os;

public interface Button {
    void click();
}

class WindowsButton implements Button {
    @Override
    public void click() {
        System.out.println("Windows button is clicked");
    }
}

class LinuxButton implements Button {
    @Override
    public void click() {
        System.out.println("Linux button is clicked");
    }
}

class MacButton implements Button {
    @Override
    public void click() {
        System.out.println("Mac button is clicked");
    }
}
