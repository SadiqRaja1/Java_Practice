import java.util.Arrays;

public class sortingOne {
    public static void bubbleSortReverse(int parameterArr []) {
        for(int i=0; i<parameterArr.length; i++) {
            for(int j=0; j<parameterArr.length-i-1; j++) {
                if(parameterArr[j] < parameterArr[j+1]) {
                    int temp = parameterArr[j];
                    parameterArr[j] = parameterArr[j+1];
                    parameterArr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(parameterArr));
    }

    public static void selectionSortReverse(int parameterArr []) {
        for(int i= 0; i<parameterArr.length; i++) {
            int smallest = i;
            for(int j=i+1; j<parameterArr.length; j++) {
                if(parameterArr[j] > parameterArr[smallest]) {
                    smallest = j;
                }
            }
            if(parameterArr[i] != parameterArr[smallest]) {
                int temp = parameterArr[i];
                parameterArr[i] = parameterArr[smallest];
                parameterArr[smallest] = temp;
            }
        }

        System.out.println(Arrays.toString(parameterArr));
    }

    public static void insertionSortReverse(int parameterArr []) {
        for(int i=1; i<parameterArr.length; i++) {
            int current = parameterArr[i];
            int j = i-1;

            while (j>=0 && parameterArr[j] < current) {
                parameterArr[j+1] = parameterArr[j];
                j--;
            }
            parameterArr[j+1] = current;
        }

        System.out.println(Arrays.toString(parameterArr));
    }

    // public static void contingsortReverse(int parameterArr []) {
    //     int max = Integer.MIN_VALUE;

    //     for(int i=0; i<parameterArr.length; i++) {
    //         max = Math.max(max, parameterArr[i]);
    //     }
    //     int conntArr [] = new int[max+1];

    //     for(int i=0; i<parameterArr.length; i++) {
    //         conntArr[parameterArr[i]]++;
    //     }
    //     System.out.println(Arrays.toString(conntArr));

    // }



    public static void main(String[] args) {
        int arr [] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        int arr2 [] = Arrays.copyOf(arr, arr.length);
        int arr3 [] = Arrays.copyOf(arr2, arr2.length);
        int arr4 [] = Arrays.copyOf(arr3, arr3.length);

        bubbleSortReverse(arr);
        selectionSortReverse(arr2);
        insertionSortReverse(arr3);
        contingsortReverse(arr4);
    }
}
