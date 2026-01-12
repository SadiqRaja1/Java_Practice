public class diagonal {

    public static void diagonalPrint(int parameterArr[][]) {
        int sum = 0;
        int n = parameterArr.length;
        for (int i = 0; i < parameterArr.length; i++) {
            System.out.print(parameterArr[i][i] + " ");
            sum += parameterArr[i][i];
        }

        for (int i = 0; i < parameterArr.length; i++) {
            if (i != n - 1 - i) {
                System.out.print(parameterArr[i][n - 1 - i] + " ");
                sum += parameterArr[i][n-1-i];
            }
        }

        System.out.println("Diagonal Sum is " + sum);
    }

    public static void main(String args[]) {
        int arr[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        int arr2[][] = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        diagonalPrint(arr);
        System.out.println();
        diagonalPrint(arr2);
    }
}
