import java.util.Arrays;

public class bubble {

    public static void main(String[] args) {
        int num [] = {4,6,1,6,7,6,2,0};

        bubbleSort(num);
        System.out.println(Arrays.toString(num));
    }

    public static void bubbleSort(int num []) {
        for(int i=0; i<num.length; i++) {
            for(int j= 0; j<num.length-1; j++) {
                if(num[j] > num[j+1]) {
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
    }
}