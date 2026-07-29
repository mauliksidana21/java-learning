public class sum {
    public static void main(String[] args ){
        int arr[] = {1,2,3,4,5};
        int sum =0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum = sum +arr[i];

        }
        System.out.println("sum of array elements -> "+sum);
    }
    
}
