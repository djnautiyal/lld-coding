package com.learn.low_level_coding.vending_machine.state;

import com.learn.low_level_coding.vending_machine.VendingMachine;

import java.util.Scanner;

public class IdleState implements State {

    VendingMachine machine;

    public IdleState(VendingMachine machine) {
        this.machine = machine;
        System.out.println("Vending Machine is Idle");
        machine.setAmount(0);
    }

    @Override
    public void insertCoin(VendingMachine machine, int amount) throws Exception {
        if(amount < 0) {
            throw new Exception("Invalid amount");
        }
        machine.setAmount(amount);
        machine.setState(new CurrencyAddedState(machine));
    }

    @Override
    public String toString() {
        return "IdleState{}";
    }

    @Override
    public void cancelTransaction(VendingMachine machine) throws Exception {
        this.machine.returnMoney();
    }
}
