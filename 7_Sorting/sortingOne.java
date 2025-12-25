import java.util.Arrays;

public class sortingOne {

    public static void bubbleSortReverse (int parameterArr []) {
        for(int i = 0; i<parameterArr.length; i++) {
            for(int j=0; j<parameterArr.length-1-i; j++) {
                if(parameterArr[j] < parameterArr[j+1]) {
                    int temp = parameterArr[j];
                    parameterArr[j] = parameterArr[j+1];
                    parameterArr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(parameterArr));
    }

    public static void SelectionSortReverse (int parameterArr []) {
        for(int i = 0; i< parameterArr.length; i++) {
            for(int j = i+1; j<parameterArr.length; j++) {
                if(parameterArr[i] < parameterArr[j]) {
                    int temp = parameterArr[i];
                    parameterArr[i] = parameterArr[j];
                    parameterArr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(parameterArr));
    }

    public static void insertionSortReverse(int parameterArr []) {
        for(int i=1; i<parameterArr.length; i++) {
            int current = parameterArr [i];
            int j = i-1;

            while (j >=0 && parameterArr[j] < current) {
                parameterArr[j+1] = parameterArr[j];
                j--;
            }
            parameterArr[j+1] = current;
        }

        System.out.println(Arrays.toString(parameterArr));
    }
    public static void main(String[] args) {
        int arr [] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};

        bubbleSortReverse(arr);
        SelectionSortReverse(arr);
        insertionSortReverse(arr);
    }
}
