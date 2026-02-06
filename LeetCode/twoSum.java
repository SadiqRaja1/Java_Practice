import java.util.Arrays;
import java.util.HashMap;

public class twoSum {

    public static void main(String[] args) {
        int arr1 [] = {3,3};
        int arr1Target = 9;

        System.out.println(Arrays.toString(towSumOpti(arr1, arr1Target)));

        // System.out.println(Arrays.toString(twoSumfuc(arr1, arr1Target)));
    }

    public static int[] towSumOpti(int arr [], int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();

        for(int i=0; i<arr.length; i++) {
            hash.put(arr[i], i);
        }

        for(int i=0; i<arr.length; i++) {
            int help = target - arr[i];

            if(hash.containsValue(help) && hash.get(help) != i) {
                return new int [] {i, hash.get(help)};
            }
        }

        return new int [] {};
    }

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
}
