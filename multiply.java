public class multiply {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40 };
        int multiply = 1;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            multiply = multiply * arr[i];
            
        }
        System.out.println("MULTIPLICATION OF ARRAY ELEMENTS -> "+multiply);

    }

}
