public class searchInSortedRotatedArray34{
    
    public static void main (String arags[]) {
        int nums [] = {4,5,6,7,0,1,2};
        int target = 0;

        int nums2 [] = {1,3};
        // search(nums, target);
        System.out.println(search(nums2, target));
    }

    public static int search(int nums [], int target) {
        if(nums.length == 0){
            return -1;
        }

        if(nums.length == 1) {
            if(nums[0] == target){
                return 0;
            }else {
                return -1;
            }
        }
        int startInx = findStart(nums);
        System.out.println(startInx);

        if (target >= nums[startInx] && target <= nums[nums.length-1]) {
            return binSearch(nums, startInx, nums.length-1, target);
        }else {
            return binSearch(nums, 0, startInx-1, target);
        }
    }

    public static int binSearch(int nums[], int startIndx, int endIndx, int target) {
        
        while (startIndx <=endIndx) {
            int mid = (startIndx + endIndx) /2;
            if(nums[mid] == target) {
                return mid;
            }else if (nums[mid] < target){
                startIndx = mid + 1;
            }else {
                endIndx = mid -1;
            }
        }
        return -1;
    }

    public static int findStart(int nums []) {
        int start = 0, end = nums.length-1;

        while (start < end) {
            int mid = (start + end) / 2;
            if(nums[mid] > nums[mid+1]) {
                // System.out.println(mid+1);
                return mid+1;
            }else if(nums[mid] > nums[end]){
                start = mid+1;
            }else{
                end = mid;
            }
        }

        // System.out.println(start);
        return start;
    }

}