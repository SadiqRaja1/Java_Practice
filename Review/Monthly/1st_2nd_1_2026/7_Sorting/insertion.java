import java.util.Arrays;

public class insertion {

    public static void insertionSort(int num []) {
        for(int  i=1; i<num.length; i++) {
            int current = num[i];
            int j = i-1;

            while(j >= 0 && current < num[j]) {
                num[j+1] = num[j];
                j--;
            }

            num[j+1] = current;
        }
        System.out.println(Arrays.toString(num));
    }
    public static void main(String[] args) {
        int num [] = {4, 3, 0, 1, 2, 5};
        insertionSort(num);
    }
}