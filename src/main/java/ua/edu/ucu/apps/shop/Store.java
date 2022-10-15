package ua.edu.ucu.apps.shop;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private final ArrayList<FlowerBucket> assortement = new ArrayList<>();

    public List<FlowerBucket> getAssortement() {
        return assortement;
    }


    public boolean search(final FlowerBucket searchedBucket) {
        for (FlowerBucket storeBucket : assortement) {
            if (storeBucket.equals(searchedBucket)) {
                return true;
            }
        }
        return false;
    }

    public void addBucket(final FlowerBucket newBucket) {
        assortement.add(newBucket);
    }

}
