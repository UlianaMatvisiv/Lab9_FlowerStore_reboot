package ucu.edu.ua.flowerstore.decorators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ucu.edu.ua.flowerstore.flowers.Flower;
import ucu.edu.ua.flowerstore.decorator.PaperDecorator;


import org.junit.jupiter.api.Assertions;

public class PaperDecoratorTest {
    private final int paperPrice = 20;
    private PaperDecorator paperDecorator;
    private final int flowerP = 65;
    private Flower flower;

    @BeforeEach
    public void init() {
        flower = new Flower();
        paperDecorator = new PaperDecorator(flower);
    }

    @Test
    public void testPrice() {
        int flowerPrice = flowerP;
        flower.setPrice(flowerPrice);

        int expectedPrice = flowerPrice + paperPrice;
        Assertions.assertEquals(expectedPrice, paperDecorator.getPrice());
    }

    @Test
    public void testDescription() {
        Assertions.assertEquals("Paper decorated",
        paperDecorator.getDescription());
    }
}