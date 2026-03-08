import java.util.Arrays;

public class twoDArrayBasic {

    public static void main (String args []) {
        int nums [][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums[i].length; j++) {
                System.out.print(nums[i][j]);
            }
        }

        search(nums, 5);
        search(nums, 10);
    }

    public static void search(int nums [][], int target) {

        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums[i].length; j++) {
                if(nums[i][j] == target) {
                    System.out.println();
                    System.out.println("Number found at index "+ i+" "+ j);
                    return;
                }
            }
        }

        System.out.println("Number not present in the array");
    }
}