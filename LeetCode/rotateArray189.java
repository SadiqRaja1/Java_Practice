import java.util.Arrays;

public class rotateArray189 {

    public static void main(String[] args) {
        int nums [] = {1,2};

        int nums1 [] = {-1,-100,3,99};

        rotateArrayUsingSpace(nums, 7);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotateArrayUsingSpace(int nums[], int k) {
        if(nums.length == 0 || nums.length == 1) {
            return;
        }else if(nums.length < k){
            rotateArray(nums, k);
            return;
        }
        int newNums [] = new int[nums.length];

        int index=0;
        for(int i=k; i<nums.length; i++){
            newNums[i]=nums[index];
            index++;
        }


        for(int i=0; i<k; i++){
            newNums[i]=nums[index];
            index++;
        }

        for(int i=0; i<newNums.length; i++){
            nums[i]=newNums[i];
        }

        System.out.println(Arrays.toString(newNums));
        
    }

    public static void rotateArray(int nums[], int k) {
        while (k != 0) {
            int last = nums[nums.length-1];

            for(int i=nums.length-1; i>=1; i--) {
                nums[i]=nums[i-1];
            }
            nums[0] = last;
            last = nums[nums.length-1];

            k--;
        }

        System.out.println(Arrays.toString(nums));
    }   
}