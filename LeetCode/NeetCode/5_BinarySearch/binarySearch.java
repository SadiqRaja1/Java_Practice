class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = (start + end)/2;

            if(nums[mid] == target) {
                return mid;
            }else if(nums[mid] > target) {
                end = mid-1;
            }else {
                start = mid+1;
            }
        }

        return -1;
    }
}

public class binarySearch {
    public static void main (String args []) {
        Solution obj = new Solution();
        int nums [] = {-1,0,2,4,6,8};
        int target = 4;
        System.out.print(obj.search(nums, target));

         int checkNum [] = {3,4,5,6};
         System.out.println(obj.search(checkNum, 0));
    }
}