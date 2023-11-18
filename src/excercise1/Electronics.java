package excercise1;

public class Electronics extends Product{
    private String type;
    private Double length;
    private Double width;
    private Double height;
    private Double weight;

    public Electronics(Double price, String name, String description, Integer quantity, String type, Double length, Double width, Double height, Double weight) {
        super(price, name, description, quantity);
        this.type=type;
        this.length=length;
        this.width=width;
        this.height=height;
        this.weight=weight;
    }

    public String getType() {
        return type;
    }

    public Double getLength() {
        return length;
    }

    public Double getWidth() {
        return width;
    }

    public Double getHeight() {
        return height;
    }

    public Double getWeight() {
        return weight;
    }
}
