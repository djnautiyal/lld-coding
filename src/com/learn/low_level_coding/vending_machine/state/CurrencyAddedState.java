package com.learn.low_level_coding.vending_machine.state;

import com.learn.low_level_coding.vending_machine.VendingMachine;

public class CurrencyAddedState implements State{
    VendingMachine machine;

    CurrencyAddedState(VendingMachine machine){
        this.machine = machine;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "CurrencyAddedState{}";
    }

    @Override
    public void makeSelection(VendingMachine machine, int itemCode) throws Exception {
        this.machine.setItemCode(itemCode);
        this.machine.setState(new ItemSelectedState(machine));
    }

    @Override
    public void cancelTransaction(VendingMachine machine) throws Exception {
        this.machine.setState(new CancelState(machine));
    }



}
