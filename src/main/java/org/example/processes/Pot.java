package org.example.processes;

public class Pot {

    private int coffeeAmount;

    public void addCoffee(Coffee coffee) {
        coffeeAmount += coffee.getAmount();
    }

}
