class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n-1;

        while (start < end){
            int mid = start + (end-start)/2;
            // System.out.print(mid);
            if(nums [mid] > nums[mid+1]) {
                return nums[mid+1];
            }else if (nums[mid] > nums[end]) {
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return nums[0];
    }
}

public class findMinimumInSortedArray {
    public static void main (String args []) {
        Solution obj = new Solution();
        
        int nums [] = {4,5,6,7};
        int nums2 []= {4,5,0,1,2,3};
        int nums3 [] = {3,4,5,6,1,2};

        System.out.println(obj.findMin(nums));
        System.out.println(obj.findMin(nums2));
        System.out.println(obj.findMin(nums3));
    }
}
