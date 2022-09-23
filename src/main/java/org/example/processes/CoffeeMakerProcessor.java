package org.example.processes;

import java.util.Objects;

public abstract class CoffeeMakerProcessor {

    private CoffeeMakerProcessor nextProcessor;
    public abstract void process();

    public void passProcess(){
        if(Objects.nonNull(this.getNextProcessor())){
            this.getNextProcessor().process();
        }
    }
    public CoffeeMakerProcessor getNextProcessor() {
        return nextProcessor;
    }

    public void setNextProcessor(CoffeeMakerProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

}
