package ucu.edu.ua.flowerstore.filters;

import ucu.edu.ua.flowerstore.flowers.Item;

public interface SearchFilter {
    boolean match(Item item);
}