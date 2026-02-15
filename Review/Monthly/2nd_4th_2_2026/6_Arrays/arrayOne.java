import java.util.HashSet;

public class arrayOne {

    public static void main(String[] args) {
        int nums [] = {1,2,3,1};

        int nums1 [] = {1,2,3,4};

        int nums2 [] = {1,1,1,3,3,4,3,2,4,2};
 
        System.out.println(checkDup(nums));
        System.out.println(checkDup(nums1));
        System.out.println(checkDup(nums2));
    }

    public static boolean checkDup(int nums []) {
        HashSet<Integer> h = new HashSet<>();

        for(int num : nums) {
            h.add(num);
        }

        return h.size() != nums.length;
    }
}