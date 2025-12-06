public class searchInSortedRotatedArray {
    public static int search (int nums [], int target) {
        if(nums.length == 1) {
            if(nums[0] == target) {
                return 0;
            }else {
                return -1;
            }
        }
        int rotation = findStart(nums);

        if(nums[rotation] == target) {
            return rotation;
        }

        int start, end, mid;

        if(target >= nums[rotation] && target <= nums[nums.length-1]) {
            start = rotation;
            end = nums.length-1;
            mid = (start + end) /2;
        }else {
            start = 0;
            end = rotation-1;
            mid = (start + end) /2;

            
        }

        

        while (start <= end) {

            if (nums[mid] == target) {
                return mid;
            }

            if(nums[mid] < target){
                start = mid+1;
                mid = (start + end) /2;
            }

            if(nums[mid] > target) {
                end = mid-1;
                mid = (start + end) /2;
            }
            
        }
        return -1;
    }
    public static int findStart(int numsParameter []) {
        int start = 0;
        int end = numsParameter.length -1;
        int mid = (start + end) /2 ;

        while (start < end) {
            if (numsParameter[mid] > numsParameter [mid+1]) {
                return mid + 1;
            }
            if(numsParameter[mid] > numsParameter[end]) {
                start = mid+1;
                mid = (start + end) /2;
            }
            if(numsParameter[mid] < numsParameter[end]) {
                end = mid;
                mid = (start + end) /2;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int nums [] = {1,3};
        int target = 3;

        System.out.println(findStart(nums));
        System.out.println(search(nums, target));
    }
}
