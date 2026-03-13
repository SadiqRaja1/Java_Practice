import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter the side of the squear:");
        // int side = sc.nextInt();

        // sc.close();

        // System.out.println("Area of the suquare is: "+ Math.pow(side, 2));

        int nums [] = {1,2,3,3};

        System.out.println(hasDuplicate(nums));

    }

    public static boolean hasDuplicate(int[] nums) {
       HashSet<Integer> h = new HashSet<Integer>();

       for(int num : nums) {
            h.add(num);
       }

       if(h.size() != nums.length) {
        return true;
       }

       return false;
    }
}
