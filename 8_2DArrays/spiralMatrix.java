import java.util.Arrays;

public class spiralMatrix {

    public static void printSpiral(int parameterArr[][]) {

        int startRow = 0, endRow = parameterArr.length - 1, startCol = 0, endCol = parameterArr[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(parameterArr[startRow][j] + " ");
            }

            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(parameterArr[i][endCol] + " ");
            }

            // bot
            for (int j = endCol - 1; j >= startCol; j--) {
                System.out.print(parameterArr[endRow][j] + " ");
            }

            // left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                System.out.print(parameterArr[i][startCol] + " ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        printSpiral(arr);
    }
}
