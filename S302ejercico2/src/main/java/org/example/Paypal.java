package org.example;

public class Paypal implements doPayment{

    @Override
    public void makePayment(double amount) {
        System.out.println(" Pago realizado con Paypal, importe: "+amount+"€");

    }
}
