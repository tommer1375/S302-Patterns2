package org.ShoesShop;

public class AccountBank implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println(" Pago realizado con Cuenta Bancaria, importe: "+amount+"€");
    }
}
