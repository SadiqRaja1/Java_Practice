public class ArraysTwo {

    public static int findStart(int parameterNums[]) {
        int start = 0;
        int end = parameterNums.length - 1;
        int mid = (start + end) / 2;

        while (start < end) {
            if (parameterNums[mid] > parameterNums[mid + 1]) {
                return mid + 1;
            }
            if (parameterNums[mid] < parameterNums[end]) {
                end = mid;
                mid = (start + end) / 2;
            }
            if (parameterNums[mid] > parameterNums[end]) {
                start = mid + 1;
                mid = (start + end) / 2;
            }

        }
        return start;
    }

    public static int binarySearch(int parameterNums[], int startingIndex, int endingIndex, int parameterTarget) {
        int mid = (startingIndex + endingIndex) / 2;

        while (startingIndex <= endingIndex) {
            if (parameterNums[mid] == parameterTarget) {
                return mid;
            } else if (parameterNums[mid] > parameterTarget) {
                endingIndex = mid-1;
                mid = (startingIndex + endingIndex) / 2;
            } else {
                startingIndex = mid+1;
                mid = (startingIndex + endingIndex) / 2;
            }
        }
        return -1;
    }

    public static int findTarget(int parameterNums[], int parameterTarget) {
        if(parameterNums.length < 1) {
            return -1;
        }
        if (parameterNums.length == 1) {
            if (parameterNums[0] == parameterTarget) {
                return 0;
            } else {
                return -1;
            }
        }
        int startingIndex = findStart(parameterNums);

        if (parameterTarget <= parameterNums[parameterNums.length - 1]) {
            return binarySearch(parameterNums, startingIndex, parameterNums.length - 1, parameterTarget);
        } else {
            return binarySearch(parameterNums, 0, startingIndex-1, parameterTarget);
        }
    }

    public static void main(String[] args) {
        int nums[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;

        int nums2[] = {2,3,4,5,0};

        System.out.println(findTarget(nums2, target));
        System.out.println(findTarget(nums, target));

    }
}