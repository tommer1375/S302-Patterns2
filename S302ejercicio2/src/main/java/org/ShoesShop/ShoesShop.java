package org.ShoesShop;

public class ShoesShop {

    private PaymentPortal paymentPortal;

    public ShoesShop(PaymentPortal paymentPortal) {
        this.paymentPortal = paymentPortal;
    }

    public void makePurchase(Payment payment, Double amount){

        paymentPortal.processPayment(payment, amount);
    }
}