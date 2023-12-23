package ucu.edu.ua.flowerstore.flowers;

public abstract class Item {
    private String description;

    public abstract double getPrice();

    public String getDescription() {
        return description;
    }
}