import java.util.Arrays;

public class medianOfTwoSortedArray4 {
    public static void main(String[] args) {
        int nums1 [] = {1,2};
        int nums2 [] = {3,4};

        System.out.println(findmedian(nums1, nums2));
    }

    public static double findmedian(int nums1 [], int nums2 []) {
        int mergedArray [] = new int[nums1.length + nums2.length];

        int indx = 0;
        for(int i=0; i<nums1.length; i++){
            mergedArray[indx] = nums1[i];
            indx++;
        }

        for(int i=0; i<nums2.length; i++) {
            mergedArray[indx] = nums2[i];
            indx++;
        }

        Arrays.sort(mergedArray);

        int a = mergedArray.length;
        if(a % 2 != 0) {
            return(double) mergedArray[a/2];
        }else{
            int x = mergedArray[a/2];
            int y = mergedArray[a/2-1];
            return (double)(x+y)/2;
        }
    }
    
}
