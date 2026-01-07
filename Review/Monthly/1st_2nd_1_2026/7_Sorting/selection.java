import java.util.Arrays;

public class selection {

    public static void selectionSort(int num []) {
        for(int i=0; i<num.length; i++) {
            int smallest = i;
            for(int j= i+1; j<num.length; j++) {
                if(num[smallest] > num[j]) {
                    smallest = j;
                }
            }
            if(smallest != i) {
                int temp = num[smallest];
                num[smallest] = num[i];
                num[i] = temp;
            }
        }

        System.out.println(Arrays.toString(num));
    }
    public static void main(String[] args) {
        int num [] = {4, 3, 0, 1, 2, 5};
        selectionSort(num);
    }
}