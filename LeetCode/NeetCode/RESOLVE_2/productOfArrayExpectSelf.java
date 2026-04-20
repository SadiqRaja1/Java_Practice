import java.util.Arrays;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans [] = new int[n];
        int left = 1;
        int right = 1;

        for(int i=0; i<n; i++){
            ans[i] = 1;
        }

        for(int i=0; i<n ; i++){
            ans[i] *= left;
            left *= nums[i];
        }

        for(int i=n-1; i >= 0; i--){
            ans[i] *= right;
            right *= nums[i];
        }

        System.out.println(Arrays.toString(ans));

        return ans;
    }
}  

public class productOfArrayExpectSelf {
    public static void main (String args []) {
        int nums [] = {1,2,4,6};

        Solution obj =  new Solution();

        System.out.println(obj.productExceptSelf(nums));
    }
}