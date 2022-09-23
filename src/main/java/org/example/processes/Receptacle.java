package org.example.processes;

public class Receptacle extends CoffeeMakerProcessor{


    @Override
    public void process() {
        System.out.println("Fusing the receptacle...");

        super.notifySensors();
        super.passProcess();
    }
}
