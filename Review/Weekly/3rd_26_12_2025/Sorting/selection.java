import java.util.*;
public class selection {

    public static void selectionSort(int parameterArr []) {
        for(int i=0; i<parameterArr.length; i++) {
            int smallest = i;
            for(int j=i+1; j<parameterArr.length; j++) {
                if(parameterArr[j] < parameterArr[smallest]) {
                    smallest = j;
                }
            }
            if (parameterArr[i] != parameterArr[smallest]) {
                int temp = parameterArr[i];
                parameterArr[i] = parameterArr[smallest];
                parameterArr[smallest] = temp;
            }
        }
        System.out.println(Arrays.toString(parameterArr));
    }
    public static void main(String[] args) {
        int arr [] = {5, 4, 1, 3, 2};
        selectionSort(arr);
    }
}