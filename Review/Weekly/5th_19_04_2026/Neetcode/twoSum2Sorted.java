import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();

        int n = nums.length;

        for(int i=0; i<n; i++){

            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums [i-1]) continue;

            int left = i+1;
            int right = n-1;

            while(left < right){
                int sum = nums[left] + nums[right] + nums[i];
                if(sum > 0){
                    right--;
                }else if(sum < 0){
                    left++;
                }else {
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    while(left < right && nums[left] == nums[left -1]){
                        left++;
                    }

                    while(left < right && nums[right] == nums[right +1]){
                        right--;
                    }
                }
            }
        }
        return ans;
    }
}

public class twoSum2Sorted {
    public static void main (String args []) {
        int nums [] = {-1,0,1,2,-1,-4};

        Solution obj = new Solution();

        System.out.println(obj.threeSum(nums));
    }
}