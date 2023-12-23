package ucu.edu.ua.flowerstore.decorator;

import ucu.edu.ua.flowerstore.flowers.Item;

public class DiscountDecorator extends ItemDecorator{
    public DiscountDecorator(Item item) {
        super(item);
    }
    public double getprice() {
        final double DISCOUNT = 0.08;
        return super.getPrice() * DISCOUNT;
    }
}
