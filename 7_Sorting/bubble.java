import java.util.Arrays;

public class bubble {

    public static void bubbleSort(int parameterNums []) {
        for(int i=0; i<parameterNums.length; i++) {
            for(int j=0; j<parameterNums.length-1-i; j++) {
                if(parameterNums[j] > parameterNums[j+1]) {
                    int temp = parameterNums[j];
                    parameterNums[j] = parameterNums[j+1];
                    parameterNums[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(parameterNums));
    }
    
    public static void main(String[] args) {
        int nums[] = {5, 4, 1, 3, 2};

        bubbleSort(nums);
    }
}