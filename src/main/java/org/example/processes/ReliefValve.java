package org.example.processes;
import java.util.Objects;

import org.example.enums.WarmerPlateSensorState;
import org.example.sensors.Sensor;

public class ReliefValve extends CoffeeMakerProcessor{

    @Override
    public void process() {
    
        if(Sensor.getWarmerPlateSensorState() == WarmerPlateSensorState.WARMER_EMPTY){
            System.out.println("Relief valve opened");
        }else{
            System.out.println("Relief valve closed");
        }
    }

}