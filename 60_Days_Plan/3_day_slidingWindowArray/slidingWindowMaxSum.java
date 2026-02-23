public class slidingWindowMaxSum {
    public static void main(String args []) {
        int nums [] = {2,9,31,-4,21,7};
        int k=3;

        slidingWindowSum(nums,k);
    }

    public static void slidingWindowSum(int nums [], int k) {
        if(nums == null || nums.length < k || k<=0) {
            System.out.println("Invalid Input");
            return;
        }
        int winSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<k; i++) {
            winSum += nums[i];
        }

        maxSum = Math.max(winSum, maxSum);

        for(int i=k; i<nums.length; i++) {
            winSum -= nums[i-k];
            winSum += nums[i];

            maxSum = Math.max(winSum, maxSum);
        }

        System.out.println(maxSum);
    }
}
