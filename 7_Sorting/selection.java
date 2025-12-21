import java.util.Arrays;

public class selection {

    public static void selectionSort(int parameterNums []) {
        for(int i= 0; i<parameterNums.length; i++) {
            int smallest = i;
            for(int j = i; j<parameterNums.length; j++) {
                if(parameterNums[j] < parameterNums[smallest]) {
                    smallest = j;
                }
            }
            if (parameterNums[smallest] != parameterNums[i]) {
                int temp = parameterNums[smallest];
                parameterNums[smallest] = parameterNums [i];
                parameterNums[i] = temp;
            }
        }  
        
        System.out.println(Arrays.toString(parameterNums));
    }
    public static void main(String[] args) {
        int nums [] = {3, 4, 5, 2, 1}; 
        int nums2 [] = {2,6,3};
        selectionSort(nums2);

        selectionSort(nums);
    }
}