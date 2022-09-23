package org.example.processes;

import org.example.sensors.Sensor;

public class Boiler extends CoffeeMakerProcessor{

    private int waterAmount;
    private final int MAX_WATER_AMOUNT = 12;


    public void addWater(Water water) {
        if (water.getAmount() + waterAmount > MAX_WATER_AMOUNT) {
            System.out.println("Too much water!");
        } else {
            waterAmount += water.getAmount();
        }
    }
    public int getWaterAmount() {
        return waterAmount;
    }

    public void setWaterAmount(int waterAmount) {
        this.waterAmount = waterAmount;
    }

    @Override
    public void process() {
        System.out.println("Preparing boiler...");
        super.notifySensors();
        super.passProcess();
    }
}
