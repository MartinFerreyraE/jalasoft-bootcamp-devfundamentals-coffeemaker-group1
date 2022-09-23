package org.example.processes;
import org.example.sensors.Sensor;
import org.example.enums.WarmerPlateSensorState;


public class PotWarmer extends CoffeeMakerProcessor {
    // private OnOffSwitch onOffSwitch;

    // public PotWarmer(OnOffSwitch onOffSwitch) {
    //     this.onOffSwitch = onOffSwitch;
    // }

    // public OnOffSwitch getOnOffSwitch() {
    //     return onOffSwitch;
    // }

    // public void setOnOffSwitch(OnOffSwitch onOffSwitch) {
    //     this.onOffSwitch = onOffSwitch;
    // }

    @Override
    public void process() {
    
        if(CoffeeMakerProcessor.getWarmerPlateSensorState() == WarmerPlateSensorState.POT_EMPTY){
            System.out.println("Stoped heating, pot empty");
        }
        
        System.out.println("Started heating pot");

        super.notifySensors();
        super.passProcess();
        
    }
}
