public class maximum {
    public static void main(String[] args) {
        int arr[] = {4,2,-5,21,15};
        int max;
        max = arr[0];
        int n= arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("MAX ELEMENT IN THE ARRAY -> "+max);
    }
    
}
