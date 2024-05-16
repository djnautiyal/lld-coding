package com.learn.design_patterns.creational.abstract_factory.gui_components_for_os;

public interface CheckBox {
    void check();
}

class WindowsCheckBox implements CheckBox {
    @Override
    public void check() {
        System.out.println("Windows check box is checked");
    }
}

class LinuxCheckBox implements CheckBox {
    @Override
    public void check() {
        System.out.println("Linux check box is checked");
    }
}

class MacCheckBox implements CheckBox {
    @Override
    public void check() {
        System.out.println("Mac check box is checked");
    }
}
