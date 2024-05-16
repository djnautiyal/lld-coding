package com.learn.design_patterns.creational.abstract_factory.gui_components_for_os;

import java.util.function.Supplier;

public enum OSType {
    WINDOWS(() -> new WindowsFactory()),
    LINUX(() -> new LinuxFactory()),
    MAC(() -> new MacFactory());

    private final Supplier<GUIFactory> constructor;

    OSType(Supplier<GUIFactory> constructor){
        this.constructor = constructor;
    }

    public Supplier<GUIFactory> getConstructor(){
        return constructor;
    }
}
