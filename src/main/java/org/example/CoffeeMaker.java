package org.example;

import org.example.enums.OnOffSwitch;
import org.example.processes.*;

public class CoffeeMaker{

    private CoffeeMakerProcessor processor;

    public void brew(){
        System.out.println("Starting coffee machine...");

        CoffeeMakerProcessor coffee = new Coffee(3);
        CoffeeMakerProcessor filter = new Filter();
        CoffeeMakerProcessor receptacle = new Receptacle();
        CoffeeMakerProcessor pot = new Pot();
        CoffeeMakerProcessor water = new Water(20);
        CoffeeMakerProcessor boiler = new Boiler();
        CoffeeMakerProcessor boilerWarmer = new BoilerWarmer(OnOffSwitch.OFF);
        CoffeeMakerProcessor potWarmer = new PotWarmer();
        CoffeeMakerProcessor reliefValve = new ReliefValve();
        CoffeeMakerProcessor indicatorLight = new IndicatorLight();

        coffee.setNextProcessor(filter);
        filter.setNextProcessor(receptacle);
        receptacle.setNextProcessor(pot);
        pot.setNextProcessor(water);
        water.setNextProcessor(boiler);
        boiler.setNextProcessor(boilerWarmer);
        boilerWarmer.setNextProcessor(reliefValve);
        reliefValve.setNextProcessor(potWarmer);                
        potWarmer.setNextProcessor(indicatorLight);

        this.processor = coffee;
        this.processor.process();
    }

    public CoffeeMakerProcessor getProcessor() {
        return processor;
    }

}
