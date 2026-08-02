public class max2darray {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 1, 2, 3 } };
        int max;
        max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("MAXIMUM ELEMENT IS : " + max);
    }

}
