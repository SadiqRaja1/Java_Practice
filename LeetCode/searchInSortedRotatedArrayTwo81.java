public class searchInSortedRotatedArrayTwo81 {

    public static void main(String[] args) {
        int nums[] = { 2, 5, 6, 0, 0, 1, 2 };
        int target = 0;
        int nums2 [] = {2,5,6,0,0,1,2};
        int nums3 [] = {1,0,1,1,1};

        int nums4 [] = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};

        System.out.println(search(nums, target));

        System.out.println(search(nums2, 3));

        System.out.println(search(nums3, 0));

        System.out.println(search(nums4, 2));
    }

    public static boolean search(int nums[], int target) {
        if (nums.length == 0) {
            return false;
        }

        if (nums.length == 1) {
            if (nums[0] == target) {
                return true;
            } else {
                return false;
            }
        }

        return binSearch(nums, target);
    }

    public static boolean binSearch(int nums[], int target) {
        int start = 0, end =nums.length-1; 
        while (start <= end) {
            int mid = (start + end) /2;
            if(nums[mid] == target) {
                return true;
            }else if(nums[start] == nums[mid] && nums[mid] == nums[end]) {
                start++;
                end--;
            }else if(nums[start] <= nums[mid]){
                if(nums[start] <= target && target < nums[mid]){
                    end = mid -1;
                }else{
                    start = mid+1;
                }
            }else {
                if(nums[end] >= target && nums[mid] < target) {
                    start = mid +1;
                }else {
                    end = mid-1;
                }
            }
        }
        return false;
    }

    // public static int findStart(int nums []) {
    //     int start = 0, end = nums .length-1;

    //     // System.out.println(start+ end/2);
    //     while (start <= end) {
    //         int mid = (start + end) / 2;
    //         // System.out.println(mid);
    //         if(nums[mid] > nums[mid+1]){
    //             System.out.println(mid);
    //             break;
    //         }else if(nums[start] == nums[mid] && nums[mid]== nums[end]){
    //             start++; 
    //             end--;
    //         }else if(nums [mid] <= nums[end]) {
    //             end = mid;
    //         }else{
    //             start = mid+1;
    //         }
    //     }
    //     return start;
    // }

}
