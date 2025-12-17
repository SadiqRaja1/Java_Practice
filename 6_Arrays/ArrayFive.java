import java.util.Arrays;

public class ArrayFive {
    public static void printTriplets(int parameterArr1 []) {
        for(int i=0; i<parameterArr1.length; i++) {
            for(int j = i+1; j<parameterArr1.length; j++) {
                for(int k= j+1; k<parameterArr1.length; k++) {
                    if(parameterArr1[i] + parameterArr1[j] + parameterArr1[k] == 0) {
                        System.out.println(parameterArr1[i]+ " " + parameterArr1[j] + " "+ parameterArr1[k]);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int nums []= {-1, 0, 1, 2, -1, -4};
        int nums2 [] = {0};
        int nums3 [] = {};
        
        System.out.println(Arrays.toString(nums));
        printTriplets(nums);
        printTriplets(nums2);
        printTriplets(nums3);
    }
}