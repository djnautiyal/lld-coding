package com.learn.low_level_coding.vending_machine.state;

import com.learn.low_level_coding.vending_machine.VendingMachine;

public class DispenseState implements State {

    VendingMachine machine;
    @Override
    public String toString() {
        return "DispenseState{}";
    }

    DispenseState(VendingMachine machine) {
        this.machine = machine;
        System.out.println(this);
    }

    @Override
    public void dispenseItem(VendingMachine machine) throws Exception {
        if(machine.getItemCode() < 101 || machine.getItemCode() > 120) {
            throw new Exception("Invalid item code");
        }
        System.out.println("Dispensing your item");
        this.dispenseChange(machine);
        this.machine.setState(new IdleState(machine));
    }

    @Override
    public void dispenseChange(VendingMachine machine) throws Exception {
        System.out.println("Dispensing your change");
    }
}
