import java.util.Arrays;

public class firstAndLast34 {
    public static int binSearchStart(int nums[], int target) {
        if(nums[0] == target) {
            return 0;
        }
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target && nums[mid - 1] < nums[mid]) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int[] searchRange(int[] nums, int target) {
        int result[] = { -1, -1 };
        if (nums.length == 0) {
            return result;
        }

        if (nums.length == 1) {
            if (nums[0] == target) {
                result[0] = 0;
                result[1] = 0;
                return result;
            } else {
                return result;
            }
        }

        int targetStartInx = binSearchStart(nums, target);

        if (targetStartInx == -1) {
            return result;
        } else {
            result[0] = targetStartInx;
            if(nums.length-1 == targetStartInx) {
                result[1] = targetStartInx;
                return result;
            }
            if (nums[targetStartInx + 1] == target) {
                for (int i = targetStartInx + 1; i < nums.length; i++) {
                    if (nums[i] != target) {
                        result[1] = i - 1;
                        return result;
                    }
                }
                result[1] = nums.length - 1;
            } else {
                result[1] = targetStartInx;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // int nums[] = { 5, 7, 7, 8, 8, 10 };
        // int target = 8;

        // int nums2[] = {};
        // System.out.println(Arrays.toString(searchRange(nums, target)));
        // System.out.println(Arrays.toString(searchRange(nums, 6)));
        // System.out.println(Arrays.toString(searchRange(nums2, 0)));

        // int nums3 [] ={1};

        // System.out.println(Arrays.toString(searchRange(nums3, 1)));

        // int nums4 [] = {2,2};

        // System.out.println(Arrays.toString(searchRange(nums4, 2)));

        int nums5 [] = {1,4};

        System.out.println(Arrays.toString(searchRange(nums5, 4)));
        

        
    }
}
