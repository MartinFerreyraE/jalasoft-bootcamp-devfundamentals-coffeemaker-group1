package org.example;

public class Main {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.brew();
        coffeeMaker.notifySensors();
    }
}