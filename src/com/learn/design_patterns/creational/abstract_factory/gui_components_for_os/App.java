package com.learn.design_patterns.creational.abstract_factory.gui_components_for_os;

public class App {

    public static void main(String[] args) {
        OSType type = OSType.WINDOWS;
        GUIFactory factory = type.getConstructor().get();
        factory.createButton().click();
        factory.createCheckBox().check();

        type = OSType.LINUX;
        factory = type.getConstructor().get();
        factory.createButton().click();
        factory.createCheckBox().check();

        type = OSType.MAC;
        factory = type.getConstructor().get();
        factory.createButton().click();
        factory.createCheckBox().check();
    }
}
