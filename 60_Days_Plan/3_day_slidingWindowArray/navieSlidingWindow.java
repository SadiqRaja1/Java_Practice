public class navieSlidingWindow {
    public static void main(String[] args) {
        int nums[] = {2,9,31,-4,21,7};
        int k=3;

        System.out.println(window(nums, k));
    }

    public static int window(int nums[], int k){
        int max = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<nums.length-k; i++){
            for(int j=i; j<i+3; j++) {
                max = max + nums[j];
            }
            if(max > maxSum) {
                maxSum = max;
            }
            max =0;
        }

        return maxSum;
    }
}
