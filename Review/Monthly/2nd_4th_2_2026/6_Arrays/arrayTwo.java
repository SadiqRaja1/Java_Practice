public class arrayTwo {

    public static void main(String[] args) {
        int nums [] = {4,5,7,0,1,2};
        int target = 0;

        int nums1 [] = {4,5,7,0,1,2};
        int target1 = 3;

        int nums2 [] = {1};
        int target2 = 0;

        System.out.println(findTarget(nums, target));
        System.out.println(findTarget(nums1, target1));
        System.out.println(findTarget(nums2, target2));
    }

    public static int findTarget(int [] nums, int target) {
        if(nums.length == 0) {
            return -1;
        }
        if(nums.length == 1) {
            if(nums[0] == target){
                return 0;
            }else{
                return -1;
            }
        }
        int start = findStart(nums);
        // System.out.println(start);

        if(nums[start] <= target && nums[nums.length-1] >=target) {
            return search(nums, target, start, nums.length-1);
        }else {
            return search(nums, target, 0, start-1);
        }
    }
    public static int search(int nums[], int target, int start, int end) {
        // System.out.println(start);
        while (start <= end) {
            int mid = start+ (end -start) /2;

            if(nums[mid] == target) {
                return mid;
            }else if(nums[mid] < target) {
                start = mid+1;
            }else {
                end = mid-1;
            }
        }
        return -1;
    }

    public static int findStart(int nums []) {
        int start = 0;
        int end = nums.length-1;

        while (start < end) {
            int mid = start +(end - start) / 2;

            if(nums[mid] > nums[mid+1]) {
                return mid+1;
            }

            if(nums[mid] > nums[end]) {
                start = mid+1;
            }

            if(nums[mid] < nums[end]) {
                end = mid;
            }
        }
        return start;
    }
}