import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.shop.Flower;
import ua.edu.ucu.apps.shop.FlowerColor;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FlowerTest {
    private Flower flower;

    @BeforeEach
    public void init() {
        flower = new Flower();
    }

    @Test
    void testPrice() {
        int price = 20;
        flower.setPrice(price);
        assertEquals(price, flower.getPrice());
    }

    @Test
    void testColor() {
        FlowerColor price = FlowerColor.RED;
        flower.setColor(price);
        assertEquals("#FF0000", flower.getColor());
    }

    @Test
    void testSepalLength() {
        double flowerLength = 15.5;
        flower.setSepalLength(flowerLength);
        assertEquals(15.5, flower.getSepalLength());
    }

}