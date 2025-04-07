public class InstanceOfClass {
    public static void main(String[] args) {
        // Creating an instance of the Car class
        Car car1 = new Car("Toyota", "Red", 123059.0f);
        // Accessing methods and variables of the instance
        car1.displayDetails();

        // Creating another instance of the Car class
        Car car2 = new Car("Honda", "Blue", 128234.4f);
        car2.displayDetails();
    }
}

//In class add 'static' if nested. If not remove static
class Car {
    // Instance variables
    String brand;
    String color;
    float price;

    // Constructor
    Car(String brand, String color, float price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    // Method
    void displayDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Color: " + color);
        System.out.println("Car Price: $" + price + "\n");

    }
}



