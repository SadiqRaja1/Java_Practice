import java.util.HashSet;

public class containDuplicate217 {
    public static void main(String[] args) {
        int nums [] = {1,2,3,1};

        System.out.println(findDup(nums));
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
