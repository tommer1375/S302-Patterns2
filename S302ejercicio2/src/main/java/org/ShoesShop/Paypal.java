package org.ShoesShop;

public class Paypal implements Payment {

    @Override
    public void makePayment(double amount) {
        System.out.println(" Pago realizado con Paypal, importe: "+amount+"€");

    }
}
