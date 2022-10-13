import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.shop.Flower;
import ua.edu.ucu.apps.shop.FlowerBucket;
import ua.edu.ucu.apps.shop.FlowerPack;
import ua.edu.ucu.apps.shop.Rose;
import ua.edu.ucu.apps.shop.Store;
import static org.junit.jupiter.api.Assertions.assertTrue;


class StoreTest {
    private Store store;

    @BeforeEach
    public void init(){
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
        FlowerBucket flowerBucket = store.getAssortement().get(0);
        assertTrue(store.search(flowerBucket));
    }
}
