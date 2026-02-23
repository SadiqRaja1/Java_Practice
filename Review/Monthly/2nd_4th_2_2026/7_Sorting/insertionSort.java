import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int nums [] = {4,5,2,1,3};

        insertionSorting(nums);

        System.out.println(Arrays.toString(nums));
    }

    public static void insertionSorting(int nums []) {
        for(int i = 1; i< nums.length; i++) {
            int curr = nums[i];
            int j = i-1;

            while(j >=0 && nums[j] > curr) {
                nums [j+1] = nums[j];
                j--;
            }
            nums[j+1]=curr;
        }
    }
}
