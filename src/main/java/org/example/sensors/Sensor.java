package org.example.sensors;

import org.example.CoffeeMaker;
import org.example.enums.BoilerSensorState;
import org.example.enums.WarmerPlateSensorState;
import org.example.processes.CoffeeMakerProcessor;

public interface Sensor {
    public abstract void verify();

}
