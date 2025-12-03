import java.util.Arrays;

public class twoSum {

    public static int[] twoSumfuc(int[] nums, int target) {
        int answer[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    answer[0] = i;
                    answer[1] = j;
                    return answer;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int arr1 [] = {2,7,11,15};
        int arr1Target = 9;

        System.out.println(Arrays.toString(twoSumfuc(arr1, arr1Target)));
    }
}
