import java.util.Arrays;

public class ArraysTwo {

    public static void binSearch(int parameterArray[], int parameterTarget) {
        int rotation = findStart(parameterArray);

        int start, end, mid;

        if (parameterTarget >= parameterArray[rotation] && parameterTarget <= parameterArray[parameterArray.length - 1]) {
            start = rotation;
            end = parameterArray.length - 1;
        } else {
            start = 0;
            end = rotation - 1;
        }

        mid = (start + end) / 2;

        // normal binary search
        while (start <= end) {
            if (parameterArray[mid] == parameterTarget) {
                System.out.println("Found at index: " + mid);
                return;
            }
            if (parameterArray[mid] < parameterTarget)
                start = mid + 1;
            else
                end = mid - 1;

            mid = (start + end) / 2;
        }

        System.out.println("Target not found");

    }

    public static int findStart(int parameterArray[]) {
        int start = 0;
        int end = parameterArray.length - 1;
        int mid = (start + end) / 2;

        while (start < end) {
            if (parameterArray[mid] > parameterArray[mid + 1]) {
                return mid + 1;
            }

            if (parameterArray[mid] > parameterArray[end]) {
                start = mid + 1;
                mid = (start + end) / 2;
            }

            if (parameterArray[mid] < parameterArray[end]) {
                end = mid;
                mid = (start + end) / 2;
            }

        }
        return start;
    }

    public static void main(String[] args) {
        int arr1[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 6;

        // Arrays.sort(arr1);

        // System.out.println(Arrays.toString(arr1));

        binSearch(arr1, target);
        System.out.println(findStart(arr1));
    }
}