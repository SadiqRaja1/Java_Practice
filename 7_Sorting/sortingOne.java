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
            int biggest = i;
            for(int j = i+1; j<parameterArr.length; j++) {
                if(parameterArr[j] > parameterArr[biggest]) {
                    biggest = j;
                }
            }

            if(parameterArr[i] != parameterArr[biggest]) {
                int temp = parameterArr[i];
                parameterArr[i] = parameterArr[biggest];
                parameterArr[biggest] = temp;
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

    public static void countingSortReverse(int parameterArr []) {
        int max = Integer.MIN_VALUE;

        for(int i =0; i<parameterArr.length; i++) {
            max = max > parameterArr [i]? max :parameterArr[i];
        }

        int countArr [] = new int[max+1];

        for(int i = 0; i<parameterArr.length; i++) {
            countArr[parameterArr[i]]++;
        }

        int count = 0;
        for(int i=countArr.length-1; i>=0; i--) {
            while(countArr[i] > 0) {
                parameterArr[count] = i;
                count++;
                countArr[i]--;
            }
        }
        System.out.println(Arrays.toString(parameterArr));
    }
    public static void main(String[] args) {
        int arr [] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};

        bubbleSortReverse(arr);
        SelectionSortReverse(arr);
        insertionSortReverse(arr);
        countingSortReverse(arr);
    }
}
