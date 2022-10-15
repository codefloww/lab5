import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.shop.*;

import static org.junit.jupiter.api.Assertions.assertTrue;


class StoreTest {
    private Store store;

    @BeforeEach
    public void init() {
        store = new Store();
        Flower flower = new Rose();
        flower.setPrice(10);
        FlowerPack flowerPack = new FlowerPack(flower, 10);
        FlowerBucket flowerBucket = new FlowerBucket();
        flowerBucket.add(flowerPack);
        store.addBucket(flowerBucket);
    }

    @Test
    void testSearch() {
        Flower flower = new Rose();
        flower.setPrice(10);
        FlowerPack flowerPack = new FlowerPack(flower, 10);
        FlowerBucket flowerBucket = new FlowerBucket();
        flowerBucket.add(flowerPack);
        assertTrue(store.search(flowerBucket));
    }
}
