package excercise1;

public class Main {
    public static void main(String[] args) {
        Product car = new Product(89999.99, "BMW", "M4 competition 800BHP", 3);
        System.out.println("The car brand is " + car.getName() + " .The model is " + car.getDescription() + " costing " + car.getPrice() + "$" + " .Currently on stock there are " + car.getQuantity() + " cars.");

        Cosmetics perfume = new Cosmetics(500.69, "Armani", "New collection featuring a woody scent", 1, "coral", 250.8);
        System.out.println(perfume.getName() + " - " + perfume.getDescription() + " - " + perfume.getPrice() + "$ - " + perfume.getQuantity() + " - " + perfume.getColor() + " - " + perfume.getWeight() + "g");

        Electronics microwave = new Electronics(800.99, "Arctic", "glass doors", 50, "best heat conductor", 53.6,24.7,20.1,2.5);
        System.out.println(microwave.getName() + " " + microwave.getDescription() + " " + microwave.getType() + " " + microwave.getPrice() + "$ " + microwave.getQuantity() + " pcs " + microwave.getLength() + " cm " + microwave.getWidth() + " cm " + microwave.getHeight() + " cm " + microwave.getWeight() + " kg ");

        Fridge newFridge = new Fridge(1999.99, "Arctic", "large enough to fit a Smart", 18, "double glassed doors", 57.3, 48.7, 220.7, 48.4, -17.8);
        System.out.println(newFridge.getName() + " " + newFridge.getDescription() + " " + newFridge.getType());
        System.out.println(newFridge.getPrice() + "$ " + newFridge.getQuantity() + " pcs");
        System.out.println("Measurements: " + newFridge.getLength() + "cm " + newFridge.getWidth() + "cm " + newFridge.getHeight() + "cm " + newFridge.getWeight() + "kg");
        System.out.println(newFridge.getTemperature());
    }
}
