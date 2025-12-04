import java.util.Arrays;

public class ArraysTwo {

    public static void binSearch(int parameterArray [], int parameterTarget) {
        int start = 0;
        int end = parameterArray.length-1;
        int mid = (parameterArray.length-1) /2;

        System.out.println(start + " " + end + " " + mid);

        while (start < end) {
            if (parameterArray[mid] == parameterTarget) {
                System.out.println(mid);
                break;
            }
            if(parameterArray[mid] < parameterTarget) {
                start = mid;
                mid = (parameterArray.length + start) /2;
            }
            if(parameterArray[mid] > parameterTarget) {
                end = mid;
                mid = end /2;
            }
        }

    }

    public static void main(String[] args) {
        int arr1[] = {4,5,6,7,0,1,2};
        int target = 6;

        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));

        binSearch(arr1, target);
    }
}