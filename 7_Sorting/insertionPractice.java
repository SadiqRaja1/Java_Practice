import java.util.Arrays;

public class insertionPractice {

    public static void insertionSort(int parameterNums []) {
        //loop starting from 1 as we assume index 0 is sorted
        for(int i=1; i<parameterNums.length; i++) {
            int current = parameterNums[i];
            int j = i-1;

            while(j>=0 && parameterNums[j] > current) {
                parameterNums[j+1] = parameterNums[j];
                j--;
            }

            parameterNums[j+1] = current;
        }

        System.out.println(Arrays.toString(parameterNums));
    }
    public static void main(String[] args) {
        int nums [] = {5, 4, 1, 2, 3};

        insertionSort(nums);
    }
}
