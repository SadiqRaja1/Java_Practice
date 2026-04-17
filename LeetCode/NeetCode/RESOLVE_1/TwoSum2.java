import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int start = 0;
        int end = n-1;
        int sum = 0;
        int ans [] = new int[2];

        while(start < end) {
            sum = numbers[start] + numbers[end];
            if(sum == target){
                ans[0] = start +1;
                ans[1] = end +1;
                return ans;
            }else if (sum > target) {
                end--;
            }else {
                start++;
            }
        }

        return ans;
    }
}

public class TwoSum2 {
    public static void main (String args []) {
        int nums [] = {1,2,3,4};

        Solution obj = new Solution();

        System.out.println(Arrays.toString(obj.twoSum(nums, 3)));
    }
}