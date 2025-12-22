import java.util.Arrays;

public class insertion {

    public static void insertionSort(int parameterNums []) {
        for(int i=1; i<parameterNums.length; i++) {
            int curr = parameterNums[i];
            int j = i-1;

            while (j >=0 && parameterNums[j] > curr) {
                parameterNums[j+1] = parameterNums[j];
                j--;
            }
            parameterNums[j+1] = curr;
        }
        System.out.println(Arrays.toString(parameterNums));
    }
    public static void main(String[] args) {
        int nums [] = {5, 4, 2, 1, 3};

        insertionSort(nums);
    }
}
