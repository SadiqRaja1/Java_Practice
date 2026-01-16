public class findPeakElement162 {
    public static void main(String[] args) {
        int nums [] = {1,2,3,1};

        findPeak(nums);
    }

    public static void findPeak(int nums[]) {
        int start = 0;
        int end = nums.length-1;

        while (start <= end) {
            int mid = (start + end) /2;

            if(start == end) {
                System.out.println(start);
                return;
            }else if(nums[mid] < nums[mid+1]) {
                start = mid+1;
            }else{
                end = mid;
            }
        }
    }
}
