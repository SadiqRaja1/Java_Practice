import java.util.Arrays;

public class moveZeroes283 {

    static void moveZeroesFuction(int [] parameterNums) {
        int pointer = parameterNums.length-1;
        for(int i=0; i<parameterNums.length; i++) {
            if(parameterNums[i] == 0) {
               
                for(int j = pointer; j>=0; j--) {
                    System.out.println(pointer);
                    if(parameterNums[j] != 0) {
                        int temp = parameterNums[i];
                        parameterNums[i] = parameterNums[j];
                        parameterNums[j] = temp;
                        break;
                    }else {
                        pointer = j;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(parameterNums));
    }

    public static void main(String[] args) {
        int nums [] = {0, 1, 0, 3, 12};

        moveZeroesFuction(nums);
    }
}