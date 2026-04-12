import java.util.Arrays;

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prev = 1;
        int post = 1;
        int answer [] = new int[n];

        for (int i=0; i<n; i++){
            answer[i]=1;
        }

        for(int i=0; i<n; i++) {
            answer[i] *= prev;
            prev *=nums[i];
        }

        for(int i=n-1; i>=0; i--){
            answer[i] *= post;
            post *=nums[i];
        }

        return answer;
    }
}  

public class productOfArrayExpectSelf {

    public static void main(String[] args) {
        int nums [] = {1,2,3,4};

        Solution obj =  new Solution();

        System.out.println(Arrays.toString(obj.productExceptSelf(nums)));
    }
}