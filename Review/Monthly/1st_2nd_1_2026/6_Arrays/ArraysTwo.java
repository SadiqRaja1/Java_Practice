public class ArraysTwo {

    public static int findMid(int parameterNums []) {
        int start = 0; 
        int end = parameterNums.length-1;

        while (start < end) {
            int mid  = (start + end) / 2;

            if(parameterNums[mid] > parameterNums[mid + 1]) {
                return mid + 1;
            }else if (parameterNums[mid] > parameterNums[end]) {
                start = mid + 1;
            }else {
                end = mid;
            }
        }
        return start;
    }

    public static int binarySearch(int nums[], int startIndex, int endIndex, int target) {
        int start = startIndex;
        int end = endIndex;

        while (start <= end) {
            int mid = (start + end) / 2;

            if(nums[mid] == target) {
                return mid;
            }else if(nums [mid] < target) {
                start = mid+1;
            }else {
                end = mid-1;
            }
        }

        return -1;
    }

    public static int findTarget(int nums [], int target) {
        if(nums.length == 0) return -1;
        if(nums.length == 1) return (nums[0] == target)? 0 : -1;
        
        int startIndex = findMid(nums);

        if(nums[startIndex] <= target && target <= nums [nums.length-1]) {
            return binarySearch(nums, startIndex, nums.length-1, target);
        }else {
            return binarySearch(nums, 0, startIndex-1, target);
        }
    }

    public static void main(String[] args) {
        int nums1 [] = {4,5,6,7,0,1,2};
        int target1 = 0;

        int nums2 [] = {4,5,6,7,0,1,2};
        int target2 = 3;

        int nums3 [] = {1};
        int target3 = 0;

        System.out.println(findTarget(nums1, target1));
        System.out.println(findTarget(nums2, target2));
        System.out.println(findTarget(nums3, target3));
    }
}