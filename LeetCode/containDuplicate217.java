import java.util.HashSet;

public class containDuplicate217 {
    public static void main(String[] args) {
        int nums [] = {1,2,3,1};

        System.out.println(findDupOpti(nums));
    }

    public static boolean findDupOpti(int nums []) {
        HashSet<Integer> hash = new HashSet<>();

        for(int num: nums){
            if(hash.contains(num)) {
                return true;
            }
            hash.add(num);
        }

        return false;
    }

    public static boolean findDup (int nums []) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums) {
            set.add(num);
        }

        if(set.size() == nums.length) {
            return false;
        }

        return true;
    }
}
