package org.example.processes;

public abstract class CoffeeMakerProcessor {

    private CoffeeMakerProcessor nextProcessor;

    public CoffeeMakerProcessor(CoffeeMakerProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public CoffeeMakerProcessor getNextProcessor() {
        return nextProcessor;
    }

    public void setNextProcessor(CoffeeMakerProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }
}
