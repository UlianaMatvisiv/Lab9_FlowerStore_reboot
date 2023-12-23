package ucu.edu.ua.flowerstore.decorator;

import ucu.edu.ua.flowerstore.flowers.Item;

public class ItemDecorator extends Item{
    private Item item;
    public ItemDecorator(Item item) {
        this.item = item;
    }
    public String getDescription() {
        return item.getDescription();
    }
    public double getPrice() {
        return item.getPrice();
    }
}
