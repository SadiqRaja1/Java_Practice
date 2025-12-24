import java.util.Arrays;

public class counting {

    public static void countingSort (int parameterArr [], int parameterK) {
        int countArr []= new int [parameterK+1];
        for(int i=0; i<parameterArr.length; i++) {
            countArr[parameterArr[i]] = countArr[parameterArr[i]]+1;
        }

        int count = 0;
        for(int i=0; i<countArr.length; i++) {
            while(countArr[i] > 0) {
                parameterArr[count] = i;
                count ++;
                countArr[i]--;
            }
        }

        System.out.println(Arrays.toString(parameterArr));
    }
    public static void main(String[] args) {
        int arr [] = {5,4,2,0,3};
        int k = 5;

        int arr2 [] = {5,5,5,5,3,3,3,3,6,6,6,6,7,7,7};
        int k2 = 7;

        countingSort(arr, k);
        countingSort(arr2, k2);
    }
}