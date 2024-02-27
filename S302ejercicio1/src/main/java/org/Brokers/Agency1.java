package org.Brokers;

public class Agency1 implements Observer{
    private Broker broker;
    private final String NAME = "Interactive Brokers";
    public Agency1(Broker broker) {
        this.broker = broker;
        this.broker.attach(this);
    }

    @Override
    public void update() {
        System.out.println(NAME + " Nuevo valor del mercado: " + broker.getState());
   }
}
