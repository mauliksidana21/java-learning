class Car {
    String brand;
    String model;
    int year;

    // Parameterized Constructor
    Car(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class ParameterizedConstructorDemo {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", "Fortuner", 2024);
        c1.display();
    }
}

