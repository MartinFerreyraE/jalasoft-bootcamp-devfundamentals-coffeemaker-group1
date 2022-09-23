package org.example.sensors;

import org.example.CoffeeMaker;
import org.example.processes.CoffeeMakerProcessor;

import java.util.Objects;

public class BoilerSensor extends Sensor{
    public BoilerSensor(CoffeeMaker coffeeMaker) {
        super(coffeeMaker);
    }

    @Override
    public void verify() {
        CoffeeMakerProcessor processor = super.coffeeMaker.getProcessor();
        System.out.println("Received: " + this.getClass().getName());
//        while(Objects.nonNull(processor)){
//            System.out.println("hola");
//        }
    }
}
