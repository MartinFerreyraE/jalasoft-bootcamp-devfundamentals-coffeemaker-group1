package org.example.sensors;

import org.example.CoffeeMaker;
import org.example.enums.BoilerSensorState;
import org.example.enums.WarmerPlateSensorState;

public abstract class Sensor {
    protected CoffeeMaker coffeeMaker;
    private static BoilerSensorState boilerSensorState;
    private WarmerPlateSensorState warmerPlateSensorState;

    public Sensor(CoffeeMaker coffeeMaker){
        this.coffeeMaker = coffeeMaker;
    }
    public abstract void verify();

}
