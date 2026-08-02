public class array_2d {
    public static void main(String[] args) {
        // // int[][]arr = new int [3][4];
        // int arr[][] = {{1,2,3},
        // {4,5,6},
        // {7,8,9}};

        // System.out.println(arr[2][1]);

        // //printing entire 2d array :

        // int rowlength = arr.length;
        // int collength = arr[0].length;
        // System.out.println("2d array is -:");
        // for(int row = 0;row<rowlength;row++){
        // for(int col =0;col<collength;col++){
        // System.out.print(arr[row][col] + " ");
        // }
        // System.out.println();
        // }

        // whne number of rows differ

        int arr[][] = { { 1, 2, 3 },
                { 4, 5 },
                { 7, 8, 9, 10 } };

        System.out.println(arr[2][1]);
System.out.println("2d array is -:");
        // printing entire 2d array :
        int r, c;
        int rl = arr.length;
        for (r = 0; r < rl; r++) {
            int cl = arr[r].length;
            for (c = 0; c < cl; c++) {
                System.out.println(arr[r][c] + " ");
            }
            
        }
    }

}
