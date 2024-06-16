package com.learn.low_level_coding.vending_machine.state;

import com.learn.low_level_coding.vending_machine.VendingMachine;

public class CancelState implements State {
    VendingMachine machine;
    public CancelState(VendingMachine machine){
        this.machine = machine;
        System.out.println(this);
        this.machine.returnMoney();
        this.machine.setState(new IdleState(machine));
    }


    @Override
    public String toString() {
        return "CancelState{}";
    }

    @Override
    public void returnMoney(VendingMachine machine) throws Exception {
        this.machine.returnMoney();
    }
}
