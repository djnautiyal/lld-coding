package com.learn.design_patterns.behavioural.template.payment_template;

public abstract class PaymentTemplate {

    abstract void validateRequest();
    abstract void debitFromPayersAccount();
    abstract void creditToPayeesAccount();
    abstract void calculateFees();


    final void pay(){
        validateRequest();
        debitFromPayersAccount();
        creditToPayeesAccount();
        calculateFees();
    }
}

class CreditCardPayment extends PaymentTemplate {
    @Override
    void validateRequest() {
        System.out.println("Validating credit card payment request");
    }

    @Override
    void debitFromPayersAccount() {
        System.out.println("Debiting from payers credit card account");
    }

    @Override
    void creditToPayeesAccount() {
        System.out.println("Crediting to payers credit card account");
    }

    @Override
    void calculateFees() {
        System.out.println("Calculating fees for credit card payment");
    }
}

class PayPalPayment extends PaymentTemplate {
    @Override
    void validateRequest() {
        System.out.println("Validating PayPal payment request");
    }

    @Override
    void debitFromPayersAccount() {
        System.out.println("Debiting from payers PayPal account");
    }

    @Override
    void creditToPayeesAccount() {
        System.out.println("Crediting to payers PayPal account");
    }

    @Override
    void calculateFees() {
        System.out.println("Calculating fees for PayPal payment");
    }
}
