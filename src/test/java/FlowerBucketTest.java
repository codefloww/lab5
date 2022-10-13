import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.shop.Flower;
import ua.edu.ucu.apps.shop.FlowerBucket;
import ua.edu.ucu.apps.shop.FlowerPack;
import ua.edu.ucu.apps.shop.Rose;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlowerBucketTest {
    private FlowerBucket flowerBucket;

    @BeforeEach
    public void init() {
        Flower flower = new Rose();
        flower.setPrice(10);
        FlowerPack flowerPack = new FlowerPack(flower, 10);
        flowerBucket = new FlowerBucket();
        flowerBucket.add(flowerPack);
    }

    @Test
    void testPrice() {
        assertEquals(100, flowerBucket.getPrice());
    }
}
