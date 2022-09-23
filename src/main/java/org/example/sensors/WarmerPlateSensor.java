package org.example.sensors;

import org.example.CoffeeMaker;
import org.example.processes.CoffeeMakerProcessor;

public class WarmerPlateSensor implements Sensor{

    @Override
    public void verify() {
        System.out.println(" -> WarmerPlateSensor: verifying machine status");
    }
}
