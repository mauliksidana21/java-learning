public class shapesarea {
    public static void main(String[] args) {

        Circle c = new Circle();
        System.out.println("Circle is a child class of Shape");
        c.area();

        Rectangle r = new Rectangle();
        System.out.println("\nRectangle is a child class of Shape");
        r.area();

        Triangle t = new Triangle();
        System.out.println("\nTriangle is a child class of Shape");
        t.area();
    }
}

class Shape {
    int radius = 5;
    int length = 10;
    int breadth = 20;
    int base = 12;
    int height = 8;
}

class Circle extends Shape {
    void area() {
        System.out.println("Area of Circle is: " + (3.14 * radius * radius));
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("Area of Rectangle is: " + (length * breadth));
    }
}

class Triangle extends Shape {
    void area() {
        System.out.println("Area of Triangle is: " + (0.5 * base * height));
    }
}