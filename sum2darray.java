public class sum2darray {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{1,2,3}};
        int sum =0;
        for(int r=0;r<arr.length;r++){
            for(int c=0;c<arr[0].length;c++){
                sum =sum +arr[r][c];
            }
        }
        System.out.println("SUM OF ARRAY ELEMENTS IS : " + sum);
    }
    
}
