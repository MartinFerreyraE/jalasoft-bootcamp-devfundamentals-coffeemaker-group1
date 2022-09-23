package org.example.processes;
import java.util.Objects;

import org.example.enums.WarmerPlateSensorState;
import org.example.sensors.Sensor;

public class ReliefValve extends CoffeeMakerProcessor{


    @Override
    public void process() {
    
        if(Sensor.getWarmerPlateSensorState() == WarmerPlateSensorState.WARMER_EMPTY){
            System.out.println("Pot not in place, Relief valve opened");
        }
        System.out.println("pot in place, Relief valve closed");
        super.passProcess();
        
    }

}
