package ua.edu.ucu.apps.shop;

public class FlowerPack {
    private Flower flower;
    private int amount;

    public FlowerPack() {
    }

    public FlowerPack(Flower flower, int amount) {
        this.flower = flower;
        this.amount = amount;
    }

    public double getPrice() {
        return amount * flower.getPrice();
    }

}
