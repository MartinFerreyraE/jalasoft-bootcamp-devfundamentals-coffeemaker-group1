package org.example.processes;

import java.util.Objects;

public class Filter extends CoffeeMakerProcessor{


    @Override
    public void process() {
        System.out.println("Filtrando...");

        super.passProcess();
    }
}
