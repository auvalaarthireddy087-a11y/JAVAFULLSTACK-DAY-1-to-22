class Vechile {
    String brand = "Ford";
    public void honk() {
        System.out.println("Beep beep!");
    }
}
class Car extends Vechile {
    String model = "Mustang";
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
        myCar.displayInfo();
    }
}