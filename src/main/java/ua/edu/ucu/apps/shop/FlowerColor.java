package ua.edu.ucu.apps.shop;

public enum FlowerColor {

    RED("#FF0000"),
    WHITE("#FFFFFF"),
    BLUE("#0000FF");
    private final String hexcolor;
    FlowerColor(String hexcolor){
        this.hexcolor = hexcolor;
    }

    public String getColor() {
        return hexcolor;
    }
}
