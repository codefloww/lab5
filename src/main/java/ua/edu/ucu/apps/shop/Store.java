package ua.edu.ucu.apps.shop;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private final ArrayList<FlowerBucket> assortement = new ArrayList<>();
    public List<FlowerBucket> getAssortement() {
        return assortement;
    }



    public boolean search(final FlowerBucket searchedBucket){
        return searchedBucket == assortement.get(0);
    }
    public void addBucket(FlowerBucket newBucket){
        assortement.add(newBucket);
    }

}
