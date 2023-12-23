package ucu.edu.ua.flowerstore.flowers;

import ucu.edu.ua.flowerstore.decorator.DiscountDecorator;
import ucu.edu.ua.flowerstore.decorator.PaperDecorator;
public class Main {
    private static final int sepalL = 90;
    private static final int flowerPrice = 89;
    public static void main(String[] args) {
        Item item = new Flower(1, sepalL, FlowerColor.RED,
        flowerPrice, FlowerType.ROSE, "this is flower");
        item = new DiscountDecorator(new PaperDecorator(item));
    }
}
