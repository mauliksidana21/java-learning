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

        System.out.println("ENTER ARRAY ELEMENTS : ");
        for (int i=0; i<n;i++){
            arr[i] = sc.nextInt();

        }
        System.out.println("array is -> ");
        for(int val:arr){
            System.out.println(val);

        }

    }
}
