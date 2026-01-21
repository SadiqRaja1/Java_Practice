import java.util.Arrays;

public class kthMissingPositiveNum1539 {
    public static void main(String[] args) {
        int arr [] = {2,3,4,7,11};
        int k = 5;

        int arr2 [] = {1,2,3,4};

        System.out.println(findKthNumOpti(arr, k));
        System.out.println(findKthNumOpti(arr2, 2));
    }

    public static int findKthNum(int arr [], int k) {
        int newArr [] = new int[k];
        int i=1, j=0, idx = 0;

        while (idx < k) {
            if(j<arr.length && arr[j] == i){
                j++;
                i++;
            }else{
                newArr [idx] = i;
                i++;
                idx++;
            }
            
        }

        return newArr[newArr.length-1];
    }


    public static int findKthNumOpti(int arr [], int k) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start +(end - start) /2;

            if(arr[mid] - (mid+1) < k) {
                start = mid + 1;
            }else {
                end = mid -1;
            }
        }
        return start + k;
    }
}