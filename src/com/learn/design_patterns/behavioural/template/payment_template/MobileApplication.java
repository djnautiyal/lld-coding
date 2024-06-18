package com.learn.design_patterns.behavioural.template.payment_template;

public class MobileApplication {
    public static void main(String[] args) {

        PaymentTemplate paymentTemplate = new CreditCardPayment();
        paymentTemplate.pay();

        System.out.println();
        paymentTemplate = new PayPalPayment();
        paymentTemplate.pay();
    }
}
