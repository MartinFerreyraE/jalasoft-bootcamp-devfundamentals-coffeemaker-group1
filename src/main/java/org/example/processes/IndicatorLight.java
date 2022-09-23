package org.example.processes;

public class IndicatorLight extends CoffeeMakerProcessor {

    public void turnOn() {
        System.out.println("Indicator light is on");
    }

    public void turnOff() {
        System.out.println("Indicator light is off");
    }

    @Override
    public void process() {
        super.passProcess();
    }
}
