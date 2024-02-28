package org.ShoesShop;

public class Main {
    public static void main(String[] args) {

        Payment card = new CreditCard();
        Payment payPal = new Paypal();
        Payment bank = new AccountBank();

        PaymentPortal portal = new PaymentPortal();

        ShoesShop shop = new ShoesShop(portal);

        Double amount1 = 30.68;
        Double amount2 = 100.45;
        Double amount3 = 56.8;

        shop.makePurchase(card, amount1);
        shop.makePurchase(payPal, amount2);
        shop.makePurchase(bank, amount3);
    }
}