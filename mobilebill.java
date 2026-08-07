/*  Create classes: Product 
↓
 ElectronicProduct 
 ↓
  MobilePhone Calculate discount and final bill.  */

import java.util.Scanner;
class product {
    Scanner sc = new Scanner (System.in);
    String name;
    double price;
  
    void input(){
        System.out.println("Enter product name: ");
        name = sc.nextLine();
        System.out.println("Enter product price: ");
        price = sc.nextDouble();
       
    }

}
class electronicproduct extends product {
    double discount;
    double finalbill;

    void calculateDiscount() {
        discount = price * 0.2; // 10% discount
        finalbill = (price - discount);
        
    }
}
public class mobilebill{
    public static void main(String[] args) {
        
        electronicproduct ep = new electronicproduct();
        ep.input();
        ep.calculateDiscount();
        System.out.println("Product name: " + ep.name);
        System.out.println("Product price: " + ep.price);
        System.out.println("Discount: " + ep.discount);
        System.out.println("Final bill: " + ep.finalbill);
    }
}
