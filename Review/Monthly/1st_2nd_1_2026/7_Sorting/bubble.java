import java.util.Arrays;

public class bubble {

    public static void bubbleSort (int num []) {
        for(int i=0; i<num.length; i++) {
            for(int j=0; j<num.length-i-1; j++) {
                if(num[j] > num [j+1]) {
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(num));
    }
    public static void main(String[] args) {
        int num [] = {4, 3, 0, 1, 2, 5};
        bubbleSort(num);
    }
}