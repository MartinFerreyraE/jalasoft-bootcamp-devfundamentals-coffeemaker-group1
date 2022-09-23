package org.example.processes;

import org.example.enums.WarmerPlateSensorState;
import org.example.sensors.Sensor;
import org.example.sensors.WarmerPlateSensor;

import java.util.Scanner;

public class Coffee extends CoffeeMakerProcessor{

    private int coffeeGrounds;
    private Scanner scanner = new Scanner(System.in);

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
        System.out.println("How many grams of coffee do you want to add: ");
        Double coffeeGrams = scanner.nextDouble();
        super.notifySensors();
        super.passProcess();
    }
}
