class input {
    String itemName;
    String category;
    int price;
    double rating;

    input(String i, String c, int p, double r) {
        itemName = i;
        category = c;
        price = p;
        rating = r;
    }

    void display() {
        System.out.println("Item Name : " + itemName);
        System.out.println("Category  : " + category);
        System.out.println("Price     : " + price);
        System.out.println("Rating    : " + rating);
        System.out.println();
    }

public class RestaurantItem{
    public static void main(String[] args) {

        input r1 = new input("Paneer Pizza", "Main Course", 250, 4.5);
        input r2 = new input("Veg Burger", "Fast Food", 120, 4.2);
        input r3 = new input("Brownie", "Dessert", 90, 4.8);

        r1.display();
        r2.display();
        r3.display();
    }
}
}