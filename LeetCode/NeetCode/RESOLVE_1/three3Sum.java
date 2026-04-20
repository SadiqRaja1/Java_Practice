import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));
        for(int i=0; i<n; i++){

            if(nums[i] > 0) break;
            if(i>0 && nums[i] == nums[i-1]) continue;

            int start = i+1;
            int end = n-1;

            while (start < end){



                int sum = nums[start] + nums[end] + nums[i];

                if(sum > 0){
                    end--;
                }else if (sum < 0){
                    start++;
                }else{

                    ans.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    start++;
                    end--;

                    while(start < end && nums[start] == nums[start - 1]){
                        start++;
                    }

                    while(start < end && nums[end] == nums[end + 1]){
                        end--;
                    } 
                }
            }
        }
        return ans;
    }
}

public class three3Sum {
    public static void main (String args []) {
        int nums [] = {-1,0,1,2,-1,-4};

        Solution obj = new Solution();

        System.out.println(obj.threeSum(nums));
    }
}