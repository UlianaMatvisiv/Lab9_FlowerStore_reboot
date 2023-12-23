package ucu.edu.ua.flowerstore.flowers;

import ucu.edu.ua.flowerstore.decorator.DiscountDecorator;
import ucu.edu.ua.flowerstore.decorator.PaperDecorator;
public class Main {
    public static void main(String[] args) {
        Item item = new Flower(1, 90, FlowerColor.RED, 89, FlowerType.ROSE, "this is flower");
        item = new DiscountDecorator(new PaperDecorator(item));
    }
}
