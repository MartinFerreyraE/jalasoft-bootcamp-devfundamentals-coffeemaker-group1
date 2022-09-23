package org.example;

import org.example.enums.OnOffSwitch;
import org.example.processes.*;
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

        CoffeeMakerProcessor coffee = new Coffee(3);
        CoffeeMakerProcessor filter = new Filter();
        CoffeeMakerProcessor receptacle = new Receptacle();
        CoffeeMakerProcessor pot = new Pot();
        CoffeeMakerProcessor boiler = new Boiler();
        CoffeeMakerProcessor boilerWarmer = new BoilerWarmer(OnOffSwitch.OFF);
        CoffeeMakerProcessor potWarmer = new PotWarmer();
        CoffeeMakerProcessor reliefValve = new ReliefValve();
        CoffeeMakerProcessor indicatorLight = new IndicatorLight();

        coffee.setNextProcessor(filter);
        filter.setNextProcessor(receptacle);
        receptacle.setNextProcessor(pot);
        pot.setNextProcessor(boiler);
        boiler.setNextProcessor(boilerWarmer);
        boilerWarmer.setNextProcessor(reliefValve);
        reliefValve.setNextProcessor(potWarmer);                
        potWarmer.setNextProcessor(indicatorLight);

        this.processor = coffee;
        this.processor.process();
        this.notifySensors();
    }

    public CoffeeMakerProcessor getProcessor() {
        return processor;
    }

}
