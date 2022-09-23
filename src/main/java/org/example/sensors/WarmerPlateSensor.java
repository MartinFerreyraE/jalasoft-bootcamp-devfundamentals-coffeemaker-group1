package org.example.sensors;

import org.example.CoffeeMaker;

public class WarmerPlateSensor extends Sensor{
    public WarmerPlateSensor(CoffeeMaker coffeeMaker) {
        super(coffeeMaker);
    }

    @Override
    public void verify() {
        System.out.println("Received: " + this.getClass().getName());
    }
}
