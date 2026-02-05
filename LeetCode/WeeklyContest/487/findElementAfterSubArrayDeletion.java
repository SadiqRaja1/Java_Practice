import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class findElementAfterSubArrayDeletion {
    public static void main(String[] args) {
        int arr [] = {11,4,5}; 
        System.out.println(find(arr));
    }

    public static int find(int arr []) {
        int helperArr[] = arr;

        Arrays.sort(helperArr);

        int start = 0;
        int end = helperArr.length-1;

        boolean alice = true, bob = true;
        while (start < end) {
            if(alice){
                start++;
                alice = false;
            }
            if(bob){
                end--;
                bob = false;
            }
            alice = true;
            bob = true;
        }
        return helperArr[start];
    }
}
