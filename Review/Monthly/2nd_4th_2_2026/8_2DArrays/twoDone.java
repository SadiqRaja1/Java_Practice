public class twoDone {

    public static void main(String[] args) {
        int array [][]= {
            {4,7,8},
            {8,8,7}
        };

        findCount(array, 7);
    }

    public static void findCount(int nums [][], int target) {
        int count = 0;
        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums[i].length; j++) {
                if(nums[i][j] == target){
                    count++;
                }
            }
        }

        System.out.printf("%-15s %d","counts is", count);
    }
}