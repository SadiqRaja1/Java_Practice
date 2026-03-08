public class diagonal {

    public static void main(String[] args) {
        int nums[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 },
        };

        int nums1 [] [] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        printDiagonal(nums);
        printDiagonal(nums1);
    }

    public static void printDiagonal(int nums [][]) {
        int sum = 0;
        for(int i=0; i<nums.length; i++) {
            // System.out.print(nums[i][i]+" ");
            sum += nums[i][i];
        }

        
        for(int i=0, j = nums[0].length-1; i<nums.length && j>=0; i++, j--) {
            if(i != j){
                // System.out.print(nums[i][j]+" ");
                sum += nums[i][j];
            }
        }

        System.out.println(sum);
    }
}