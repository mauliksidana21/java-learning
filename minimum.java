public class minimum {
    public static void main(String[] args) {
        int arr[] = {4,2,-5,21,15};
        int min;
        min =arr[0];

        int n = arr.length;
        for (int i=0;i<n;i++){
            if (arr[i]<min) {
                min = arr[i];
            }
        }
        System.out.println("MINIMUM ELEMENT -> "+min);
    }
    
}
