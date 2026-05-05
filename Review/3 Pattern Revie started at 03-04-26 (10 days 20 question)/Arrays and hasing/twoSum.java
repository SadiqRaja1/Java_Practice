import java.util.*;

class Solution {
    public int [] checkTwoSum (int nums [], int target) {
        int ans [] = new int[2];
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            map.put(nums[i],i);
        }

        for(int i=0; i<n; i++){
            int req = target - nums[i];
            if(map.containsKey(req) && map.get(req) != i){
                ans[0] = i;
                ans[1] = map.get(req);
                break;
            }
        }

        return ans;
    }
}

public class twoSum {
    public static void main(String[] args) {
        int nums [] = {3, 4, 5, 6};
        
        int target = 7;

        Solution obj = new Solution();
        System.out.println(Arrays.toString(obj.checkTwoSum(nums, target)));
    }
}