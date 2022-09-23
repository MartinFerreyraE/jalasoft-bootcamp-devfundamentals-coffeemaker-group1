package org.example.processes;

import org.example.enums.WarmerPlateSensorState;
import org.example.sensors.Sensor;
import org.example.sensors.WarmerPlateSensor;

public class Coffee extends CoffeeMakerProcessor{

    private int coffeeGrounds;

    public Coffee(int coffeeGrounds) {
        this.coffeeGrounds = coffeeGrounds;
    }

    public int getCoffeeGrounds() {
        return coffeeGrounds;
    }

    public void setCoffeeGrounds(int coffeeGrounds) {
        this.coffeeGrounds = coffeeGrounds;
    }

    @Override
    public void process() {
        System.out.println("Cafeteando...");

        if( Sensor.getWarmerPlateSensorState() == WarmerPlateSensorState.WARMER_EMPTY){
            System.out.println("Esta vacio");
        }
    }
}
