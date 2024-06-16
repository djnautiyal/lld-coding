package com.learn.low_level_coding.vending_machine.state;

import com.learn.low_level_coding.vending_machine.VendingMachine;

public class ItemSelectedState implements State {

    VendingMachine machine;
    @Override
    public String toString() {
        return "ItemSelectedState{}";
    }

    ItemSelectedState(VendingMachine machine) {
        this.machine = machine;
        System.out.println(this);
    }

    @Override
    public void confirmTransaction(VendingMachine machine) throws Exception {
        this.machine.setState(new DispenseState(machine));
    }

    @Override
    public void cancelTransaction(VendingMachine machine) throws Exception {
        this.machine.setState(new CancelState(machine));
    }
}
