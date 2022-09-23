package org.example.processes;

import org.example.ISensorObservable;
import org.example.enums.BoilerSensorState;
import org.example.enums.WarmerPlateSensorState;
import org.example.sensors.BoilerSensor;
import org.example.sensors.Sensor;
import org.example.sensors.WarmerPlateSensor;

import java.util.List;
import java.util.Objects;

public abstract class CoffeeMakerProcessor implements ISensorObservable{

    private CoffeeMakerProcessor nextProcessor;
    private static List<Sensor> sensors = List.of(
            new WarmerPlateSensor(),
            new BoilerSensor()
    );
    private static WarmerPlateSensorState warmerPlateSensorState = WarmerPlateSensorState.WARMER_EMPTY;
    private static BoilerSensorState boilerSensorState = BoilerSensorState.boilerEmpty;
    public abstract void process();

    public static WarmerPlateSensorState getWarmerPlateSensorState() {
        return warmerPlateSensorState;
    }

    public static void setWarmerPlateSensorState(WarmerPlateSensorState warmerPlateSensorState) {
        CoffeeMakerProcessor.warmerPlateSensorState = warmerPlateSensorState;
    }

    public static BoilerSensorState getBoilerSensorState() {
        return boilerSensorState;
    }

    public static void setBoilerSensorState(BoilerSensorState boilerSensorState) {
        CoffeeMakerProcessor.boilerSensorState = boilerSensorState;
    }

    public void passProcess(){
        if(Objects.nonNull(this.getNextProcessor())){
            this.getNextProcessor().process();
        }
    }
    public CoffeeMakerProcessor getNextProcessor() {
        return nextProcessor;
    }

    public void setNextProcessor(CoffeeMakerProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    @Override
    public void notifySensors() {
        for( Sensor sensor : sensors){
            sensor.verify();
        }
    }
}
