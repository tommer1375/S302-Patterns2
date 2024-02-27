package org.example;

public class CredirCard implements doPayment{
    @Override
    public void makePayment(double amount) {
        System.out.println(" Pago realizado con Trajeta de Crédito, importe: "+amount+"€");
    }
}
