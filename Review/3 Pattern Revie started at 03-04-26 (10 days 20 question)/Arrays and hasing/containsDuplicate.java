import java.util.*;
class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> uniqueInt = new HashSet<>();

        for(int num : nums) {
            if(uniqueInt.contains(num)) {
                return true;
            }
            uniqueInt.add(num);
        }

        return false;
    }
}

public class containsDuplicate {
    public static void main (String args [] ) {
        int nums [] = {1, 2, 3, 3};

        Solution obj = new Solution();

        System.out.println(obj.hasDuplicate(nums));
    }
}