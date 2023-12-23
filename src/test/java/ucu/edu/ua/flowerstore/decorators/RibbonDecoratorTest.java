package ucu.edu.ua.flowerstore.decorators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ucu.edu.ua.flowerstore.flowers.Flower;
import ucu.edu.ua.flowerstore.decorator.RibbonDecorator;

import java.util.Random;

import org.junit.jupiter.api.Assertions;

public class RibbonDecoratorTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 150;
    private final int ribbonPrice = 67;
    private RibbonDecorator ribbonDecorator;
    private Flower flower;

    @BeforeEach
    public void init() {
        flower = new Flower();
        ribbonDecorator = new RibbonDecorator(flower);
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower.setPrice(price);
        price += ribbonPrice;
        Assertions.assertEquals(price, ribbonDecorator.getPrice());
    }

    @Test
    public void testDescription() {
        Assertions.assertEquals("Decorated with ribbon",
        ribbonDecorator.getDescription());
    }
}