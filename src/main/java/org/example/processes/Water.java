package org.example.processes;

public class Water extends CoffeeMakerProcessor{

    private int waterAmount;

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
        super.passProcess();
    }
}
