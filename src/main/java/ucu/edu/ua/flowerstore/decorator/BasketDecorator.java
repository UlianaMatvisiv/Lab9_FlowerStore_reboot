package ucu.edu.ua.flowerstore.decorator;

import ucu.edu.ua.flowerstore.flowers.Item;

public class BasketDecorator extends ItemDecorator {

    public BasketDecorator(Item item) {
        super(item);
    }

    public double getPrice() {
        final int PRICE = 4;
        return PRICE + super.getPrice();
    }

    public String getDescription() {
        return "Basket decorated";
    }
}
