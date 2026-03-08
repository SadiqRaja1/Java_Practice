public class spiralMatrix {

    public static void main(String[] args) {
        int nums[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        printSpiral(nums);
    }

    public static void printSpiral(int nums[][]) {

        int startRow = 0, endRow = nums.length - 1, startCol = 0, endCol = nums[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            //Top Row
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(nums[startCol][i]+" ");
            }

            //right col
            for(int j = startCol+1; j <= endCol; j++) {
                System.out.print(nums[j][endRow] +" ");
            }

            //bottom Row
            for(int i=endRow-1; i>=startRow; i--) {
                System.out.print(nums[endCol][i]+" ");
            }

            //left col
            for(int j=endCol-1; j>=startCol+1; j--) {
                System.out.print(nums[j][startRow]+" ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }

    }
}