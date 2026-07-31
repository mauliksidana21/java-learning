class input {
    String brand;
    String model;
    String color;
    int price;
    
    input(String b, String m, String c, int p) {
        brand = b;
        model = m;
        color = c;
        price = p;
    }
    
    void display() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Color : " + color);
        System.out.println("Price : " + price);
        System.out.println();
    }
}
    
    public class MobilePhone {
    public static void main(String[] args) {

        input p1 = new input("Samsung", "Galaxy S25", "Black", 79999);
        input p2 = new input("Apple", "iPhone 17", "Blue", 89999);
        input p3 = new input("OnePlus", "13R", "Green", 42999);

        p1.display();
        p2.display();
        p3.display();
    }
}