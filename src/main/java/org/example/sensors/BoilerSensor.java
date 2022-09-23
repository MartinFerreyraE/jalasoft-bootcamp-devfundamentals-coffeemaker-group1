package org.example.sensors;

import org.example.CoffeeMaker;
import org.example.processes.CoffeeMakerProcessor;

import java.util.Objects;

public class BoilerSensor implements Sensor{

    @Override
    public void verify() {
        System.out.println(" -> BoilerSensor: verifying machine status");
    }
}
