import java.util.Arrays;

public class insertion {
    public static void insertionSort(int parameterArr []) {
        for(int i=1; i<parameterArr.length; i++) {
            int current = parameterArr[i];
            int j = i-1;

            while(j >=0 && parameterArr[j] > current) {
                parameterArr[j+1] = parameterArr[j];
                j--;
            }

            parameterArr[j+1] = current;
        }

        System.out.println(Arrays.toString(parameterArr));
    }
    public static void main(String[] args) {
        int arr [] = {5, 4, 0, 1, 2};

        insertionSort(arr);
    }
}
