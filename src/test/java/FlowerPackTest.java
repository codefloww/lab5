import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.shop.Flower;
import ua.edu.ucu.apps.shop.FlowerPack;
import ua.edu.ucu.apps.shop.Rose;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlowerPackTest {
    private FlowerPack flowerPack;

    @BeforeEach
    public void init() {
        Flower flower1 = new Rose();
        flowerPack = new FlowerPack(flower1, 5);
    }

    @Test
    void testFlower() {
        assertEquals(Rose.class, flowerPack.getFlower().getClass());
        assertEquals(5, flowerPack.getAmount());
        assertEquals(50, flowerPack.getPrice());
    }
}
