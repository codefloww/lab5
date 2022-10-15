package ua.edu.ucu.apps.shop;

import java.util.Objects;

public class FlowerPack {
    private Flower flower;
    private int amount;

    public FlowerPack() {
    }

    public FlowerPack(final Flower flower, final int amount) {
        this.flower = flower;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(final int amount) {
        this.amount = amount;
    }

    public Flower getFlower() {
        return flower;
    }

    public void setFlower(final Flower flower) {
        this.flower = flower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FlowerPack pack)) {
            return false;
        }
        return amount == pack.amount && Objects.equals(flower, pack.flower);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flower, amount);
    }

    public double getPrice() {
        return amount * flower.getPrice();
    }

}
