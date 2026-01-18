import java.util.Arrays;

public class findPeakElementTwo1901 {

    public static void main(String[] args) {
        int nums [][] = {
            {10,20,15},
            {21,30,31},
            {7,16,32}
        };

        int nums2[][] ={
            {1,2,3,1,8},
            {2,3,4,5,6}
        };

        System.out.println(Arrays.toString(findPeak(nums2)));
    }
    public static int [] findPeak(int nums[][]) {
        int rows = nums.length;
        int cols = nums[0].length;

        int start = 0, end = nums[0].length-1;

        int max []= {-1,-1};

        while (start <=end) {

            int mid = (start + end) /2;
            int maxNum = Integer.MIN_VALUE;

            for(int i=0; i<rows; i++) {
                if(maxNum < nums[i][mid]) {
                    max[0] = i;
                    max[1] = mid;
                    maxNum = nums[i][mid];
                }
                // maxNum = maxNum > nums[mid][i] ? maxNum : nums[mid][i];
            }
            // System.out.println(maxNum);

            int leftVal = (mid - 1 >= 0)? nums[max[0]][max[1]-1] : -1;
            int rightVal = (mid +1 < cols) ? nums[max[0]][max[1]+1] : -1;

            if(nums[max[0]][max[1]] > leftVal && nums[max[0]][max[1]] > rightVal ) {
                // System.out.println(Arrays.toString(max));
                return max;
            }else if(nums[max[0]][max[1]] < leftVal){
                end = mid -1;
            }else{
                start = mid + 1;
            }
        }
        return max;
    }

}