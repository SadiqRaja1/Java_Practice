public class searchInSortedStairCase {

    public static void stairCaseSearch(int matrix [] [], int target) {
        int row = 0;
        int col = matrix[0].length-1;

        while ( row <= matrix.length-1 && col >= 0) {
            if(matrix[row][col] == target) {
                System.out.println("Target at index "+ row + "  "+ col );
                return;
            }else if (matrix[row][col] > target) {
                col--;
            }else {
                row++;
            }
        }

        System.out.println("Target not present in the given array");
    }
    public static void main(String[] args) {
        int matrix[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }

        };
        int target = 33;

        stairCaseSearch(matrix, target);
    }
}