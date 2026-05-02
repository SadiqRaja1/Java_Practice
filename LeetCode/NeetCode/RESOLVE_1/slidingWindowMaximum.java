import java.util.*;
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int index = 0;
        int ans [] = new int[n-k+1];

        Deque<Integer> dq = new ArrayDeque<>();

        for(int r=0; r<n; r++){
            if(!dq.isEmpty() && dq.peekFirst() < r-k+1){
                dq.pollFirst();
            }

            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[r]){
                dq.pollLast();
            }

            dq.offer(r);

            if(r >= k-1){
                if(index <n-k+1) {
                    ans[index] = nums[dq.peekFirst()];
                    index++;
                }
            }

        }

        return ans;
    }
}


public class slidingWindowMaximum {
    public static void main (String args []) {
        int nums [] = {1,2,1,0,4,2,6};
        int k=3;

        Solution obj = new Solution();

        System.out.println(Arrays.toString(obj.maxSlidingWindow(nums, k)));
    }
}