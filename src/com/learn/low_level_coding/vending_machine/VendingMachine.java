package com.learn.low_level_coding.vending_machine;

import com.learn.low_level_coding.vending_machine.state.CancelState;
import com.learn.low_level_coding.vending_machine.state.DispenseState;
import com.learn.low_level_coding.vending_machine.state.IdleState;
import com.learn.low_level_coding.vending_machine.state.State;

import java.util.Scanner;

// Any value from 101-120 is valid for product.
// Any non-positive value for amount is invalid.
// Every item cost Rs. 50
public class VendingMachine {
    private State state;
    private int amount;
    private int itemCode;

    public VendingMachine() {
        this.state = new IdleState(this);
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public int getAmount() { return amount; }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }
    public int getItemCode() {
        return itemCode;
    }

    public void returnMoney() {
        System.out.println("Returning amount: " + amount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VendingMachine vendingMachine = new VendingMachine();

        try {

            vendingMachine.getState().insertCoin(vendingMachine, 60);
            vendingMachine.getState().makeSelection(vendingMachine, 105);
            vendingMachine.getState().confirmTransaction(vendingMachine);
            vendingMachine.getState().dispenseItem(vendingMachine);

            System.out.println("\nEnter N to cancel transaction. Enter amount:");
            String amount = sc.nextLine();
            if (amount.equals("N"))
                throw new Exception("Exiting");
            else
                vendingMachine.getState().insertCoin(vendingMachine, Integer.parseInt(amount));

            System.out.println("Enter N to cancel transaction. Enter item code:");
            String itemCode = sc.nextLine();
            if (itemCode.equals("N")){
                vendingMachine.getState().cancelTransaction(vendingMachine);
                System.out.println("Exiting");
                return;
            }
            else
                vendingMachine.getState().makeSelection(vendingMachine, Integer.parseInt(itemCode));

            System.out.println("\nEnter Y to confirm the transaction, N to cancel transaction:");
            String confirm = sc.nextLine();
            if(confirm.equals("N")){
                vendingMachine.getState().cancelTransaction(vendingMachine);
                System.out.println("Exiting");
                return;
            }
            else if(confirm.equals("Y"))
                vendingMachine.getState().confirmTransaction(vendingMachine);

            if(vendingMachine.getState().getClass() == DispenseState.class)
                vendingMachine.getState().dispenseItem(vendingMachine);

        } catch (Exception e) {
            System.out.println("Exception occured: " + e.getMessage());
            vendingMachine.setState(new CancelState(vendingMachine));
        }

    }
}
