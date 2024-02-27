package org.Brokers;

public class Main {
    public static void main(String[] args) {
        Broker broker = new Broker();

        Observer agency1 = new Agency1(broker);
        Observer agency2 = new Agency2(broker);

        broker.setState(12.8);
        System.out.println();
        broker.setState(30.4);
        System.out.println();
        broker.setState(22.7);


    }
}