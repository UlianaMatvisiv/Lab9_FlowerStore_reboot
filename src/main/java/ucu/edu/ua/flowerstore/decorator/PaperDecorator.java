package ucu.edu.ua.flowerstore.decorator;

import ucu.edu.ua.flowerstore.flowers.Item;

public class PaperDecorator extends ItemDecorator {
    public PaperDecorator(Item item) {
        super(item);
    }
    public double getPrice() {
        final int PRICE = 20;
        return super.getPrice() + PRICE;
    }
    public String getDescription() {
        return "Paper decorated";
    }
}
