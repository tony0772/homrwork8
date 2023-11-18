package excercise1;

public class Fridge extends Electronics{
    private Double temperature;
    public Fridge(Double price, String name, String description, Integer quantity, String type, Double length, Double width, Double height, Double weight, Double temperature) {
        super(price, name, description, quantity, type, length, width, height, weight);
        this.temperature=temperature;
    }

    public Double getTemperature() {
        Integer minTemp = -20;
        Integer maxTemp = 20;
        if (temperature < minTemp){
            System.out.println("The temperature is too low. Please consult the manual for any malfunction");
        }else if (temperature > maxTemp){
            System.out.println("The temperature is too high. Please check if the door is closed, otherwise consult the manual for any malfucntion");
        }else {
            System.out.println("The fridge is working in proper conditions");
        }
        return temperature;
    }
}
