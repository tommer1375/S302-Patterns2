package org.ShoesShop;

public class PaymentPortal {
    public void processPayment(Payment payment, Double amount){

        payment.makePayment(amount);
    }
}

