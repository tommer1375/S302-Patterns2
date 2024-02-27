package org.Brokers;

public class Agency2 implements Observer{

    private Broker broker;
    private final String NAME = "Zacks Trade";
    public Agency2(Broker broker) {
        this.broker = broker;
        this.broker.attach(this);
    }

    @Override
    public void update() {
        System.out.println(NAME + " Nuevo valor del mercado: " + broker.getState());
    }
}
