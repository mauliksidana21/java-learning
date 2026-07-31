import java.util.Scanner;
public class Atm {
    public static void main(String[] args) {
        int org_pin=147;
        for(int i=3;i>0;i--) {
            System.out.println("Enter the pin ");
            Scanner A = new Scanner(System.in);
            int pin = A.nextInt();
            if (pin == org_pin) {
                System.out.println("the pin is correct");
                break;

            } else {
                System.out.println("Enter the crt pin");
                System.out.println(i-1 + "attempt left");

            }
        }}


}