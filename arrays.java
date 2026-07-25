public class arrays {
    public static void main(String []args ){
        int arr[];     //declaration of array`

        arr = new int[5];

        int brr[] = new int[]{10,20,30}; // declaration with initialization
//accesing array elements :
        System.out.println("value at 0th index " + brr[0]);
        System.out.println("value at 1st index " + brr[1]);
        System.out.println("value at 2nd index " + brr[2]);
        //accesing array elements :
        System.out.println("value at 0th index " + brr[0]);
        System.out.println("value at 1st index " + brr[1]);
        System.out.println("value at 2nd index " + brr[2]);
// uysing for loop
        for (int i=0;i<3;i++){
            System.out.println("array is -> "+brr[i]);
        }
        // or we can also use length function
        int n = brr.length;
        for(int i=0;i<n;i++){
            System.out.println("array is -> "+brr[i]);
        }



    }
}
