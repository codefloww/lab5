package ua.edu.ucu.apps.shop;

import java.util.Objects;

public class Flower {

    private double sepalLength;
    private FlowerColor color;
    private double price;

    public Flower() {
    }

    public Flower(final double sepalLength, final FlowerColor color, final double price) {
        this.sepalLength = sepalLength;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flower flower)) {return false;}
        return Double.compare(flower.sepalLength, sepalLength) == 0 &&
                Double.compare(flower.price, price) == 0 && color == flower.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sepalLength, color, price);
    }

    //    sepalLength, color, and price.
    public double getSepalLength() {
        return sepalLength;
    }

    public void setSepalLength(double sepalLength) {
        this.sepalLength = sepalLength;
    }

    public String getColor() {
        return color.getColor();
    }

    public void setColor(FlowerColor color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }

}
