public class findSmallestDivisorThreshold1283 {
    public static void main(String[] args) {
        int nums [] = {1,2,5,9};
        int threshold = 6;

        System.out.println(find(nums, threshold));

    }
    
    public static int find(int nums [], int threshold) {

        int max = 0;
        for(int num : nums) {
            max = Math.max(max,num);
        }
    
        int start = 1, end = max;

        while (start < end) {
            int mid = start + (end - start) / 2;
            int sum = 0;

            for(int num: nums) {
                sum += (num+mid-1)/mid;
            }

            if(sum <= threshold) {
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    } 

}