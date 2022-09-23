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
        System.out.println("Implementing Boiler sensor logic");

//        CoffeeMakerProcessor processor = super.coffeeMaker.getProcessor();
//        while(Objects.nonNull(processor)){
//            System.out.println("hola");
//        }
    }
}
