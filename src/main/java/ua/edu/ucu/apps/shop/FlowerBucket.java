package ua.edu.ucu.apps.shop;
import java.util.ArrayList;
public class FlowerBucket{
    private final ArrayList<FlowerPack> bucket = new ArrayList<>();

    public void add(FlowerPack pack){
        bucket.add(pack);
    }
    public double getPrice(){
        double generalPrice = 0;
        for(FlowerPack pack:bucket){
            generalPrice += pack.getPrice();
        }
        return generalPrice;
    }
}
