import java.util.Arrays;

public class counting {
    public static void main(String[] args) {
        int nums [] = {5,5,4,2,1,3};

        countingSort(nums);

        System.out.println(Arrays.toString(nums));
    }

    public static void countingSort(int nums []) {
        int max = findMax(nums);
        int countArr []= new int[max+1];

        for(int i=0; i<nums.length; i++){
            countArr[nums[i]]++;
        }

        System.out.println(Arrays.toString(countArr));

        int count = 0;
        for(int i=0; i<countArr.length; i++) {
            while (countArr[i] > 0) {
                nums[count] = i;
                count++;
                countArr[i]--;
            }
        }

    }

    public static int  findMax(int nums []) {
        int max = 0;
        for(int i=0; i<nums.length; i++) {
            max=Math.max(max, nums[i]);
        }
        return max;
    }
}
