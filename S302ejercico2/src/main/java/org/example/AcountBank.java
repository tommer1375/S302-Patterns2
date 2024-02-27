package org.example;

public class AcountBank implements doPayment{
    @Override
    public void makePayment(double amount) {
        System.out.println(" Pago realizado con Cuenta Bancaria, importe: "+amount+"€");
    }
}
