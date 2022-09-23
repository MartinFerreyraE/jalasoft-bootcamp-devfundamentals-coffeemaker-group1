package org.example.processes;

import java.util.Scanner;

public class Water extends CoffeeMakerProcessor{

    private int waterAmount;
    private Scanner scanner = new Scanner(System.in);

    public Water(int waterAmount) {
        this.waterAmount = waterAmount;
    }

    public int getAmount() {
        return waterAmount;
    }

    public void setAmount(int waterAmount) {
        this.waterAmount = waterAmount;
    }

    @Override
    public void process() {
        System.out.println("How many cups of water would you like to add?");
        Double waterCups = scanner.nextDouble();
        super.notifySensors();
        super.passProcess();
    }
}
