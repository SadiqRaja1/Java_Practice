import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;
class Solution {

    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        
        System.out.println(Arrays.toString(nums));
        Map<Integer, Integer> map = new HashMap<>();

        int index = 0;
        for(int i : nums){
            map.put(i,index++);
        }

        System.out.println(map);
        return -1;
    }
}

public class longestConsecutiveSequence {

    public static void main (String args []) {
        int nums [] = {2,2,20,4,10,3,4,5};

        Solution obj = new Solution();

        System.out.println(obj.longestConsecutive(nums));
    }
}