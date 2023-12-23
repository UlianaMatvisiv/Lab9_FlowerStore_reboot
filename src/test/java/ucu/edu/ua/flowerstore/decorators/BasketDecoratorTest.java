package ucu.edu.ua.flowerstore.decorators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ucu.edu.ua.flowerstore.flowers.Flower;
import ucu.edu.ua.flowerstore.decorator.BasketDecorator;


import org.junit.jupiter.api.Assertions;

public class BasketDecoratorTest {
    private final int basketPrice = 4;
    private final int FLOWERPRICE = 15;
    private BasketDecorator basketDecorator;
    private Flower flower;

    @BeforeEach
    public void init() {
        flower = new Flower();
        basketDecorator = new BasketDecorator(flower);
    }

    @Test
    public void testPrice() {
        int flowerPrice = FLOWERPRICE;
        flower.setPrice(flowerPrice);

        int expectedPrice = flowerPrice + basketPrice;
        Assertions.assertEquals(expectedPrice, basketDecorator.getPrice());
    }

    @Test
    public void testDescription() {
        Assertions.assertEquals("Basket decorated",
        basketDecorator.getDescription());
    }
}