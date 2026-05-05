import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 1){
            return new int []{ nums[0]};
        }

        int n=nums.length;
        int ans [] = new int[n-k+1];

        for(int i=0; i<n-k+1; i++){
            int max = Integer.MIN_VALUE;
            for(int j=i; j<i+k; j++){
                max = Math.max(max,nums[j]);
            }
            ans[i] = max;
        }
        return ans;
    }

    public int[] maxSlidingWindowOpti(int[] nums, int k) {

        int n=nums.length;
        int ans [] = new int[n-k+1];


        Deque<Integer> dq = new ArrayDeque<>();

        for(int r = 0; r<n; r++ ){
            if(!dq.isEmpty() && dq.peekFirst() < r-k+1) {
                dq.pollFirst();
            }

            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[r]){
                dq.pollLast();
            }

            dq.offerLast(r);

            if(r >= k-1){
                ans[r-k+1] = nums[dq.peekFirst()]; // we can also use index = 0 and so on
            }
        }
        return ans;
    }
}

public class slidingWindowMaximum {
    public static void main (String args []) {
        int nums [] = {1,2,1,0,4,2,6};
        int k = 3;

        // int nums [] ={1,-1};
        Solution obj = new Solution();

        System.out.println(Arrays.toString(obj.maxSlidingWindowOpti(nums, k)));
    }
}