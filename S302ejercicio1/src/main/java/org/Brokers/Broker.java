package org.Brokers;
import java.util.*;

public class Broker {

    private List<Observer> observers = new ArrayList<Observer>();
    private double state;

    public double getState() {
        return state;
    }
    public void setState(double state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        observers.forEach(observer -> observer.update());
    }
}



