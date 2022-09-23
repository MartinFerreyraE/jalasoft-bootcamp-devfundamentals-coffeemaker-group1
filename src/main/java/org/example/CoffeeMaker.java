package org.example;

import org.example.processes.CoffeeMakerProcessor;
import org.example.sensors.BoilerSensor;
import org.example.sensors.Sensor;
import org.example.sensors.WarmerPlateSensor;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMaker implements ISensorObservable{

    private List<Sensor> sensors = new ArrayList<>();
    private CoffeeMakerProcessor processor;

    @Override
    public void addSensor(Sensor sensor) {
        System.out.println("Sensor: " + sensor.getClass().getTypeName() + " - added");
        this.sensors.add(sensor);
    }

    @Override
    public void removeSensor(Sensor sensor) {
        this.sensors.remove(sensor);
    }

    @Override
    public void notifySensors() {
        for( Sensor sensor : this.sensors){
            sensor.verify();
        }
    }
    public void brew(){
        System.out.println("Starting coffee machine...");
        this.addSensor(new BoilerSensor(this));
        this.addSensor(new WarmerPlateSensor(this));
    }

    public CoffeeMakerProcessor getProcessor() {
        return processor;
    }

    public void setProcessor(CoffeeMakerProcessor processor) {
        this.processor = processor;
    }

}
