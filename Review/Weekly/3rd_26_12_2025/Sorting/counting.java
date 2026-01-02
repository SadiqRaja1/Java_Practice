import java.util.Arrays;

public class counting {

    public static void countingSort(int parameterArr []) {
        int max = 0;

        for(int i=0; i<parameterArr.length; i++) {
            max = max > parameterArr[i]? max : parameterArr[i];
        }
        int countArr [] = new int [max+1];

        for(int i =0; i<parameterArr.length; i++) {
            countArr[parameterArr[i]]++;
        }

        int count = 0;

        for(int i=0; i<countArr.length; i++) {
            while (countArr[i] > 0) {
                parameterArr[count] = i;
                countArr[i]--;
                count++;
            }
        }

        System.out.println(Arrays.toString(parameterArr));
    }
    public static void main(String[] args) {
        int arr [] = {5, 4, 1, 3, 2, 2};

        countingSort(arr);
    }
}
