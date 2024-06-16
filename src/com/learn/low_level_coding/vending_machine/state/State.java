package com.learn.low_level_coding.vending_machine.state;

import com.learn.low_level_coding.vending_machine.VendingMachine;

import java.util.Scanner;

public interface State {
    public default void insertCoin(VendingMachine machine, int amount) throws Exception{ throw new Exception("Vending machine is in wrong state: " + this); }
    public default void makeSelection(VendingMachine machine, int ItemCode) throws Exception{ throw new Exception("Vending machine is in wrong state: " + this); }

    public default void confirmTransaction(VendingMachine machine) throws Exception{ throw new Exception("Vending machine is in wrong state: " + this); }
    public default void cancelTransaction(VendingMachine machine) throws Exception{ throw new Exception("Vending machine is in wrong state: " + this); }

    public default void returnMoney(VendingMachine machine) throws Exception{ throw new Exception("Vending machine is in wrong state: " + this); }
    public default void dispenseItem(VendingMachine machine) throws Exception{ throw new Exception("Vending machine is in wrong state: " + this); }
    public default void dispenseChange(VendingMachine machine) throws Exception{ throw new Exception("Vending machine is in wrong state: " + this); }
}