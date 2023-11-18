package excercise1;

public class Cosmetics extends Product{
    private String color;
    private Double weight;
    public Cosmetics(Double price, String name, String description, Integer quantity, String color, Double weight) {
        super(price, name, description, quantity);
        this.color=color;
        this.weight=weight;
    }

    public String getColor() {
        return color;
    }

    public Double getWeight() {
        return weight;
    }
}
