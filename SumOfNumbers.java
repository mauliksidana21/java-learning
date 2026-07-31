

    

// find the sum of first five numbers of a digit 
// to fing the sum of the digits of a number 
public class SumOfNumbers {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            sum = sum + i;
        }

        System.out.println("Sum = " + sum);
    }
}