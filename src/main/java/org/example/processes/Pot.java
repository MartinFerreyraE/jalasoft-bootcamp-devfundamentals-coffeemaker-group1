package org.example.processes;

public class Pot extends CoffeeMakerProcessor{

    private int coffeeAmount;

    @Override
    public void process() {
        System.out.println("Preparing pot...");
        super.notifySensors();
        super.passProcess();
    }

//    public void addCoffee(Coffee coffee) {
//        coffeeAmount += coffee.getAmount();
//    }

}
