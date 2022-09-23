package org.example.sensors;

import org.example.CoffeeMaker;
import org.example.enums.BoilerSensorState;
import org.example.enums.WarmerPlateSensorState;

public abstract class Sensor {
    protected CoffeeMaker coffeeMaker;
    private static BoilerSensorState boilerSensorState = BoilerSensorState.boilerEmpty;
    private static WarmerPlateSensorState warmerPlateSensorState = WarmerPlateSensorState.WARMER_EMPTY;

    public Sensor(CoffeeMaker coffeeMaker){
        this.coffeeMaker = coffeeMaker;
    }
    public abstract void verify();

    public static BoilerSensorState getBoilerSensorState() {
        return boilerSensorState;
    }
    public static void setBoilerSensorState(BoilerSensorState boilerSensorState) {
        Sensor.boilerSensorState = boilerSensorState;
    }

    public static WarmerPlateSensorState getWarmerPlateSensorState() {
        return warmerPlateSensorState;
    }

    public static void setWarmerPlateSensorState(WarmerPlateSensorState warmerPlateSensorState) {
        Sensor.warmerPlateSensorState = warmerPlateSensorState;
    }
}
