import java.util.Arrays;

public class sortingOne {
    public static void bubbleSortReverse(int parameterArr []) {
        for(int i=0; i<parameterArr.length; i++) {
            for(int j=0; j<parameterArr.length-i-1; j++) {
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
        int arr [] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        bubbleSortReverse(arr);
    }
}
