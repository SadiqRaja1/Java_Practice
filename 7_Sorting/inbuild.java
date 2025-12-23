import java.util.Arrays;
import java.util.Collections;

public class inbuild {
    public static void main(String[] args) {
        int nums [] = {5,4,1,2,3};

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        int nums2 []= {7,6,9,3,1,9,0};

        Arrays.sort(nums2, 0,2);

        System.out.println(Arrays.toString(nums2));
    }
}
