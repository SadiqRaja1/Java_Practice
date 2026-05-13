import java.util.*;
class Solution {
    public int longestConsecutive(int[] nums) {
        int ans = 0;

        HashSet<Integer> hash = new HashSet<>();

        for (int num : nums){
            hash.add(num);
        }

        for(int num : hash){
            if(!hash.contains(num-1)){
                int length = 1;
                while(hash.contains(num+length)) {
                    length++;
                }
                ans = Math.max(ans, length);
            }
        }
        
        return ans;
    }
}

public class longestConsecutiveSequence {
    public static void main(String args []) {
        int nums [] = {100,4,200,1,3,2};

        Solution obj = new Solution();
        
        System.out.println(obj.longestConsecutive(nums));

    }
}