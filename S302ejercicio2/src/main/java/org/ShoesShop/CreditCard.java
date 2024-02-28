package org.ShoesShop;

public class CreditCard implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println(" Pago realizado con Trajeta de Crédito, importe: "+amount+"€");
    }
}
