import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.shop.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlowerTypesTest {
    private Flower flower;

    @BeforeEach
    public void init() {
        flower = new Flower();
    }

    @Test
    void TestRose() {
        flower = new Rose();
        assertEquals(10, flower.getSepalLength());
        assertEquals(FlowerColor.RED.getColor(), flower.getColor());
        assertEquals(10, flower.getPrice());
        assertEquals(Rose.class, flower.getClass());
    }

    @Test
    void TestTulip() {
        flower = new Tulip();
        assertEquals(10, flower.getSepalLength());
        assertEquals(FlowerColor.RED.getColor(), flower.getColor());
        assertEquals(10, flower.getPrice());
        assertEquals(Tulip.class, flower.getClass());
    }

    @Test
    void TestChamomile() {
        flower = new Chamomile();
        assertEquals(10, flower.getSepalLength());
        assertEquals(FlowerColor.WHITE.getColor(), flower.getColor());
        assertEquals(10, flower.getPrice());
        assertEquals(Chamomile.class, flower.getClass());
    }
}
