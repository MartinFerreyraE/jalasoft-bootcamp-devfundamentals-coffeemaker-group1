package org.example.processes;
import org.example.sensors.Sensor;
import org.example.enums.WarmerPlateSensorState;


public class PotWarmer extends CoffeeMakerProcessor {
    @Override
    public void process() {
    
        if(Sensor.getWarmerPlateSensorState() == WarmerPlateSensorState.POT_EMPTY){
            System.out.println("Stoped heating pot");
        }else if (Sensor.getWarmerPlateSensorState() == WarmerPlateSensorState.POT_NOT_EMPTY){
            System.out.println("Started heating pot");
        }
        
    }
}
