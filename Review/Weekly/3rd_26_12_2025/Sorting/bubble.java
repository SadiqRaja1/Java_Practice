import java.util.Arrays;

public class bubble {

    public static void bubbleSort(int parameterArr []) {
        for(int i=0; i<parameterArr.length; i++) {
            for(int j=0; j<parameterArr.length-1; j++) {
                if(parameterArr[j] > parameterArr[j+1]) {
                    int temp = parameterArr[j];
                    parameterArr[j] = parameterArr[j+1];
                    parameterArr[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(parameterArr));
    }

    public static void main(String[] args) {
        int arr [] = {5, 4, 0, 1, 3, 2};
        bubbleSort(arr);

    }
}