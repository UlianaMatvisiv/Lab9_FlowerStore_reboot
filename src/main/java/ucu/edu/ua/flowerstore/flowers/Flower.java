package ucu.edu.ua.flowerstore.flowers;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter @AllArgsConstructor @ToString @NoArgsConstructor
@Entity
public class Flower extends Item {
    @Id
    private int id;
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;
    private String description;

    public Flower(Flower flower) {
        this.flowerType = flower.flowerType;
        this.sepalLength = flower.sepalLength;
        this.price = flower.price;
        this.color = flower.color;
    }
    public String getColor() {
        return color.toString();
    }
}
