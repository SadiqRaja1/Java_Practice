public class diagonal {

    public static void diagonalPrint(int parameterArr [] []) {
        int n = parameterArr.length;
        for(int i = 0; i<parameterArr.length; i++) {
            System.out.print(parameterArr[i][i] +" ");
        }

        for(int i = 0; i<parameterArr.length; i++) {
            System.out.print(parameterArr[i][n-1-i]+ " ");            
        }
    }
    public static void main(String args []) {
        int arr[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        diagonalPrint(arr);
    }
}
