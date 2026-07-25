import java.util.Scanner;
public class input_array {
    public static void main(String []args){
        // for taking input we use 
        // Scanner sc = new Scanner(System.in);
        // int num;
        // num = sc.nextInt();
        // System.out.println("You entered: " + num);


        // for array input;

        int arr[] = new int[5];
        int n = arr.length;
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<n;i++){
            System.out.println("ENTER ARRAY ELEMENTS : ");
            arr[i] = sc.nextInt();
            
        }

    }
}
