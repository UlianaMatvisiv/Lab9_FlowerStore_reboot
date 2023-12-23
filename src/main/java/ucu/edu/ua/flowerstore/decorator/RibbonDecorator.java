package ucu.edu.ua.flowerstore.decorator;

import ucu.edu.ua.flowerstore.flowers.Item;

public class RibbonDecorator extends ItemDecorator {

    public RibbonDecorator(Item item) {
        super(item);
    }

    public String getDescription() {
        return "Decorated with ribbon";
    }

    public double getPrice() {
        final int PRICE = 67;
        return super.getPrice() + PRICE;
    }
}