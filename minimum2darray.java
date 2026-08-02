public class minimum2darray 
    {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 1, 2, 3 } };
        int min;
        min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("MINIMUM ELEMENT IS : " + min);
    }

}

    
